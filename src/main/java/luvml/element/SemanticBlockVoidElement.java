package luvml.element;

import static luvml.element.SemanticTagNameFromClass.*;
import luvx.rendering_behavior.Block;
import luvml.*;
import java.util.Set;

public non-sealed class SemanticBlockVoidElement<I extends SemanticBlockVoidElement<I>>
        extends MutableVoidElement_A<I>
        implements SemanticVoidElement_I<I>, Block {

    public SemanticBlockVoidElement(Class<I> clzz) {
        super(tagNameFromClass(clzz));
    }

    /**
     * Default metadata for custom semantic block void elements.
     * Behaves similar to standard block void element (e.g., like hr element).
     */
    @Override
    public Set<ContentCategory> contentCategories() {
        return Set.of(ContentCategory.FLOW);
    }

    @Override
    public final DisplayType displayType() {
        return DisplayType.BLOCK;
    }

    @Override
    public final ElementType elementTypeEnum() {
        return ElementType.VOID;
    }

    @Override
    public Set<Context> contexts() {
        return Set.of(Context.FLOW_CTX);
    }
}
