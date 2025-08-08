package luvml;

/**
 * Categories of HTML attributes based on their functional purpose.
 */
public enum AttributeCategory {
    /** Global attributes that can be applied to any HTML element */
    GLOBAL,
    
    /** Form-related attributes for input, form, fieldset, etc. */
    FORM,
    
    /** Media attributes for audio, video, img, source, etc. */
    MEDIA,
    
    /** Table-specific attributes for table, td, th, etc. */
    TABLE,
    
    /** Link and navigation attributes for a, link, area, etc. */
    LINK,
    
    /** Interactive attributes for button, details, dialog, etc. */
    INTERACTIVE,
    
    /** Metadata attributes for meta, script, style, etc. */
    METADATA,
    
    /** Accessibility attributes (ARIA and others) */
    ACCESSIBILITY,
    
    /** Event handler attributes (onclick, onload, etc.) */
    EVENT,
    
    /** Data attributes (data-*) */
    DATA,
    
    /** Microdata attributes */
    MICRODATA,
    
    /** Deprecated or obsolete attributes */
    DEPRECATED
}