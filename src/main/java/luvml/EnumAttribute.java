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
        return A.getAttributeCategories(name);
    }
    
    public AttributeType type() {
        return A.getAttributeType(name);
    }
    
    public AttributeScope scope() {
        return A.getAttributeScope(name);
    }
    
    /**
     * Get allowed enum values for this attribute.
     * Note: For conflicting attributes like "type", this returns the first match.
     * Use ScopedEnumAttribute for scope-specific validation.
     */
    public Set<String> allowedValues() {
        // Try composite key first (for non-conflicting attributes, this returns null)
        var scopeSpecific = A.getEnumValues(name + ":" + scope());
        if (scopeSpecific != null) {
            return scopeSpecific;
        }
        
        // Fallback to simple name lookup
        return A.getEnumValues(name);
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