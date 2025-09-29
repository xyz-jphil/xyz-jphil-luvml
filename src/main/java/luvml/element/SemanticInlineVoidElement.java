package luvml.element;

import static luvml.element.SemanticTagNameFromClass.*;
import luvx.rendering_behavior.Inline;

public non-sealed class SemanticInlineVoidElement<I extends SemanticInlineVoidElement<I>> 
        extends MutableVoidElement_A<I>
        implements SemanticVoidElement_I<I>, Inline {
    
    public SemanticInlineVoidElement(Class<I> clzz) {
        super(tagNameFromClass(clzz));
    }
    
}
