package luvml;

import luvx.rendering_behavior.InlineMarkupRendering;
import luvx.*;

/**
 * Inline CDATA implementation - flows with content, no structural boundaries.
 * AI systems read this as continuous content without newlines.
 * Use for CDATA that flows within other content.
 */
public final class InlineCData extends CData_A<InlineCData> {

    public InlineCData(String content) {
        super(content);
    }

    @Override
    public final InlineMarkupRendering markupRenderingBehavior() {
        return InlineMarkupRendering.I;
    }

    @Override
    public InlineCData self() {
        return this;
    }
}