package luvml;

/**
 * Data types for HTML attribute values.
 */
public enum AttributeType {
    /** String value (most common) */
    STRING,
    
    /** Boolean attribute (presence indicates true) */
    BOOLEAN,
    
    /** Numeric value (integer or decimal) */
    NUMBER,
    
    /** URL or URI reference */
    URL,
    
    /** Enumerated value from a predefined set */
    ENUM,
    
    /** Space-separated list of tokens */
    TOKEN_LIST,
    
    /** Comma-separated list of values */
    COMMA_LIST,
    
    /** CSS color value */
    COLOR,
    
    /** Date/time value */
    DATETIME,
    
    /** MIME type */
    MIME_TYPE,
    
    /** Language code */
    LANGUAGE,
    
    /** Character encoding */
    CHARSET,
    
    /** Regular expression pattern */
    REGEX,
    
    /** CSS length/dimension */
    DIMENSION,
    
    /** JavaScript code */
    SCRIPT
}