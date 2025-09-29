package luvml.element;
import luvx.rendering_behavior.Block;

/**
 * Block void element - creates structural boundaries with newlines.
 * AI systems see clear structural separation for better document comprehension.
 * Used for HTML void elements like hr, meta, link, base that are block-level.
 * This is used for standard html elements and is not extensible.
 * The generic type is also finalized here. For extending and making custom elements, please use Semantic elements
 */
public final class BlockVoidElement 
        extends MutableVoidElement_A<BlockVoidElement>
        implements Block {
    
    public BlockVoidElement(String tagName) {
        super(tagName);
    }

}