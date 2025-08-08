package luvml;

import luvx.*;
import luvx.composable.HasTextContent;

/**
 * Abstract base class for comment implementations to eliminate code duplication.
 * Provides common implementation for Block and Inline comment elements.
 * Subclasses only need to specify their markup rendering behavior.
 */
abstract class Comment_A<T extends Comment_A<T>> implements Comment_I<T>, HasTextContent<T> {

    private final String content;

    protected Comment_A(String content) {
        this.content = content;
    }

    @Override
    public String comment() {
        return content;
    }

    @Override
    public String textContent() {
        return content;
    }
}