package luvml.element;

import luvx.rendering_behavior.Inline;
import luvml.*;
import java.util.Set;

public abstract non-sealed class SemanticInlineVoidElement<I extends SemanticInlineVoidElement<I>>
        extends MutableVoidElement_A<I>
        implements SemanticVoidElement_I<I>, Inline {

    public SemanticInlineVoidElement(Class<I> clzz) {
        super(clzz);
    }

    /**
     * Default metadata for custom semantic inline void elements.
     * Behaves similar to standard inline void element (e.g., like br or wbr elements).
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
        return ElementType.VOID;
    }

    @Override
    public Set<Context> contexts() {
        return Set.of(Context.PHRASING_CTX);
    }
}
