package luvml.element;

import static luvml.element.SemanticTagNameFromClass.*;
import luvx.rendering_behavior.Inline;

public non-sealed class SemanticInlineContainerElement<I extends SemanticInlineContainerElement<I>> 
        extends MutableContainerElement_A<I>
        implements SemanticContainerElement_I<I>, Inline{
    
    public SemanticInlineContainerElement(Class<I> clzz) {
        super(tagNameFromClass(clzz));
    }
    
    
    
}
