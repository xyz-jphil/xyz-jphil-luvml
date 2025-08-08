package luvml;

import static luvml.E.*;
import static luvml.Util_A.charset_utf8;
import luvx.Attr_I;
import luvx.Frag_I;

// convinience frequently used shortcuts
public class Util_E {

    public static BlockVoidElement meta_charset_utf8(Attr_I<?>... attributes) {
        return meta(charset_utf8()).addAttributes(attributes);
    }

    public static BlockContainerElement h(int i, Frag_I<?>... fragments) {
        assert i >= 1 && i <= 6;
        return blockContainer("h" + i, fragments);
    }
}
