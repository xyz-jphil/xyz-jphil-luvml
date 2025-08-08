package luvml.o;

import luvx.Frag_I;
import luvx.Node_I;
import luvx.Element_I;
import luvx.ftype.*;

import java.io.Writer;
import java.util.Map;
import luvx.Doctype_I;

/**
 * External HTML/XML renderer for Frag_I trees.
 * Uses type-safe traversal with zero-copy streaming output.
 * 
 * TODO: Future improvements for content validation:
 * - Need to follow conventions. Inline elements, phrasing elements, void elements, block elements, where newline and indentation needs to be increased and where not. 
 * - Add RenderConfig flags: autoFixCData, autoFixComments, escapeUnicode
 * - CDATA auto-fix: split "content]]>more" into "content]]]]><![CDATA[>more" 
 * - Comment auto-fix: escape "-->" sequences in comment content
 * - Unicode escaping: convert non-ASCII chars to numeric entities for non-UTF8 output
 */
public class HtmlRenderer {

    /**
     * Renders Frag_I tree to string with default configuration.
     */
    public static String asString(Frag_I<?> frag) {
        var out = new StringBuilderOut();
        render(frag, out);
        return out.render();
    }

    /**
     * Renders Frag_I tree to formatted string.
     */
    public static String asFormattedString(Frag_I<?> frag) {
        var out = new StringBuilderOut(Out_A.formatted());
        render(frag, out);
        return out.render();
    }

    /**
     * Renders Frag_I tree to Writer with custom configuration.
     */
    public static void toWriter(Frag_I<?> frag, Writer writer, RenderConfig config) {
        var out = new WriterOut(writer, builder -> builder
            .xhtmlMode(config.xhtmlMode)
            .outputFormat(config.outputFormat)
            .currentIndent(config.currentIndent));
        render(frag, out);
        out.flush();
    }

    /**
     * Core rendering method using external traversal.
     */
    public static void render(Frag_I<?> frag, Out_I out) {
        switch (frag.fragType()) {
            case Attr_T a -> {
                // Attributes are handled by their parent element
            }
            case Node_T n -> renderNode(n.node(), out);
            case Frags_T f -> {
                // Render each fragment in the collection
                for (var fragment : f.frags().fragments()) {
                    render((Frag_I/*casting due to generic erasure*/)fragment, out);
                }
            }
        }
    }

    private static void renderNode(Node_I<?> node, Out_I out) {
        switch (node.nodeType()) {
            case Element_T e -> renderElement(e.element(), out);
            case AttributelessNode_T an -> renderAttributelessNode(an, out);
        }
    }

    private static void renderElement(Element_I<?> element, Out_I out) {
        // Handle ProcessingInstruction special case
        if (element instanceof luvx.ProcessingInstruction_I<?>) {
            out.__("<?").__(element.tagName());
        } else {
            out._c('<').__(element.tagName());
        }

        // Render attributes (skip for ProcessingInstructions - they handle their own data)
        if (!(element instanceof luvx.ProcessingInstruction_I<?>)) {
            Map<String, String> attributes = element.attributes();
            for (Map.Entry<String, String> attr : attributes.entrySet()) {
                out._c(' ').__(attr.getKey()).__("=\"").__(escapeAttributeValue(attr.getValue())).__("\"");
            }
        }
        
        

        switch (element.elementType()) {
            case SelfClosingElement_T sc -> {
                    switch (sc.selfClosingElementType()) {
                    case VoidElement_T ve -> {
                        out.__(out.renderConfig().isXhtmlMode() ? " />" : ">");
                    }
                    case ProcessingInstruction_T pi -> {
                        out._c(' ').__(pi.processingInstruction().data()).__("?>");
                    }
                }
            }
            case ContainerElement_T c -> {
                out.__(">");
                if (c.containerElement().hasChildNodes()) {
                    // AI-OPTIMIZED: Use MarkupRenderingBehavior instead of primitive child count heuristics
                    switch (element.markupRenderingBehavior()) {
                        case luvx.InlineMarkupRendering inline -> {
                            // AI reads as continuous content - no structural boundaries
                            for (var child : c.containerElement().childNodes()) {
                                renderNode((luvx.Node_I)child, out);
                            }
                        }
                        case luvx.BlockMarkupRendering block -> {
                            // AI sees clear structural boundaries with newlines
                            var childOut = out.child();
                            childOut.nL();
                            var childNodes = c.containerElement().childNodes();
                            for (int i = 0; i < childNodes.size(); i++) {
                                if (i > 0) {
                                    childOut.nL(); // Add newline between child elements
                                }
                                renderNode((luvx.Node_I)childNodes.get(i), childOut);
                            }
                            out.nL();
                        }
                    }
                }
                out.__("</").__(element.tagName()).__(">");
            }
        }
    }

    private static void renderAttributelessNode(AttributelessNode_T an, Out_I out) {
        // Get the underlying node to access MarkupRenderingBehavior
        var node = an.attributelessNode();
        
        // AI-OPTIMIZED: Use MarkupRenderingBehavior for consistent rendering decisions
        switch (node.markupRenderingBehavior()) {
            case luvx.InlineMarkupRendering inline -> {
                // Inline rendering - no newlines, continuous flow
                renderAttributelessNodeContent(an, out);
            }
            case luvx.BlockMarkupRendering block -> {
                // Block rendering - newlines for AI structural boundaries
                out.nL();
                renderAttributelessNodeContent(an, out);
                out.nL();
            }
        }
    }
    
    private static void renderAttributelessNodeContent(AttributelessNode_T an, Out_I out) {
        switch (an.attributelessNodeType()) {
            case StringNode_T s -> {
                switch (s.stringNodeType()) {
                    case Text_T t -> out.__(escapeTextContent(t.text().textContent()));
                    case Comment_T c -> {
                        String content = c.comment().textContent();
                        validateCommentContent(content);
                        out.__("<!--").__(content).__("-->");
                    }
                    case CData_T cd -> {
                        String content = cd.cdata().textContent();
                        validateCDataContent(content);
                        out.__("<![CDATA[").__(content).__("]]>");
                    }
                }
            }
            case Doctype_T d -> renderDoctype(d.doctype(), out);
        }
    }

    private static String escapeTextContent(String text) {
        if (text == null) return "";
        // TODO: Add unicode escaping option for non-UTF8 output
        return text.replace("&", "&amp;")
                   .replace("<", "&lt;")
                   .replace(">", "&gt;");
    }

    private static String escapeAttributeValue(String value) {
        if (value == null) return "";
        return value.replace("&", "&amp;")
                    .replace("<", "&lt;")
                    .replace(">", "&gt;")
                    .replace("\"", "&quot;");
    }

    private static void validateCommentContent(String content) {
        if (content != null && content.contains("-->")) {
            // TODO: Add autoFixComments option to escape rather than throw
            throw new IllegalArgumentException("Comment content cannot contain '-->'");
        }
    }

    private static void validateCDataContent(String content) {
        if (content != null && content.contains("]]>")) {
            // TODO: Add autoFixCData option to split CDATA sections rather than throw
            throw new IllegalArgumentException("CDATA content cannot contain ']]>'");
        }
    }
    
    private static void renderDoctype(Doctype_I<?> doctype, Out_I out) {
        out.__("<!DOCTYPE ").__(doctype.name());
        if (doctype.publicId() != null) {
            out.__(" PUBLIC \"").__(doctype.publicId()).__("\" \"").__(doctype.systemId()).__("\">");
        } else if (doctype.systemId() != null) {
            out.__(" SYSTEM \"").__(doctype.systemId()).__("\">");
        } else {
            out.__(">");
        }
    }
}