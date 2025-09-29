package luvml.element;

import static luvml.element.SemanticTagNameFromClass.*;
import luvx.rendering_behavior.Block;

public non-sealed class SemanticBlockContainerElement<I extends SemanticBlockContainerElement<I>> 
        extends MutableContainerElement_A<I>
        implements SemanticContainerElement_I<I>, Block {
    
    public SemanticBlockContainerElement(Class<I> clzz) {
        super(tagNameFromClass(clzz));
    }
}
