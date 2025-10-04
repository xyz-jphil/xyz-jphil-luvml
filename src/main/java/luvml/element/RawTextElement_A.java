package luvml.element;

import luvx.Attr_I;
import luvx.RawTextElement_I;
import luvx.ftype.RawTextElement_T;
import java.util.*;

/**
 * Abstract base for raw text elements (&lt;style&gt;, &lt;script&gt;).
 * These elements contain text that is NOT parsed as HTML and NOT escaped.
 *
 * According to HTML5 spec:
 * - Content is treated as raw text
 * - Character references (like &amp;amp;) are NOT processed
 * - No HTML parsing occurs
 */
abstract sealed class RawTextElement_A<I extends RawTextElement_A<I>>
        extends MutableElement_A<I>
        implements RawTextElement_I<I>
        permits BlockRawTextElement, InlineRawTextElement {

    private final List<String> textContent = new ArrayList<>();

    protected RawTextElement_A(String tagName) {
        super(tagName);
    }

    @Override
    public I addContent(CharSequence... text) {
        for (var t : text) {
            textContent.add(t.toString());
        }
        return self();
    }
    
    public I ____(CharSequence... text){
        return addContent(text);
    }
    
    public I ____(Attr_I<?> ... attrs){
        return addAttributes(attrs);
    }

    @Override
    public String rawTextContent() {
        return String.join("", textContent);
    }

    /**
     * Returns the accumulated text content as a list (for internal use).
     */
    public List<String> textContent() {
        return Collections.unmodifiableList(textContent);
    }

    @Override
    public RawTextElement_T<I> elementType() {
        return new RawTextElement_T<>(self());
    }
}
