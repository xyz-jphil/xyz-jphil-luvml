package luvml;

import luvx.*;

/**
 * Block void element - creates structural boundaries with newlines.
 * AI systems see clear structural separation for better document comprehension.
 * Used for HTML void elements like hr, meta, link, base that are block-level.
 */
public class BlockVoidElement extends VoidElement_A<BlockVoidElement> {
    
    public BlockVoidElement(String tagName) {
        super(tagName);
    }
    
    @Override
    public final BlockVoidElement self() {
        return this;
    }
    
    @Override
    public final BlockMarkupRendering markupRenderingBehavior() {
        return BlockMarkupRendering.I;
    }
}