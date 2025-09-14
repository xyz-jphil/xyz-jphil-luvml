package luvml.semantic;

import luvml.InlineVoidElement;
import luvx.Attr_I;
import static luvml.semantic.TagNameFromClass.*;

public class SemanticInlineVoidElement<T extends SemanticInlineVoidElement<T>> extends InlineVoidElement {
    
    public SemanticInlineVoidElement(Class<T> clzz) {
        super(tagNameFromClass(clzz));
    }
    
    public T ____(Iterable<Attr_I<?>> fragments){
        addAttributes(fragments); 
        return (T) this;
    }
    
    public T ____(Attr_I<?>... fragments){
        addAttributes(fragments);
        return (T) this;
    }
    
}
