package luvml.element;

import static luvml.element.SemanticTagNameFromClass.*;
import luvx.rendering_behavior.Block;

public non-sealed class SemanticBlockVoidElement<I extends SemanticBlockVoidElement<I>> 
        extends MutableVoidElement_A<I>
        implements SemanticVoidElement_I<I>, Block {
    
    public SemanticBlockVoidElement(Class<I> clzz) {
        super(tagNameFromClass(clzz));
    }
    
    
}
