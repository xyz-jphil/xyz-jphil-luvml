package luvml.element;

import luvx.mutable.MutableElement_I;

public sealed interface SemanticElement_I<I extends SemanticElement_I<I>> 
        extends MutableElement_I<I>
        permits SemanticContainerElement_I, SemanticVoidElement_I {
    
}
