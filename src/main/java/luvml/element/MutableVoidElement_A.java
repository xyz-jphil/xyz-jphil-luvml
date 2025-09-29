package luvml.element;

import luvx.mutable.MutableVoidElement_I;

sealed abstract class MutableVoidElement_A<I extends MutableVoidElement_A<I>>
        extends MutableElement_A<I>
        implements MutableVoidElement_I<I> 
        permits 
            InlineVoidElement,
            BlockVoidElement,
            SemanticInlineVoidElement,
            SemanticBlockVoidElement {
    
    protected MutableVoidElement_A(String tagName) {
        super(tagName);
    }
}