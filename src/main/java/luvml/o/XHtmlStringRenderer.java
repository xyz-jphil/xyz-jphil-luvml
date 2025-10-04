package luvml.o;

import java.util.Map.Entry;
import luvx.*;
import luvx.ftype.*;
import java.util.Set;
import luvml.LineBreak;
import luvx.composable.HasAttributes;
import luvx.composable.HasTagName;

/**
 * Simple XHTML renderer optimized for semantic documents.
 * Key feature: Paragraphs and headings render content inline for AI token efficiency.
 * Structural elements like section, div maintain block formatting.
 */
public class XHtmlStringRenderer {
    
    /**
     * Renders Frag_I tree to compact string (no extra whitespace).
     */
    public static String asSingleLine(Frag_I<?> frag) {
        var sb = new StringBuilder();
        renderFrag(frag, sb, false, 0,"");
        return sb.toString();
    }

    public static String asFormatted(Frag_I<?> frag) {
        return asFormatted(frag," ");//instead of tab just a space.
    }
    
    /**
     * Renders Frag_I tree to formatted string with optimized paragraph rendering.
     */
    public static String asFormatted(Frag_I<?> frag, String tabStr) {
        var sb = new StringBuilder();
        renderFrag(frag, sb, true, 0, tabStr);
        return sb.toString();
    }

    private static void renderFrag(Frag_I<?> frag, StringBuilder sb, boolean formatted, int indent, String tabStr) {
        switch (frag.fragType()) {
            case Node_T n -> renderNode(n.node(), sb, formatted, indent,tabStr);
            case Frags_T fs -> {
                for (var childFrag : fs.frags().fragments()) {
                    renderFrag((Frag_I<?>)childFrag, sb, formatted, indent,tabStr);
                }
            }
            case Attr_T attrType -> {
                // Attributes are handled by their parent elements, skip
            }
        }
    }

    private static MarkupRenderingState renderNode(Node_I<?> node, StringBuilder sb, boolean formatted, int indent, String tabStr) {
        return switch (node.nodeType()) {
            case AttributelessNode_T an -> 
                renderAttributelessNode(an.attributelessNode(), sb, formatted, indent, tabStr);
            case Element_T e -> 
                renderElement(e.element(), sb, formatted, indent, tabStr);
        };
    }

    private static MarkupRenderingState renderElement(Element_I<?> element, StringBuilder sb, boolean formatted, int indent, String tabStr) {
        var tagName = element.tagName();
        var inline = element.markupRenderingBehavior().isInline();
        var selfRenderingState = new MarkupRenderingState(0);
        if (formatted && !inline ) {
            selfRenderingState.incrementBlockCount();
            if(!(element instanceof ProcessingInstruction_I))sb.append("\n");
            addIndent(sb, indent, tabStr);
        }
        renderTagOpening(element, sb);
        switch (element.elementType()) {
            case SelfClosingElement_T selfClosingType -> {
                switch (selfClosingType.selfClosingElementType()) {
                    case VoidElement_T v -> {
                        renderAttributes(element, sb);
                        sb.append("/>"); //omitted space before /> as un-needed
                    }
                    case ProcessingInstruction_T piType -> {
                        sb.append(' ').append(piType.processingInstruction().data()).append("?>");
                        if (formatted) sb.append('\n'); // this is a unique case
                    }
                }

            }
            case RawTextElement_T rt -> {
                // RAW_TEXT: style, script - content is NOT escaped
                renderAttributes(element, sb);
                sb.append('>');
                sb.append(rt.rawTextElement().rawTextContent()); // NO escaping
                sb.append("</").append(tagName).append('>');
            }
            case EscapableRawTextElement_T ert -> {
                // ESCAPABLE_RAW_TEXT: title, textarea - content IS escaped
                renderAttributes(element, sb);
                sb.append('>');
                sb.append(escapeText(ert.escapableRawTextElement().escapableTextContent())); // WITH escaping
                sb.append("</").append(tagName).append('>');
            }
            case ContainerElement_T ce -> {
                renderAttributes(element, sb);
                sb.append('>');//notice difference with self-closing/void-element
                
                var container = ce.containerElement();
                if (container.hasChildNodes()) {
                    //if (formatted) sb.append('\n'); //this should not be done, because if the child nodes are inline, then they should immediately start not in new line so the child rendering logic should be done by child, not here
                    for (var child : container.childNodes()) {
                        var r = renderNode((Node_I<?>)child, sb, formatted, indent + 1, tabStr);
                        selfRenderingState.addFromChild(r);
                    }
                    
                }
                if (formatted && selfRenderingState.count()>1) {
                    sb.append("\n");
                    // add indentation if and only if even one child is block type
                    addIndent(sb, indent, tabStr);
                }
                sb.append("</").append(tagName).append('>');// Closing tag
            }
        }
        //if (formatted && !inline) sb.append('\n');
        return selfRenderingState;
    }

    private static MarkupRenderingState renderAttributelessNode(AttributelessNode_I<?> node, StringBuilder sb, boolean formatted, int indent, String tabStr) {
        switch (node.attributelessNodeType()) {
            case StringNode_T stringNodeType -> {
                switch (stringNodeType.stringNodeType()) {
                    case Text_T textType -> {
                        var txt = textType.obj();
                        if(txt instanceof LineBreak lb){
                            sb.append(lb.textContent()); 
                            addIndent(sb, indent, tabStr);
                        }else {
                            sb.append(escapeText(txt.textContent()));
                        }
                    }
                    case Comment_T commentType -> {
                        sb.append("<!--").append(commentType.comment().textContent()).append("-->");
                    }
                    case CData_T cdataType -> {
                        sb.append("<![CDATA[").append(cdataType.cdata().textContent()).append("]]>");
                    }
                }
            }
            case Doctype_T doctypeType -> {
                var doctype = doctypeType.doctype();
                sb.append("<!DOCTYPE ").append(doctype.name());
                if (doctype.publicId() != null && !doctype.publicId().isEmpty()) {
                    sb.append(" PUBLIC \"").append(doctype.publicId()).append('"');
                }
                if (doctype.systemId() != null && !doctype.systemId().isEmpty()) {
                    sb.append(" \"").append(doctype.systemId()).append('"');
                }
                sb.append('>');
            }
        }
        return MarkupRenderingState.of(node);
    }
    
    private static void renderTagOpening(HasTagName a, StringBuilder sb) {
        sb.append('<');
        // Processing instruction - special handling
        if(a instanceof ProcessingInstruction_I)
            sb.append('?');
        sb.append(a.tagName());
    }
    
    private static void renderAttributes(HasAttributes a, StringBuilder sb) {
        for (var attr : (Set<Entry<String,String>>)a.attributes().entrySet()) {
            sb.append(' ').append(attr.getKey()).append("=\"").append(escapeAttribute(attr.getValue())).append('"');
        }
    }

    private static void addIndent(StringBuilder sb, int indent, String tabStr) {
        for (int i = 0; i < indent; i++) {
            sb.append(tabStr);
        }
    }

    private static String escapeText(String text) {
        if(text==null)return text;
        return text.replace("&", "&amp;")
                  .replace("<", "&lt;")
                  .replace(">", "&gt;");
    }

    private static String escapeAttribute(String attr) {
        if(attr==null)return attr;
        return attr.replace("&", "&amp;")
                  .replace("<", "&lt;")
                  .replace(">", "&gt;")
                  .replace("\"", "&quot;")
                  .replace("'", "&#39;");
    }
}