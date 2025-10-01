package luvml;

/**
 * Static factory methods for creating text-based nodes like
 * Text, Comments, and CDATA sections.
 * Follows the 'A' (Attributes) and 'E' (Elements) convention.
 */
public final class T {

    private T() {
        // Utility class
    }

    /**
     * Creates an inline Text node (common case). Its content will be escaped by a renderer.
     * Flows with content without structural boundaries for AI comprehension.
     * @param content The raw, unescaped text.
     * @return A new inline Text node.
     */
    public static InlineText text(String content) {
        return new InlineText(content);
    }
    
    /**
     * Creates a block Text node. Its content will be escaped by a renderer.
     * Creates structural boundaries with newlines for AI comprehension.
     * @param content The raw, unescaped text.
     * @return A new block Text node.
     */
    public static BlockText blockText(String content) {
        return new BlockText(content);
    }

    /**
     * Creates an inline Comment node (common case). A renderer will wrap its content in <!-- ... -->.
     * Flows with content without structural boundaries for AI comprehension.
     * @param content The raw, unescaped comment text.
     * @return A new inline Comment node.
     */
    public static InlineComment comment(String content) {
        return new InlineComment(content);
    }
    
    /**
     * Creates a block Comment node. A renderer will wrap its content in <!-- ... -->.
     * Creates structural boundaries with newlines for AI comprehension.
     * @param content The raw, unescaped comment text.
     * @return A new block Comment node.
     */
    public static BlockComment blockComment(String content) {
        return new BlockComment(content);
    }

    /**
     * Creates an inline CDATA section. A renderer will wrap its content in <![CDATA[...]]>.
     * Flows with content without structural boundaries for AI comprehension.
     * @param content The raw character data, which will not be escaped.
     * @return A new inline CData node.
     */
    public static InlineCData inlineCData(String content) {
        return new InlineCData(content);
    }
    
    /**
     * Creates a block CDATA section. A renderer will wrap its content in <![CDATA[...]]>.
     * Creates structural boundaries with newlines for AI comprehension (e.g., in <script> tags).
     * @param content The raw character data, which will not be escaped.
     * @return A new block CData node.
     */
    public static BlockCData blockCData(String content) {
        return new BlockCData(content);
    }
    
    /**
     * Special element which doesn't only force a line break
     * but also forces adding of indentation in the next line
     * for the renders which support this
     * @return '\n' + intend x '\t'
     */
    public static LineBreak newline(){
        return LineBreak.NL;
    }

}
