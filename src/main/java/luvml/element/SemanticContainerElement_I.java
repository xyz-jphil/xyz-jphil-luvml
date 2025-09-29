package luvml.element;

import luvx.ContainerElement_I;

public sealed interface SemanticContainerElement_I<I extends SemanticContainerElement_I<I>> 
        extends SemanticElement_I<I>, ContainerElement_I<I>
        permits 
            SemanticInlineContainerElement, 
            SemanticBlockContainerElement {
    

}
