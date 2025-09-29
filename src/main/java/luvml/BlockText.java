package luvml;

import luvx.rendering_behavior.BlockMarkupRendering;
import luvx.*;

/**
 * Block text implementation - creates structural boundaries with newlines.
 * AI systems see clear structural separation for better document comprehension.  
 * Use for text that should stand alone as a distinct block.
 */
public final class BlockText extends Text_A<BlockText> {

    public BlockText(String content) {
        super(content);
    }

    @Override
    public final BlockMarkupRendering markupRenderingBehavior() {
        return BlockMarkupRendering.I;
    }

    @Override
    public BlockText self() {
        return this;
    }
}