# LuvML Renderer - Design & Implementation Proposal

**Author:** Gemini
**Date:** 2025-07-27
**Status:** Proposed

## 1. Core Philosophy & Design Goals

This document outlines a plan to create a rendering engine for the LuvX/LuvML object model. The design is guided by the following core principles, derived from the existing project architecture and user feedback:

*   **Decoupling (Visitor Pattern):** The rendering logic will be entirely separate from the `Frag_I` data model. The model will remain "unaware" of how it is rendered.
*   **Functional Traversal:** The rendering engine will exclusively use `switch` expressions on the type-discriminator methods (`fragType()`, `nodeType()`, etc.) for traversing the object tree. This ensures type safety and avoids `if/instanceof` chains.
*   **Fluent & Concise API:** The output stream abstraction will use short, chainable methods (`__`, `_c`, `_t`) to create a readable "mini-DSL" for generating markup, as established in `luvml-1.3`.
*   **Configurable Output:** The renderer will be configurable to produce different output styles, specifically HTML5 vs. XHTML, and to enable/disable pretty-printing with indentation.
*   **Stream-Based (No Concatenation):** The engine will write directly to an abstract output stream (`Out_I`), avoiding intermediate string concatenation for maximum performance and memory efficiency.

## 2. Proposed File Structure

All new components will reside in a new `luvml.o` package to keep them organized and separate from the core DSL model.

```
xyz-jphil-luvml/
└── src/
    └── main/
        └── java/
            └── luvml/
                └── o/
                    ├── Cfg.java
                    ├── Engine.java      (package-private)
                    ├── Out_I.java
                    ├── StringBuilderOut.java
                    └── WriterOut.java
```

## 3. Component Implementation Details

### 3.1. `Out_I.java` - The Output Interface

This is the core abstraction for the output destination.

```java
package luvml.o;

import java.io.IOException;

/**
 * A fluent, chainable interface for writing rendered output.
 * This abstraction allows the rendering engine to target any destination
 * (StringBuilder, Writer, OutputStream, etc.) without changing its logic.
 * The short method names are designed for creating a readable mini-DSL.
 */
public interface Out_I {
    /** Appends a character sequence. */
    Out_I __(CharSequence s) throws IOException;

    /** Appends a single character. */
    Out_I _c(char c) throws IOException;

    /** Appends a newline character. */
    Out_I _n() throws IOException;

    /** Appends a newline and then indents to the current level. */
    Out_I _t() throws IOException;

    /** Increases the indentation level for subsequent lines. */
    Out_I tab();

    /** Decreases the indentation level for subsequent lines. */
    Out_I untab();
}
```

### 3.2. `Cfg.java` - The Configuration Object

A simple, immutable class to control rendering behavior.

```java
package luvml.o;

/**
 * Immutable configuration for the HtmlRenderer.
 * Use the static builder to construct an instance.
 */
public final class Cfg {
    public final boolean xhtml;
    public final boolean pretty;
    public final String indent;

    private Cfg(Builder builder) {
        this.xhtml = builder.xhtml;
        this.pretty = builder.pretty;
        this.indent = builder.indent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private boolean xhtml = false;
        private boolean pretty = false;
        private String indent = "  "; // Default to 2 spaces

        public Builder xhtml(boolean isXhtml) {
            this.xhtml = isXhtml;
            return this;
        }

        public Builder pretty(boolean isPretty) {
            this.pretty = isPretty;
            return this;
        }

        public Builder indent(String indentString) {
            this.indent = indentString;
            return this;
        }

        public Cfg build() {
            return new Cfg(this);
        }
    }
}
```

### 3.3. `Engine.java` - The Rendering Visitor (Package-Private)

This is the core rendering logic. It is kept internal to the package.

```java
package luvml.o;

import luvx.Element_I;
import luvx.Frag_I;
import luvx.Node_I;
import luvx.ftype.*;

import java.io.IOException;
import java.util.Map;

/**
 * The internal rendering engine (Visitor) that traverses the Frag_I tree.
 */
final class Engine {
    private final Cfg cfg;
    private final Out_I out;

    Engine(Cfg cfg, Out_I out) {
        this.cfg = cfg;
        this.out = out;
    }

    void render(Frag_I<?> frag) throws IOException {
        switch (frag.fragType()) {
            case Attr_T a -> { /* Attributes are handled by their parent element */ }
            case Node_T n -> renderNode(n.node());
        }
    }

    private void renderNode(Node_I<?> node) throws IOException {
        switch (node.nodeType()) {
            case Element_T e -> renderElement(e.element());
            case AttributelessNode_T an -> {
                switch (an.attributelessNodeType()) {
                    case Text_T t -> out.__(escape(t.text().textContent()));
                    case Comment_T c -> out.__("<!--").__(c.comment().textContent()).__("-->");
                    case CData_T cd -> out.__("<![CDATA[").__(cd.cdata().textContent()).__("[]]>");
                    case Doctype_T d -> out.__(d.doctype().toDeclaration());
                }
            }
        }
    }

    private void renderElement(Element_I<?> element) throws IOException {
        if (cfg.pretty) { out._t(); }
        out._c('<').__(element.tagName());

        for (Map.Entry<String, String> attr : element.attributes().entrySet()) {
            out._c(' ').__(attr.getKey()).__("=\"").__(escape(attr.getValue())).__("\"");
        }

        switch (element.elementType()) {
            case SelfClosingElement_T sc -> {
                out.__(cfg.xhtml ? " />" : ">");
            }
            case ContainerElement_T c -> {
                out.__(">");
                if (!c.containerElement().childNodes().isEmpty()) {
                    if (cfg.pretty) { out.tab()._n(); }
                    for (Node_I<?> child : c.containerElement().childNodes()) {
                        render(child);
                    }
                    if (cfg.pretty) { out.untab()._t(); }
                }
                out.__("</").__(element.tagName()).__(">");
            }
        }
    }
    
    private String escape(String text) {
        if (text == null) return "";
        return text.replace("&", "&amp;")
                   .replace("<", "&lt;")
                   .replace(">", "&gt;")
                   .replace("\"", "&quot;");
    }
}
```

### 3.4. `StringBuilderOut.java` and `WriterOut.java`

These are the concrete implementations of `Out_I` and are straightforward wrappers.

```java
// Example: StringBuilderOut.java
package luvml.o;

import java.io.IOException;

final class StringBuilderOut implements Out_I {
    private final StringBuilder sb;
    private final Cfg cfg;
    private int indentLevel = 0;

    StringBuilderOut(StringBuilder sb, Cfg cfg) { this.sb = sb; this.cfg = cfg; }

    @Override public Out_I __(CharSequence s) { sb.append(s); return this; }
    @Override public Out_I _c(char c) { sb.append(c); return this; }
    @Override public Out_I _n() { if (cfg.pretty) sb.append(System.lineSeparator()); return this; }
    @Override public Out_I _t() throws IOException { _n(); for(int i=0; i<indentLevel; i++) { __(cfg.indent); } return this; }
    @Override public Out_I tab() { indentLevel++; return this; }
    @Override public Out_I untab() { indentLevel--; return this; }
}
```

## 4. Future Public API (`O.java`)

While not being implemented immediately, this is how the final public API would look, providing a clean entry point for users.

```java
package luvml;

import luvml.o.Cfg;
import luvml.o.Engine;
import luvml.o.StringBuilderOut;
import luvx.Frag_I;
import java.io.Writer;

public final class O { // 'O' for Output
    private O() {}

    public static String string(Frag_I<?> frag) {
        return string(frag, Cfg.builder().build());
    }

    public static String string(Frag_I<?> frag, Cfg cfg) {
        StringBuilder sb = new StringBuilder();
        try {
            new Engine(cfg, new StringBuilderOut(sb, cfg)).render(frag);
        } catch (java.io.IOException e) {
            // Should never happen with StringBuilder
            throw new RuntimeException(e);
        }
        return sb.toString();
    }
    
    // ... other methods for Writer, OutputStream etc.
}
```