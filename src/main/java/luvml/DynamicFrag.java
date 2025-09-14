package luvml;

import java.util.List;
import java.util.function.Supplier;
import static luvml.A.stringAttribute;
import luvx.Frag_I;
import luvx.Frags_I;

public final class DynamicFrag implements Frags_I<DynamicFrag>{

    private final Supplier<Frag_I> dynamicFrag;
    private final boolean optional;
    
    public static final DynamicFrag empty(){
        return new DynamicFrag(null, true);
    }

    public DynamicFrag(Supplier dynamicFrag, boolean optional) {
        this.dynamicFrag = dynamicFrag; this.optional = optional;
    }
    
    public static DynamicFrag dynamicFrag(Supplier<Frag_I> dynamicFrag){
        return new DynamicFrag(dynamicFrag,false);
    }
    
    
    @Override
    public List<Frag_I> fragments() {
        if(dynamicFrag==null && optional)return List.of();
        var f = dynamicFrag.get();
        if(f==null && !optional)throw new NullPointerException("Dynamic frag was null");
        if(f==null)return List.of();
        return List.of(f);
    }

    @Override
    public DynamicFrag self() {
        return this;
    }
    
}
