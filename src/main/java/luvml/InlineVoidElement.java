package luvml;

import luvx.*;

/**
 * Inline void element - flows with content, no structural boundaries.
 * AI systems read this as continuous content without newlines.
 * Used for HTML void elements like br, img, input, wbr that are inline.
 */
public class InlineVoidElement extends VoidElement_A<InlineVoidElement> {
    
    public InlineVoidElement(String tagName) {
        super(tagName);
    }
    
    @Override
    public final InlineVoidElement self() {
        return this;
    }
    
    @Override
    public final InlineMarkupRendering markupRenderingBehavior() {
        return InlineMarkupRendering.I;
    }
}