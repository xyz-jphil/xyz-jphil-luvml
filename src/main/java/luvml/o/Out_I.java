package luvml.o;

/**
 * Fluent output interface for streaming HTML/XML content.
 * Short method names enable readable chaining for complex markup generation.
 */
public interface Out_I {
    /** Appends string content */
    Out_I __(String s);
    
    /** Appends single character */
    Out_I _c(char c);
    
    /** Appends integer value */
    Out_I _i(int i);
    
    /** Appends double value */
    Out_I _d(double d);
    
    /** Appends boolean value */
    Out_I _z(boolean b);
    
    /** Appends single byte */
    Out_I _b(byte b);
    
    /** Appends byte array */
    Out_I ba(byte[] b);
    
    /** Inserts newline and applies current indentation */
    Out_I nL();
    
    /** Creates child context with increased indentation */
    Out_I child();
    
    /** Returns parent context with decreased indentation */
    Out_I parent();
    
    /** Gets current render configuration */
    RenderConfig renderConfig();
}