package luvml;

import luvx.Attr_I;
import java.util.Set;

/**
 * HTML attribute with explicit scope for conflicting attribute names.
 * Used for attributes like "type" that exist in multiple contexts (FORM vs LINK).
 * Metadata is fetched on-demand using composite keys (name:scope).
 */
public class ScopedHtmlAttribute implements Attr_I<ScopedHtmlAttribute> {
    
    private final String name;
    private final String value;
    private final AttributeScope scope;
    
    public ScopedHtmlAttribute(String name, String value, AttributeScope scope) {
        this.name = name;
        this.value = value;
        this.scope = scope;
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
        return scope;
    }
    
    @Override
    public ScopedHtmlAttribute self() {
        return this;
    }
    
    @Override
    public String toString() {
        return name + "=\"" + value + "\"";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof ScopedHtmlAttribute other)) return false;
        return name.equals(other.name) && value.equals(other.value) && scope.equals(other.scope);
    }
    
    @Override
    public int hashCode() {
        return name.hashCode() * 31 + value.hashCode() * 17 + scope.hashCode();
    }
}