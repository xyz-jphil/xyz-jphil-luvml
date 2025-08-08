package luvml.o;

import java.util.function.Consumer;

/**
 * Abstract base implementation of Out_I with streaming indentation support.
 * Uses child proxy pattern for zero-copy indentation management.
 */
public abstract class Out_A implements Out_I {
    public final RenderConfig renderConfig;

    public Out_A() {
        var builder = RenderConfig.builder();
        this.renderConfig = builder.build();
    }

    public Out_A(Consumer<RenderConfig.RenderConfigBuilder> configurator) {
        var builder = RenderConfig.builder();
        if (configurator != null) {
            configurator.accept(builder);
        }
        this.renderConfig = builder.build();
    }

    @Override
    public RenderConfig renderConfig() {
        return renderConfig;
    }

    @Override
    public Out_I nL() {
        if (renderConfig.outputFormat != null) {
            if (renderConfig.outputFormat.newLine != null) {
                ba(renderConfig.outputFormat.newLine);
            }
            for (int i = 0; i < renderConfig.currentIndent; i++) {
                _b((byte) renderConfig.outputFormat.indentChar);
            }
        }
        return this;
    }

    @Override
    public Out_A child() {
        final Out_A parent = this;
        if (renderConfig != null && renderConfig.outputFormat != null) {
            return new ChildOut_A(parent);
        } else {
            return this;
        }
    }

    @Override
    public Out_A parent() {
        return null;
    }

    public static Consumer<RenderConfig.RenderConfigBuilder> formatted() {
        return builder -> builder.outputFormat(formatBuilder -> 
            formatBuilder.doubleSpaceIndent().unixNewlines());
    }

    /**
     * Child proxy that delegates all output to parent while maintaining higher indentation level.
     */
    public static final class ChildOut_A extends Out_A {
        private final Out_A parent;

        public ChildOut_A(Out_A parent) {
            super(builder -> builder.child(parent.renderConfig));
            this.parent = parent;
        }

        @Override public Out_I __(String s) { parent.__(s); return this; }
        @Override public Out_I _i(int i) { parent._i(i); return this; }
        @Override public Out_I _d(double d) { parent._d(d); return this; }
        @Override public Out_I _c(char c) { parent._c(c); return this; }
        @Override public Out_I _z(boolean b) { parent._z(b); return this; }
        @Override public Out_I ba(byte[] b) { parent.ba(b); return this; }
        @Override public Out_I _b(byte b) { parent._b(b); return this; }

        @Override
        public Out_A parent() {
            return parent;
        }
    }
}