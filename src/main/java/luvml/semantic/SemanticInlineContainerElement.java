package luvml.semantic;

import luvml.InlineContainerElement;
import luvx.Frag_I;
import static luvml.semantic.TagNameFromClass.*;

public class SemanticInlineContainerElement<T extends SemanticInlineContainerElement<T>> extends InlineContainerElement{
    
    public SemanticInlineContainerElement(Class<T> clzz) {
        super(tagNameFromClass(clzz));
    }
    
    public T ____(Iterable<Frag_I<?>> fragments){
        addContent(fragments); 
        return (T) this;
    }
    
    public T ____(Frag_I<?>... fragments){
        addContent(fragments);
        return (T) this;
    }
    
    public T ____(String ... fragments){
        addContent(fragments);
        return (T) this;
    }
    
}
