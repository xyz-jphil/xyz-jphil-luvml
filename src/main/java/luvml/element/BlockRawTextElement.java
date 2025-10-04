package luvml.element;

import luvx.rendering_behavior.Block;

/**
 * Block-level raw text element (&lt;style&gt;, &lt;script&gt; in most cases).
 * Renders with block markup behavior (newlines/indentation).
 */
public final class BlockRawTextElement
        extends RawTextElement_A<BlockRawTextElement>
        implements Block {

    public BlockRawTextElement(String tagName) {
        super(tagName);
    }
}
