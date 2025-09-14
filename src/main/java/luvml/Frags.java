package luvml;

import luvx.Frag_I;
import luvx.Frags_I;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Stream;
import static luvml.A.stringAttribute;
import static luvml.T.comment;
import static luvml.T.text;
import luvx.Attr_I;
import luvx.Node_I;

/**
 * Concrete implementation of a fragment collection.
 * This class holds a list of fragments that can be rendered together.
 * 
 * Usage examples:
 * - Group multiple elements without a wrapper container
 * - Return multiple fragments from a single method
 * - Build complex document structures incrementally
 * 
 * Factory method usage:
 * - Frags.of(element1, element2, element3)
 * - Frags.of(fragmentList)
 * - Frags.empty()
 */
public final class Frags<T extends Frag_I<?>> implements Frags_I<Frags<T>> {

    private final ArrayList<T> fragments = new ArrayList<>();

    @Override
    public List<Frag_I> fragments() {
        return Collections.unmodifiableList((List) fragments);
    }
    
    /**
     * Type-safe access to fragments with proper generic type.
     */
    public List<T> typedFragments() {
        return Collections.unmodifiableList(fragments);
    }

    @Override
    public Frags<T> self() {
        return this;
    }
    
    @SafeVarargs
    public final Frags<T> add(T... moreFragments) {
        for (var f : moreFragments) {
            fragments.add(f);
        }
        return this;
    }
    
    
    public final Frags<T> add(Iterable<T> moreFragments) {
        for (var f : moreFragments) {
            fragments.add(f);
        }
        return this;
    }
    
    
    public final Frags<T> add(Stream<T> moreFragments) {
        moreFragments.forEach((e)->fragments.add(e));
        
        return this;
    }
    
    public final Frags<T> add(String ... txtFrags){
        for (var f : txtFrags) {
            fragments.add((T)text(f));
        }
        return this;
    }
    
    public final Frags<T> ____(String ... frags){return add(frags);}
    public final Frags<T> ____(Iterable<T> frags){return add(frags);}
    public final Frags<T> ____(T ... frags){return add(frags);}
    
    
    
    // Static factory methods
    
    /**
     * Creates a typed fragment collection from multiple fragments.
     */
    @SafeVarargs
    public static <T extends Frag_I<?>> Frags<T> of(T... fragments) {
        return new Frags<T>().add(fragments);
    }
    
    public static <T extends Frag_I<?>> Frags<T> frags() {
        return new Frags<>();
    }
    
    /**
     * Creates a typed fragment collection from multiple fragments.
     */
    @SafeVarargs
    public static <T extends Frag_I<?>> Frags<T> frags(T... fragments) {
        return new Frags<T>().add(fragments);
    }
    
    
    public static <T extends Frag_I<?>> Frags<T> frags(Stream<T> fragments){
        return new Frags().add(fragments);
    }
        
    public static <T extends Frag_I<?>> Frags<T> frags(Iterable<T> fragments){
        return new Frags().add(fragments);
    }
    
    /**
     * Creates an empty typed fragment collection.
     */
    public static <T extends Frag_I<?>> Frags<T> empty() {
        return new Frags<>();
    }
    
    public static Frags_I if_(boolean condition, Supplier<Frag_I> frag){
        if(condition)return frags(frag.get());
        return frags();
    }
    
    public static Frags_I optionalAttr(String attrType, Supplier<String> attrValue){
        String attrVal = null;
        if(attrValue!=null)
            attrVal = attrValue.get();
        if(attrVal==null || attrVal.isBlank()) 
            return frags(comment((attrType==null?"null":attrType)+"=null")); 
        // luvml will automatically push this to body of the node
        if(attrType==null || attrType.isBlank()) {
            return frags(comment("null="+attrVal )); 
        }
            
        return frags(stringAttribute(attrType,attrVal));
    }
    
    
}