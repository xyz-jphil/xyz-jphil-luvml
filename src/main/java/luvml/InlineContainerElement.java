package luvml;

import luvx.*;
import luvx.ftype.*;

/**
 * Inline container element - flows with content, no structural boundaries.
 * AI systems read this as continuous content without newlines.
 * Used for HTML phrasing elements like span, em, strong, a, code, etc.
 */
public final class InlineContainerElement extends ContainerElement_A<InlineContainerElement> {
    
    public InlineContainerElement(String tagName) {
        super(tagName);
    }
    
    @Override
    public InlineContainerElement self() {
        return this;
    }
    
    @Override
    public final InlineMarkupRendering markupRenderingBehavior() {
        return InlineMarkupRendering.I;
    }
}