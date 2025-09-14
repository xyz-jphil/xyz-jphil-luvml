package luvml.semantic;

import luvml.BlockContainerElement;
import luvx.Frag_I;
import static luvml.semantic.TagNameFromClass.*;

public class SemanticBlockContainerElement<T extends SemanticBlockContainerElement<T>> extends BlockContainerElement{
    
    public SemanticBlockContainerElement(Class<T> clzz) {
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
