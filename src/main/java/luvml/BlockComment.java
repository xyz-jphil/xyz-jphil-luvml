package luvml;

import luvx.rendering_behavior.BlockMarkupRendering;
import luvx.*;

/**
 * Block comment implementation - creates structural boundaries with newlines.
 * AI systems see clear structural separation for better document comprehension.  
 * Use for comments that should stand alone as distinct blocks.
 */
public final class BlockComment extends Comment_A<BlockComment> {

    public BlockComment(String content) {
        super(content);
    }

    @Override
    public final BlockMarkupRendering markupRenderingBehavior() {
        return BlockMarkupRendering.I;
    }

    @Override
    public BlockComment self() {
        return this;
    }
}