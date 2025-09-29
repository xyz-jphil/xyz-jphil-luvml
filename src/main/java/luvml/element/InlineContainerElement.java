package luvml.element;

import luvx.rendering_behavior.InlineMarkupRendering;
import luvx.rendering_behavior.Inline;

/**
 * Inline container element - flows with content, no structural boundaries.
 * AI systems read this as continuous content without newlines.
 * Used for HTML phrasing elements like span, em, strong, a, code, etc.
 */
public final class InlineContainerElement
        extends MutableContainerElement_A<InlineContainerElement>
        implements Inline {
    
    public InlineContainerElement(String tagName) {
        super(tagName);
    }
    
}