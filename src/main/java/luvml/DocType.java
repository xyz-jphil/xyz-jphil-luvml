package luvml;

import luvx.*;

/**
 * Document type declaration for HTML, XHTML, and XML documents.
 * Represents DOCTYPE declarations like <!DOCTYPE html> or <!DOCTYPE html PUBLIC...>.
 */
public final class DocType implements Doctype_I<DocType> {
    
    private final String name;
    private final String publicId;
    private final String systemId;
    
    private DocType(String name, String publicId, String systemId) {
        this.name = name;
        this.publicId = publicId;
        this.systemId = systemId;
    }
    
    @Override
    public DocType self() {
        return this;
    }
    
    public String name() {
        return name;
    }
    
    public String publicId() {
        return publicId;
    }
    
    public String systemId() {
        return systemId;
    }
    
    // HTML5 DOCTYPE
    public static DocType html5() {
        return new DocType("html", null, null);
    }
    
    // XHTML 1.0 Strict
    public static DocType xhtml1_0_Strict() {
        return new DocType("html", 
            "-//W3C//DTD XHTML 1.0 Strict//EN",
            "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd");
    }
    
    // XHTML 1.0 Transitional
    public static DocType xhtml1_0_Transitional() {
        return new DocType("html",
            "-//W3C//DTD XHTML 1.0 Transitional//EN", 
            "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd");
    }
    
    // XHTML 1.1
    public static DocType xhtml1_1() {
        return new DocType("html",
            "-//W3C//DTD XHTML 1.1//EN",
            "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd");
    }
    
    // HTML 4.01 Strict (legacy)
    public static DocType html4_01_Strict() {
        return new DocType("html",
            "-//W3C//DTD HTML 4.01//EN",
            "http://www.w3.org/TR/html4/strict.dtd");
    }
    
    // HTML 4.01 Transitional (legacy)
    public static DocType html4_01_Transitional() {
        return new DocType("html",
            "-//W3C//DTD HTML 4.01 Transitional//EN",
            "http://www.w3.org/TR/html4/loose.dtd");
    }
    
    // Custom DOCTYPE for XML documents
    public static DocType xml(String rootElement) {
        return new DocType(rootElement, null, null);
    }
    
    // Custom DOCTYPE with public/system IDs
    public static DocType custom(String name, String publicId, String systemId) {
        return new DocType(name, publicId, systemId);
    }
    
    /**
     * Renders the DOCTYPE declaration as string.
     */
    public String toDeclaration() {
        var sb = new StringBuilder("<!DOCTYPE ").append(name);
        
        if (publicId != null && systemId != null) {
            sb.append(" PUBLIC \"").append(publicId).append("\" \"").append(systemId).append("\"");
        } else if (systemId != null) {
            sb.append(" SYSTEM \"").append(systemId).append("\"");
        }
        
        return sb.append(">").toString();
    }
    
    @Override
    public String toString() {
        return toDeclaration();
    }
}