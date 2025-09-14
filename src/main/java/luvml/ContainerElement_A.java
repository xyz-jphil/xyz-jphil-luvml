package luvml;

import luvx.*;
import luvx.ftype.*;
import luvx.composable.*;

import java.util.*;

/**
 * Abstract base class for container elements to eliminate code duplication.
 * Provides common implementation for Block and Inline container elements.
 * Subclasses only need to specify their markup rendering behavior.
 */
abstract class ContainerElement_A<T extends ContainerElement_A<T>> implements MutableContainerElement_I<T>, HasAttributes<T>, HasChildNodes<T> {
    
    private final String tagName;
    private final List<Node_I<?>> children = new ArrayList<>();
    private final Map<String, String> attributes = new HashMap<>();
    
    protected ContainerElement_A(String tagName) {
        this.tagName = tagName;
    }
    
    @Override
    public final String tagName() {
        return tagName;
    }
    
    @Override
    public final List<? extends Node_I<?>> childNodes() {
        return Collections.unmodifiableList(children);
    }
    
    @Override
    public final Map<String, String> attributes() {
        return Collections.unmodifiableMap(attributes);
    }
    
    @Override
    public final String attr(String name) {
        return attributes.get(name);
    }
    
    public T ____(Iterable<Frag_I<?>> fragments){
        return addContent(fragments);
    }
    
    public T ____(Frag_I<?> ... fragments){
        return addContent(fragments);
    }
    
    public T ____(String ... fragments){
        return addContent(fragments);
    }
    
    public final T addContent(Iterable<Frag_I<?>> fragments){
        for (var fragment : fragments) {
            addFragment(fragment);
        }
        return self();
    }
    
    public final T addContent(Frag_I<?> ... fragments) {
        for (var fragment : fragments) {
            addFragment(fragment);
        }
        return self();
    }
    
    final T addFragment(Frag_I fragment){
        switch (fragment.fragType()) {
            case Attr_T  a -> attributes.put(a.attr().name(), a.attr().value());
            case Node_T  n -> children.add(n.node());
            case Frags_T f -> addContent(f.frags().__());
        }
        return self();
    }
    
    public final T addContent(String... textContent) {
        for (var text : textContent) {
            children.add(new InlineText(text));
        }
        return self();
    }
    
    public final Set<ContentCategory> contentCategories() {
        return E.getContentCategories(tagName);
    }
    
    public final DisplayType displayType() {
        return E.getDisplayType(tagName);
    }
    
    public final ElementType elementTypeEnum() {
        return E.getElementType(tagName);
    }
    
    public final Set<Context> contexts() {
        return E.getValidContexts(tagName);
    }
}