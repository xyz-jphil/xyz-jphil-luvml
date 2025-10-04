package luvml;

import luvml.element.BlockRawTextElement;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.joining;
import java.util.stream.Stream;

public class C {
    public static HtmlAttribute classAttr(CharSequence ... cs) {
        return class_(cs);
    }
    
    public static HtmlAttribute class_(CharSequence ... cs) {
        if(cs==null)return strAttr("class", "");
        return spaceSeparatedAttrVals("class", 
            Stream.of(cs).map(__->__.toString()).toArray(String[]::new)
        );
    }
    
    public static HtmlAttribute spaceSeparatedAttrVals(String attrName, String ... vals){
        var bidsStr = vals==null?"":Stream.of(vals)
                .filter(__->!__.isBlank())
                .map(String::trim)
                .collect(joining(" "));
        // depulicate bids
        bidsStr = Set.of(bidsStr.split(" ")).stream().collect(joining(" "));
        return strAttr(attrName,bidsStr);
    }
    
    public static HtmlAttribute strAttr(String attr, String val){
        return new HtmlAttribute(attr, val);
    }
     
    /**
     * Creates an luvml HtmlAttribute for inline styles.
     * @param properties The CSS properties to apply inline.
     */
    public static HtmlAttribute styleAttr(CharSequence ... properties) {
        String styleValue = Arrays.stream(properties)
            .map(e->e.toString())
            .collect(Collectors.joining(" "));
        return new HtmlAttribute("style", styleValue);
    }

    /**
     * Creates a &lt;style&gt; element with CSS content.
     * Accepts CharSequence for type-safe integration with CSS DSL.
     *
     * @param cssContent CSS rules or Style objects from luvs
     * @return BlockRawTextElement representing &lt;style&gt; tag
     */
    public static BlockRawTextElement styleEle(CharSequence... cssContent) {
        return new BlockRawTextElement("style").addContent(cssContent);
    }

}
