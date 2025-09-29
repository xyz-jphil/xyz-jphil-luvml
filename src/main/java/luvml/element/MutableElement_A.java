package luvml.element;

import luvx.mutable.*;
import luvx.*;
import java.util.*;
import luvml.*;

abstract class MutableElement_A<I extends MutableElement_A<I>> implements MutableElement_I<I> {
    
    final String tagName;
    final Map<String, String> attributes = new LinkedHashMap<>();
    
    protected MutableElement_A(String tagName) {
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
        
    @Override
    public final I addAttributes(Attr_I<?>... attrs) {
        for (var attr : attrs) {
            attributes.put(attr.name(), attr.value());
        }
        return self();
    }
    
    @Override
    public final I addAttributes(Iterable<Attr_I<?>> attrs) {
        for (var attr : attrs) {
            attributes.put(attr.name(), attr.value());
        }
        return self();
    }
    
    /**
     * Sub-classes can override this and return values specific to their behavior, this applies to #displayType #elementTypeEnum #contexts
     * @return value as per tagName or empty if this tag is not a standard known html5 tag
     */
    public Set<ContentCategory> contentCategories() {
        return E.getContentCategories(tagName);
    }
    
    public DisplayType displayType() {
        return E.getDisplayType(tagName);
    }
    
    public ElementType elementTypeEnum() {
        return E.getElementType(tagName);
    }
    
    public Set<Context> contexts() {
        return E.getValidContexts(tagName);
    }

    @Override
    public I self() {
        return (I)this;
    }
    
    
}