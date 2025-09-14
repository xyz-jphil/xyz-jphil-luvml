package luvml;

import luvx.*;
import luvx.composable.*;

import java.util.*;

/**
 * Abstract base class for void element implementations to eliminate code duplication.
 * Provides common implementation for Block and Inline void elements.
 * Subclasses only need to specify their markup rendering behavior.
 */
abstract class VoidElement_A<T extends VoidElement_A<T>> implements VoidElement_I<T>, HasAttributes<T> {
    
    private final String tagName;
    private final Map<String, String> attributes = new HashMap<>();
    
    protected VoidElement_A(String tagName) {
        this.tagName = tagName;
    }
    
    @Override
    public final String tagName() {
        return tagName;
    }
    
    @Override
    public final Map<String, String> attributes() {
        return Collections.unmodifiableMap(attributes);
    }
    
    @Override
    public final String attr(String name) {
        return attributes.get(name);
    }
    
    public T ____(Attr_I<?>... attrs){
        return addAttributes(attrs);
    }
    
    public T ____(Iterable<Attr_I<?>> attrs){
        return addAttributes(attrs);
    }
    
    public final T addAttributes(Attr_I<?>... attrs) {
        for (var attr : attrs) {
            attributes.put(attr.name(), attr.value());
        }
        return self();
    }
    
    public final T addAttributes(Iterable<Attr_I<?>> attrs) {
        for (var attr : attrs) {
            attributes.put(attr.name(), attr.value());
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