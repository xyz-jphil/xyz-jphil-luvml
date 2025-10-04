package luvml.element;

import luvx.rendering_behavior.Block;

/**
 * Block-level escapable raw text element (&lt;title&gt;).
 * Renders with block markup behavior (newlines/indentation).
 */
public final class BlockEscapableRawTextElement
        extends EscapableRawTextElement_A<BlockEscapableRawTextElement>
        implements Block {

    public BlockEscapableRawTextElement(String tagName) {
        super(tagName);
    }
}
