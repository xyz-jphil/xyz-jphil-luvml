package luvml;

import luvx.*;
import luvx.composable.HasTextContent;

/**
 * Abstract base class for text implementations to eliminate code duplication.
 * Provides common implementation for Block and Inline text elements.
 * Subclasses only need to specify their markup rendering behavior.
 */
abstract class Text_A<T extends Text_A<T>> implements Text_I<T>, HasTextContent<T> {

    private final String content;

    protected Text_A(String content) {
        this.content = content;
    }

    @Override
    public String text() {
        return content;
    }

    @Override
    public String textContent() {
        return content;  // Keep for backward compatibility
    }

    // escapableTextContent() inherited from Text_I with default implementation
}