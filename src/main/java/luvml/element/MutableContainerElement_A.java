package luvml.element;

import luvx.mutable.*;
import luvx.*;
import luvx.ftype.*;


import java.util.*;
import luvml.InlineText;

public sealed abstract class MutableContainerElement_A<I extends MutableContainerElement_A<I>> 
        extends MutableElement_A<I>
        implements MutableContainerElement_I<I> 
        permits 
            BlockContainerElement,
            InlineContainerElement,
            SemanticBlockContainerElement,
            SemanticInlineContainerElement

{
    
    final List<Node_I<?>> children = new ArrayList<>();
    
    protected MutableContainerElement_A(String tagName) {
        super(tagName);
    }

    MutableContainerElement_A(Class<? extends SemanticElement_I> clss) {
        super(clss);
    }
    
    
    @Override
    public final List<? extends Node_I<?>> childNodes() {
        return Collections.unmodifiableList(children);
    }
    
    @Override
    public final I addContent(Iterable<Frag_I<?>> fragments){
        for (var fragment : fragments) {
            addFragment(fragment);
        }
        return self();
    }
    
    @Override
    public final I addContent(Frag_I<?> ... fragments) {
        for (var fragment : fragments) {
            addFragment(fragment);
        }
        return self();
    }
    
    final I addFragment(Frag_I fragment){
        switch (fragment.fragType()) {
            case Attr_T  a -> attributes.put(a.attr().name(), a.attr().value());
            case Node_T  n -> children.add(n.node());
            case Frags_T f -> addContent(f.frags().__());
        }
        return self();
    }
    
    @Override
    public final I addContent(String... textContent) {
        for (var text : textContent) {
            children.add(new InlineText(text));
        }
        return self();
    }
    
}