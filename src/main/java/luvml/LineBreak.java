package luvml;

import luvx.rendering_behavior.InlineMarkupRendering;
import luvx.Text_I;
import luvx.composable.HasTextContent;

public class LineBreak 
        implements Text_I<LineBreak>, HasTextContent<LineBreak>  {

    public static final LineBreak NL = new LineBreak("\n");
    public static final LineBreak RL = new LineBreak("\n\r");
    private final String nLStr;
    
    LineBreak(String nLStr) {this.nLStr = nLStr;}

    @Override
    public final InlineMarkupRendering markupRenderingBehavior() {
        return InlineMarkupRendering.I;
    }

    @Override
    public LineBreak self() {
        return this;
    }

    @Override
    public String textContent() {
        return nLStr;
    }

}
