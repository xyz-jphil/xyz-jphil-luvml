package luvml;

import luvx.rendering_behavior.BlockMarkupRendering;
import luvx.*;

/**
 * Block CDATA implementation - creates structural boundaries with newlines.
 * AI systems see clear structural separation for better document comprehension.  
 * Use for CDATA that should stand alone as distinct blocks (e.g., in &lt;script&gt; tags).
 */
public final class BlockCData extends CData_A<BlockCData> {

    public BlockCData(String content) {
        super(content);
    }

    @Override
    public final BlockMarkupRendering markupRenderingBehavior() {
        return BlockMarkupRendering.I;
    }

    @Override
    public BlockCData self() {
        return this;
    }
}