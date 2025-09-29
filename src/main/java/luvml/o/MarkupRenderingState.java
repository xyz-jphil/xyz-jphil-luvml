package luvml.o;

import luvx.rendering_behavior.BlockMarkupRendering;
import luvx.rendering_behavior.InlineMarkupRendering;
import luvx.Node_I;

public final class MarkupRenderingState {
    int count = 0;

    public MarkupRenderingState() {
    }
    
    public MarkupRenderingState(int count) {
        this.count = count;
    }

    public int count() {
        return count;
    }
    
    public static final MarkupRenderingState 
            BLOCK_NONE = new MarkupRenderingState(),
            BLOCK_ONE = new MarkupRenderingState(1);
    
    public static final MarkupRenderingState of(Node_I<?> node){
        return switch (node.markupRenderingBehavior()) {
            case BlockMarkupRendering __ -> BLOCK_ONE;
            case InlineMarkupRendering __ -> BLOCK_NONE;            
        };
    }
    
    public void addFromChild(MarkupRenderingState a){
        this.count += a.count;
    }
    
    public void incrementBlockCount(){
        count++;
    }
    
    public boolean hasBlock(){
        return count > 0;
    }
}
