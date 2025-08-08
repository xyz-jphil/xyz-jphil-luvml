package luvml;

import luvx.*;

/**
 * Inline comment implementation - flows with content, no structural boundaries.
 * AI systems read this as continuous content without newlines.
 * This is the common case for comment nodes.
 */
public final class InlineComment extends Comment_A<InlineComment> {

    public InlineComment(String content) {
        super(content);
    }

    @Override
    public final InlineMarkupRendering markupRenderingBehavior() {
        return InlineMarkupRendering.I;
    }

    @Override
    public InlineComment self() {
        return this;
    }
}