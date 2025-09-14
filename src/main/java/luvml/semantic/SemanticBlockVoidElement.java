package luvml.semantic;

import luvml.BlockVoidElement;
import luvx.Attr_I;
import static luvml.semantic.TagNameFromClass.*;

public class SemanticBlockVoidElement<T extends SemanticBlockVoidElement<T>> extends BlockVoidElement {
    
    public SemanticBlockVoidElement(Class<T> clzz) {
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
