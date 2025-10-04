package luvml.element;

import luvx.rendering_behavior.Inline;

/**
 * Inline raw text element (for rare inline &lt;script&gt; cases).
 * Renders with inline markup behavior.
 */
public final class InlineRawTextElement
        extends RawTextElement_A<InlineRawTextElement>
        implements Inline {

    public InlineRawTextElement(String tagName) {
        super(tagName);
    }
}
