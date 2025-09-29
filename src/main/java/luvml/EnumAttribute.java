package luvml;

import luvx.Attr_I;
import java.util.Set;

/**
 * HTML attribute with enumerated values from a predefined set.
 * Lightweight architecture - fetches allowed values on-demand from static maps.
 */
public class EnumAttribute implements Attr_I<EnumAttribute> {
    
    private final String name;
    private final String value;
    
    public EnumAttribute(String name, String value) {
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

    /**
     * Get allowed enum values for this attribute.
     * Note: For conflicting attributes like "type", this returns the first match.
     * Use ScopedEnumAttribute for scope-specific validation.
     */
    public Set<String> allowedValues() {
        var data = HtmlAttributeData.get(name);
        return data != null ? data.enumValues() : Set.of();
    }
    
    /**
     * Check if the current value is valid for this enum attribute.
     */
    public boolean isValid() {
        return isValidValue(value);
    }
    
    /**
     * Check if a specific value is valid for this enum attribute.
     */
    public boolean isValidValue(String value) {
        var allowed = allowedValues();
        return allowed != null && allowed.contains(value);
    }
    
    @Override
    public EnumAttribute self() {
        return this;
    }
    
    @Override
    public String toString() {
        return name + "=\"" + value + "\"";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof EnumAttribute other)) return false;
        return name.equals(other.name) && value.equals(other.value);
    }
    
    @Override
    public int hashCode() {
        return name.hashCode() * 31 + value.hashCode();
    }
}