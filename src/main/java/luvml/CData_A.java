package luvml;

import luvx.*;
import luvx.composable.HasTextContent;

/**
 * Abstract base class for CDATA implementations to eliminate code duplication.
 * Provides common implementation for Block and Inline CDATA elements.
 * Subclasses only need to specify their markup rendering behavior.
 */
abstract class CData_A<T extends CData_A<T>> implements CData_I<T>, HasTextContent<T> {

    private final String content;

    protected CData_A(String content) {
        this.content = content;
    }

    @Override
    public String textContent() {
        return content;
    }
}