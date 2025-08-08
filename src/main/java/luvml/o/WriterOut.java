package luvml.o;

import java.io.IOException;
import java.io.Writer;
import java.util.function.Consumer;

/**
 * Writer-based implementation of Out_I for direct stream output.
 * Enables zero-copy streaming to files, network sockets, etc.
 */
public final class WriterOut extends Out_A {
    private final Writer writer;

    public WriterOut(Writer writer) {
        super();
        this.writer = writer;
    }

    public WriterOut(Writer writer, Consumer<RenderConfig.RenderConfigBuilder> configurator) {
        super(configurator);
        this.writer = writer;
    }

    @Override
    public Out_I __(String s) {
        try {
            writer.write(s);
        } catch (IOException e) {
            throw new RuntimeException("IO error during output", e);
        }
        return this;
    }

    @Override
    public Out_I _c(char c) {
        try {
            writer.write(c);
        } catch (IOException e) {
            throw new RuntimeException("IO error during output", e);
        }
        return this;
    }

    @Override
    public Out_I _i(int i) {
        return __(String.valueOf(i));
    }

    @Override
    public Out_I _d(double d) {
        return __(String.valueOf(d));
    }

    @Override
    public Out_I _z(boolean b) {
        return __(String.valueOf(b));
    }

    @Override
    public Out_I _b(byte b) {
        return _c((char) b);
    }

    @Override
    public Out_I ba(byte[] b) {
        if (b != null) {
            return __(new String(b));
        }
        return this;
    }

    /**
     * Flushes the underlying writer.
     */
    public void flush() {
        try {
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException("IO error during flush", e);
        }
    }

    /**
     * Closes the underlying writer.
     */
    public void close() {
        try {
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException("IO error during close", e);
        }
    }
}