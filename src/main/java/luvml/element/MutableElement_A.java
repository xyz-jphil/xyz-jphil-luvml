package luvml.element;

import luvx.mutable.*;
import luvx.*;
import java.util.*;
import luvml.*;

abstract class MutableElement_A<I extends MutableElement_A<I>> implements MutableElement_I<I>{
    
    final String tagName;
    final Map<String, String> attributes = new LinkedHashMap<>();
    
    protected MutableElement_A(String tagName) {
        this.tagName = tagName;
    }
    
    MutableElement_A(Class<? extends SemanticElement_I> clss) {
        this.tagName = SemanticElementTagNameClassNameMapping.objTagName(clss, clss);
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

    @Override
    public I addAttribute(String name, String value) {
        return addAttributes(new HtmlAttribute(name, value));
    }
    
    /**
     * Sub-classes can override this and return values specific to their behavior, this applies to #displayType #elementTypeEnum #contexts
     * @return value as per tagName or empty if this tag is not a standard known html5 tag
     */
    public Set<ContentCategory> contentCategories() {
        var data = HtmlElementData.get(tagName);
        return data != null ? data.contentCategories() : Set.of();
    }

    public DisplayType displayType() {
        var data = HtmlElementData.get(tagName);
        return data != null ? data.displayType() : null;
    }

    public ElementType elementTypeEnum() {
        var data = HtmlElementData.get(tagName);
        return data != null ? data.elementType() : null;
    }

    public Set<Context> contexts() {
        var data = HtmlElementData.get(tagName);
        return data != null ? data.contexts() : Set.of();
    }

    @Override
    public I self() {
        return (I)this;
    }
    
    
}