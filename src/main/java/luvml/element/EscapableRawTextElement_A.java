package luvml.element;

import luvx.EscapableRawTextElement_I;
import luvx.ftype.EscapableRawTextElement_T;
import java.util.*;
import luvx.Attr_I;

/**
 * Abstract base for escapable raw text elements (&lt;textarea&gt;, &lt;title&gt;).
 * These elements contain text that is NOT parsed as HTML but character references ARE escaped.
 *
 * According to HTML5 spec:
 * - Content is treated as raw text (no HTML parsing)
 * - Character references (like &amp;amp;) ARE processed/escaped
 * - No child elements allowed
 */
abstract sealed class EscapableRawTextElement_A<I extends EscapableRawTextElement_A<I>>
        extends MutableElement_A<I>
        implements EscapableRawTextElement_I<I>
        permits BlockEscapableRawTextElement, InlineEscapableRawTextElement {

    private final List<String> textContent = new ArrayList<>();

    protected EscapableRawTextElement_A(String tagName) {
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
    public String escapableTextContent() {
        return String.join("", textContent);
    }

    /**
     * Returns the accumulated text content as a list (for internal use).
     */
    public List<String> textContent() {
        return Collections.unmodifiableList(textContent);
    }

    @Override
    public EscapableRawTextElement_T<I> elementType() {
        return new EscapableRawTextElement_T<>(self());
    }
}
