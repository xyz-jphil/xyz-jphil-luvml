package luvml;

/**
 * Scope indicating which elements can use specific attributes.
 */
public enum AttributeScope {
    /** Can be used on any HTML element */
    UNIVERSAL,
    
    /** Form and input elements only */
    FORM_ELEMENTS,
    
    /** Media elements (audio, video, img, etc.) */
    MEDIA_ELEMENTS,
    
    /** Table elements only */
    TABLE_ELEMENTS,
    
    /** Link elements (a, area, link) */
    LINK_ELEMENTS,
    
    /** Interactive elements */
    INTERACTIVE_ELEMENTS,
    
    /** Metadata elements (meta, script, style, etc.) */
    METADATA_ELEMENTS,
    
    /** List elements (ol, ul, li) */
    LIST_ELEMENTS,
    
    /** Specific to certain elements (will be documented per attribute) */
    SPECIFIC_ELEMENTS,
    
    /** Root html element only */
    ROOT_ELEMENT,
    
    /** Block-level elements */
    BLOCK_ELEMENTS,
    
    /** Inline elements */
    INLINE_ELEMENTS
}