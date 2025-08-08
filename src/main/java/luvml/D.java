package luvml;

/**
 * Static factory methods for document-level elements like DOCTYPE and processing instructions.
 * These are not HTML elements but document-level constructs for XML, HTML, and XHTML.
 */
public final class D {
    
    private D() {
        // Utility class
    }
    
    // ========== DOCTYPE DECLARATIONS ==========
    
    /**
     * HTML5 DOCTYPE declaration: {@code <!DOCTYPE html>}
     */
    public static DocType html5() {
        return DocType.html5();
    }
    
    /**
     * XHTML 1.0 Strict DOCTYPE declaration.
     */
    public static DocType xhtml1_0_Strict() {
        return DocType.xhtml1_0_Strict();
    }
    
    /**
     * XHTML 1.0 Transitional DOCTYPE declaration.
     */
    public static DocType xhtml1_0_Transitional() {
        return DocType.xhtml1_0_Transitional();
    }
    
    /**
     * XHTML 1.1 DOCTYPE declaration.
     */
    public static DocType xhtml1_1() {
        return DocType.xhtml1_1();
    }
    
    /**
     * HTML 4.01 Strict DOCTYPE declaration (legacy).
     */
    public static DocType html4_01_Strict() {
        return DocType.html4_01_Strict();
    }
    
    /**
     * HTML 4.01 Transitional DOCTYPE declaration (legacy).
     */
    public static DocType html4_01_Transitional() {
        return DocType.html4_01_Transitional();
    }
    
    /**
     * Custom XML DOCTYPE declaration.
     */
    public static DocType xmlDoctype(String rootElement) {
        return DocType.xml(rootElement);
    }
    
    /**
     * Custom DOCTYPE with public and system IDs.
     */
    public static DocType customDoctype(String name, String publicId, String systemId) {
        return DocType.custom(name, publicId, systemId);
    }
    
    // ========== PROCESSING INSTRUCTIONS ==========
    
    /**
     * XML declaration: {@code <?xml version="1.0"?>}
     */
    public static ProcessingInstruction xmlDeclaration() {
        return ProcessingInstruction.xmlDeclaration();
    }
    
    /**
     * XML declaration with encoding: {@code <?xml version="1.0" encoding="UTF-8"?>}
     */
    public static ProcessingInstruction xmlDeclaration(String encoding) {
        return ProcessingInstruction.xmlDeclaration(encoding);
    }
    
    /**
     * XML declaration with encoding and standalone: {@code <?xml version="1.0" encoding="UTF-8" standalone="yes"?>}
     */
    public static ProcessingInstruction xmlDeclaration(String encoding, boolean standalone) {
        return ProcessingInstruction.xmlDeclaration(encoding, standalone);
    }
    
    /**
     * XML stylesheet processing instruction: {@code <?xml-stylesheet type="text/xsl" href="style.xsl"?>}
     */
    public static ProcessingInstruction xmlStylesheet(String href) {
        return ProcessingInstruction.xmlStylesheet(href);
    }
    
    /**
     * XML stylesheet with custom type: {@code <?xml-stylesheet type="text/css" href="style.css"?>}
     */
    public static ProcessingInstruction xmlStylesheet(String type, String href) {
        return ProcessingInstruction.xmlStylesheet(type, href);
    }
    
    /**
     * CSS stylesheet processing instruction: {@code <?xml-stylesheet type="text/css" href="style.css"?>}
     */
    public static ProcessingInstruction cssStylesheet(String href) {
        return ProcessingInstruction.cssStylesheet(href);
    }
    
    /**
     * Custom processing instruction.
     */
    public static ProcessingInstruction processingInstruction(String target, String data) {
        return ProcessingInstruction.custom(target, data);
    }
}