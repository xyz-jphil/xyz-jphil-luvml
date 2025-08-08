package luvml.o;

import java.util.function.Consumer;

/**
 * StringBuilder-based implementation of Out_I for in-memory string building.
 * More efficient than string concatenation via += operator.
 */
public final class StringBuilderOut extends Out_A {
    private final StringBuilder sb;

    public StringBuilderOut() {
        super();
        this.sb = new StringBuilder();
    }

    public StringBuilderOut(Consumer<RenderConfig.RenderConfigBuilder> configurator) {
        super(configurator);
        this.sb = new StringBuilder();
    }

    public StringBuilderOut(StringBuilder sb) {
        super();
        this.sb = sb;
    }

    public StringBuilderOut(StringBuilder sb, Consumer<RenderConfig.RenderConfigBuilder> configurator) {
        super(configurator);
        this.sb = sb;
    }

    @Override
    public Out_I __(String s) {
        sb.append(s);
        return this;
    }

    @Override
    public Out_I _c(char c) {
        sb.append(c);
        return this;
    }

    @Override
    public Out_I _i(int i) {
        sb.append(i);
        return this;
    }

    @Override
    public Out_I _d(double d) {
        sb.append(d);
        return this;
    }

    @Override
    public Out_I _z(boolean b) {
        sb.append(b);
        return this;
    }

    @Override
    public Out_I _b(byte b) {
        sb.append((char) b);
        return this;
    }

    @Override
    public Out_I ba(byte[] b) {
        if (b != null) {
            sb.append(new String(b));
        }
        return this;
    }

    /**
     * Returns the accumulated string content.
     */
    public String render() {
        return sb.toString();
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}