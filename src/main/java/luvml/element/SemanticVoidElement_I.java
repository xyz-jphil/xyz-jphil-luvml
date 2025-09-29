package luvml.element;

import luvx.VoidElement_I;

public sealed interface SemanticVoidElement_I<I extends SemanticVoidElement_I<I>> 
        extends SemanticElement_I<I>, VoidElement_I<I>
        permits 
            SemanticInlineVoidElement, 
            SemanticBlockVoidElement {
}
