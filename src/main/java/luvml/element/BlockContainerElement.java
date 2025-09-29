package luvml.element;
import luvx.rendering_behavior.Block;

/**
 * Block container element - creates structural boundaries with newlines.
 * AI systems see clear structural separation for better document comprehension.
 * Used for HTML elements like div, p, section, h1-h6, blockquote, etc.
 */
public final class BlockContainerElement 
        extends MutableContainerElement_A<BlockContainerElement>
        implements Block {
    
    public BlockContainerElement(String tagName) {
        super(tagName);
    }

}