package luvml.element;

import luvx.rendering_behavior.Inline;
import luvml.*;
import java.util.Set;

public abstract non-sealed class SemanticInlineContainerElement<I extends SemanticInlineContainerElement<I>>
        extends MutableContainerElement_A<I>
        implements SemanticContainerElement_I<I>, Inline{

    public SemanticInlineContainerElement(Class<I> clzz) {
        super(clzz);
    }

    /**
     * Default metadata for custom semantic inline container elements.
     * Behaves similar to standard inline container (e.g., like span element).
     */
    @Override
    public Set<ContentCategory> contentCategories() {
        return Set.of(ContentCategory.FLOW, ContentCategory.PHRASING);
    }

    @Override
    public final DisplayType displayType() {
        return DisplayType.INLINE;
    }

    @Override
    public final ElementType elementTypeEnum() {
        return ElementType.CONTAINER;
    }

    @Override
    public Set<Context> contexts() {
        return Set.of(Context.PHRASING_CTX);
    }
}
