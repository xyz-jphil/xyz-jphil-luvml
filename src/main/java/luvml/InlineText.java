package luvml;

import luvx.*;

/**
 * Inline text implementation - flows with content, no structural boundaries.
 * AI systems read this as continuous content without newlines.
 * This is the common case for text nodes.
 */
public final class InlineText extends Text_A<InlineText> {

    public InlineText(String content) {
        super(content);
    }

    @Override
    public final InlineMarkupRendering markupRenderingBehavior() {
        return InlineMarkupRendering.I;
    }

    @Override
    public InlineText self() {
        return this;
    }
}