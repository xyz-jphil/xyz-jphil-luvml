package luvml;

import java.util.Set;

/**
 * Scoped enum attribute for conflicting attribute names with validation.
 * Used for attributes like "type" that exist in multiple contexts (FORM vs LINK).
 * Validates enum values using composite keys (name:scope).
 */
public class ScopedEnumAttribute extends ScopedHtmlAttribute {
    
    public ScopedEnumAttribute(String name, String value, AttributeScope scope) {
        super(name, value, scope);
    }
    
    /**
     * Get allowed enum values for this attribute in its specific scope.
     */
    public Set<String> allowedValues() {
        return A.getEnumValues(name() + ":" + scope());
    }
    
    /**
     * Check if the current value is valid for this enum attribute in its scope.
     */
    public boolean isValid() {
        return isValidValue(value());
    }
    
    /**
     * Check if a specific value is valid for this enum attribute in its scope.
     */
    public boolean isValidValue(String value) {
        var allowed = allowedValues();
        return allowed != null && allowed.contains(value);
    }
    
    @Override
    public ScopedEnumAttribute self() {
        return this;
    }
}