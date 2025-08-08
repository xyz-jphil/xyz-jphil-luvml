package luvml.o;

/**
 * Low-level output formatting configuration.
 * Controls how content is physically written to the output stream.
 */
public class OutputFormat {
    public static final byte[] NEWLINE_UNIX = {(byte) '\n'};
    public static final byte[] NEWLINE_WINDOWS = {(byte) '\r', (byte) '\n'};
    public static final byte[] NEWLINE_NONE = null;

    public final char indentChar;
    public final int parentIndent;
    public final byte[] newLine;

    public static final char INDENT_CHAR_DEFAULT = ' ';
    public static final int PARENT_INDENT_DEFAULT = 0;
    public static final byte[] NEWLINE_DEFAULT = NEWLINE_NONE;

    public OutputFormat(OutputFormatBuilder builder) {
        this.indentChar = builder.indentChar;
        this.parentIndent = builder.parentIndent;
        this.newLine = builder.newLine;
    }

    public static OutputFormatBuilder builder() {
        return new OutputFormatBuilder();
    }

    public static class OutputFormatBuilder {
        private char indentChar = INDENT_CHAR_DEFAULT;
        private int parentIndent = PARENT_INDENT_DEFAULT;
        private byte[] newLine = NEWLINE_DEFAULT;

        public OutputFormatBuilder indentChar(char indentChar) {
            this.indentChar = indentChar;
            return this;
        }

        public OutputFormatBuilder parentIndent(int parentIndent) {
            this.parentIndent = parentIndent;
            return this;
        }

        public OutputFormatBuilder newLine(byte[] newLine) {
            this.newLine = newLine;
            return this;
        }

        public OutputFormatBuilder unixNewlines() {
            return newLine(NEWLINE_UNIX);
        }

        public OutputFormatBuilder windowsNewlines() {
            return newLine(NEWLINE_WINDOWS);
        }

        public OutputFormatBuilder noNewlines() {
            return newLine(NEWLINE_NONE);
        }

        public OutputFormatBuilder singleTabIndent() {
            return parentIndent(1).indentChar('\t');
        }

        public OutputFormatBuilder doubleSpaceIndent() {
            return parentIndent(2).indentChar(' ');
        }

        public OutputFormat build() {
            return new OutputFormat(this);
        }
    }
}