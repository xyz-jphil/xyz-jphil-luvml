package luvml;

import luvx.Frag_I;
import luvx.Frags_I;

import java.util.*;
import java.util.stream.Stream;

/**
 * Concrete implementation of a fragment collection.
 * This class holds a list of fragments that can be rendered together.
 * 
 * Generic version allows type-safe collections like:
 * - Frags<CommentElement> - typed collection of comments
 * - Frags<FootnoteElement> - typed collection of footnotes
 * - Easy retrieval and filtering by type
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

    private final List<T> fragments;

    public Frags(Collection<T> fragments) {
        this.fragments = new ArrayList<>(fragments);
    }
    
    public Frags(Stream<T> fragmentsStream) {
        this.fragments = fragmentsStream.toList();
    }

    @SafeVarargs
    public Frags(T... fragments) {
        this.fragments = Arrays.asList(fragments);
    }

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
    
    /**
     * Creates a mutable copy that allows adding more fragments.
     */
    @SafeVarargs
    public final Frags<T> add(T... moreFragments) {
        var newList = new ArrayList<>(this.fragments);
        Collections.addAll(newList, moreFragments);
        return new Frags<>(newList);
    }
    
    /**
     * Creates a mutable copy that allows adding more fragments.
     */
    public Frags<T> add(Collection<T> moreFragments) {
        var newList = new ArrayList<>(this.fragments);
        newList.addAll(moreFragments);
        return new Frags<>(newList);
    }
    
    
    
    // Static factory methods
    
    /**
     * Creates a typed fragment collection from multiple fragments.
     */
    @SafeVarargs
    public static <T extends Frag_I<?>> Frags<T> of(T... fragments) {
        return new Frags<>(fragments);
    }
    
    /**
     * Creates a typed fragment collection from multiple fragments.
     */
    @SafeVarargs
    public static <T extends Frag_I<?>> Frags<T> frags(T... fragments) {
        return new Frags<>(fragments);
    }
    
    public static <T extends Frag_I<?>> Frags<T> frags(Stream<T> fragmentsStream){
        return new Frags<>(fragmentsStream);
    }
    
    public static <T extends Frag_I<?>> Frags<T> frags(Collection<T> fragments){
        return new Frags<>(fragments);
    }
    
    /**
     * Creates a typed fragment collection from a collection of fragments.
     */
    public static <T extends Frag_I<?>> Frags<T> of(Collection<T> fragments) {
        return new Frags<>(fragments);
    }
    
    /**
     * Creates an empty typed fragment collection.
     */
    public static <T extends Frag_I<?>> Frags<T> empty() {
        return new Frags<>(Collections.emptyList());
    }
}