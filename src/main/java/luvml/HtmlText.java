package luvml;

import luvx.rendering_behavior.InlineMarkupRendering;
import luvx.*;

/**
 * Simple text node implementation.
 */
public final class HtmlText implements Text_I<HtmlText> {
    
    private final String textContent;
    
    public HtmlText(String textContent) {
        this.textContent = textContent;
    }
    
    @Override
    public HtmlText self() {
        return this;
    }
    
    @Override
    public String textContent() {
        return textContent;
    }
    
    @Override
    public final InlineMarkupRendering markupRenderingBehavior() {
        return InlineMarkupRendering.I;
    }
}