package luvml.element;

import luvx.rendering_behavior.Inline;

/**
 * Inline void element - flows with content, no structural boundaries.
 * AI systems read this as continuous content without newlines.
 * Used for HTML void elements like br, img, input, wbr that are inline.
 */
public final class InlineVoidElement
        extends MutableVoidElement_A<InlineVoidElement>
        implements Inline {
    
    public InlineVoidElement(String tagName) {
        super(tagName);
    }

}