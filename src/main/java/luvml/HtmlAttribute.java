package luvml;

import luvx.Attr_I;
import java.util.Set;

/**
 * Base class for HTML attributes with lightweight architecture.
 * Metadata is fetched on-demand from HtmlAttributeData for memory efficiency.
 */
public class HtmlAttribute implements Attr_I<HtmlAttribute> {

    private final String name;
    private final String value;

    public HtmlAttribute(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String value() {
        return value;
    }

    public Set<AttributeCategory> categories() {
        var data = HtmlAttributeData.get(name);
        return data != null ? data.categories() : Set.of();
    }

    public AttributeType type() {
        var data = HtmlAttributeData.get(name);
        return data != null ? data.type() : null;
    }

    public AttributeScope scope() {
        var data = HtmlAttributeData.get(name);
        return data != null ? data.scope() : null;
    }
    
    @Override
    public HtmlAttribute self() {
        return this;
    }
    
    @Override
    public String toString() {
        return name + "=\"" + value + "\"";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof HtmlAttribute other)) return false;
        return name.equals(other.name) && value.equals(other.value);
    }
    
    @Override
    public int hashCode() {
        return name.hashCode() * 31 + value.hashCode();
    }
}