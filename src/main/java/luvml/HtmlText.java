package luvml;

import luvx.rendering_behavior.InlineMarkupRendering;
import luvx.*;

/**
 * Simple text node implementation.
 */
public final class HtmlText implements Text_I<HtmlText> {

    private final String wholeTextContent;

    public HtmlText(String textContent) {
        this.wholeTextContent = textContent;
    }

    @Override
    public HtmlText self() {
        return this;
    }

    @Override
    public String textContent() {
        return text();
    }

    @Override
    public final InlineMarkupRendering markupRenderingBehavior() {
        return InlineMarkupRendering.I;
    }

    @Override
    public String wholeText() {
        return wholeTextContent;
    }

    // text() inherited from Text_I with default implementation: normalizeWhitespace(wholeText())
}