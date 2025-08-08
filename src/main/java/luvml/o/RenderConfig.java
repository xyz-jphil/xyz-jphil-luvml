package luvml.o;

import java.util.function.Consumer;

/**
 * High-level rendering configuration.
 * Controls what type of output to generate and validation behavior.
 */
public final class RenderConfig {
    public final boolean xhtmlMode;
    public final OutputFormat outputFormat;
    public final int currentIndent;
    public final Consumer<Object> extraParams;

    public static final boolean XHTML_MODE_DEFAULT = true;
    public static final OutputFormat OUTPUT_FORMAT_DEFAULT = null;
    public static final int CURRENT_INDENT_DEFAULT = 0;

    public RenderConfig(RenderConfigBuilder builder) {
        this.xhtmlMode = builder.xhtmlMode;
        this.outputFormat = builder.outputFormat;
        this.currentIndent = builder.currentIndent;
        this.extraParams = builder.extraParams;
    }

    public static RenderConfigBuilder builder() {
        return new RenderConfigBuilder();
    }

    public boolean isXhtmlMode() {
        return xhtmlMode;
    }

    public static class RenderConfigBuilder {
        private boolean xhtmlMode = XHTML_MODE_DEFAULT;
        private OutputFormat outputFormat = OUTPUT_FORMAT_DEFAULT;
        private int currentIndent = CURRENT_INDENT_DEFAULT;
        private Consumer<Object> extraParams;

        public RenderConfigBuilder xhtmlMode(boolean xhtmlMode) {
            this.xhtmlMode = xhtmlMode;
            return this;
        }

        public RenderConfigBuilder htmlMode() {
            return xhtmlMode(false);
        }

        public RenderConfigBuilder outputFormat(OutputFormat outputFormat) {
            this.outputFormat = outputFormat;
            return this;
        }

        public RenderConfigBuilder outputFormat(Consumer<OutputFormat.OutputFormatBuilder> configurator) {
            var builder = OutputFormat.builder();
            configurator.accept(builder);
            return outputFormat(builder.build());
        }

        public RenderConfigBuilder currentIndent(int currentIndent) {
            this.currentIndent = currentIndent;
            return this;
        }

        public RenderConfigBuilder child(RenderConfig parent) {
            this.xhtmlMode = parent.xhtmlMode;
            this.outputFormat = parent.outputFormat;
            this.currentIndent = parent.currentIndent + (parent.outputFormat != null ? parent.outputFormat.parentIndent : 0);
            this.extraParams = parent.extraParams;
            return this;
        }

        public RenderConfigBuilder extraParams(Consumer<Object> extraParams) {
            this.extraParams = extraParams;
            return this;
        }

        public RenderConfig build() {
            return new RenderConfig(this);
        }
    }
}