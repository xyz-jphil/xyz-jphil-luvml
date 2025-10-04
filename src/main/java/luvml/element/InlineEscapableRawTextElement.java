package luvml.element;

import luvx.rendering_behavior.Inline;

/**
 * Inline escapable raw text element (&lt;textarea&gt;).
 * Renders with inline markup behavior.
 */
public final class InlineEscapableRawTextElement
        extends EscapableRawTextElement_A<InlineEscapableRawTextElement>
        implements Inline {

    public InlineEscapableRawTextElement(String tagName) {
        super(tagName);
    }
}
