package luvml;

import luvx.*;
import luvx.composable.HasTextContent;

/**
 * Abstract base class for text implementations to eliminate code duplication.
 * Provides common implementation for Block and Inline text elements.
 * Subclasses only need to specify their markup rendering behavior.
 */
abstract class Text_A<T extends Text_A<T>> implements Text_I<T>, HasTextContent<T> {

    private final String wholeTextContent;

    protected Text_A(String content) {
        this.wholeTextContent = content;
    }

    @Override
    public String wholeText() {
        return wholeTextContent;
    }

    // text() inherited from Text_I with default implementation: normalizeWhitespace(wholeText())

    @Override
    public String textContent() {
        return text();  // Returns normalized version for backward compatibility
    }

    // escapableTextContent() inherited from Text_I with default implementation
}