package luvml.element;

import static luvml.element.SemanticTagNameFromClass.*;
import luvx.rendering_behavior.Block;
import luvml.*;
import java.util.Set;

public non-sealed class SemanticBlockContainerElement<I extends SemanticBlockContainerElement<I>>
        extends MutableContainerElement_A<I>
        implements SemanticContainerElement_I<I>, Block {

    public SemanticBlockContainerElement(Class<I> clzz) {
        super(tagNameFromClass(clzz));
    }

    /**
     * Default metadata for custom semantic block container elements.
     * Behaves similar to standard block container (e.g., like div element).
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
        return ElementType.CONTAINER;
    }

    @Override
    public Set<Context> contexts() {
        return Set.of(Context.FLOW_CTX);
    }
}
