package luvml;

import luvx.*;
import luvx.ftype.*;

/**
 * Block container element - creates structural boundaries with newlines.
 * AI systems see clear structural separation for better document comprehension.
 * Used for HTML elements like div, p, section, h1-h6, blockquote, etc.
 */
public class BlockContainerElement extends ContainerElement_A<BlockContainerElement> {
    
    public BlockContainerElement(String tagName) {
        super(tagName);
    }
    
    @Override
    public final BlockContainerElement self() {
        return this;
    }
    
    @Override
    public final BlockMarkupRendering markupRenderingBehavior() {
        return BlockMarkupRendering.I;
    }
}