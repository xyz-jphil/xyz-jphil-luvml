package luvml;

import luvx.Attr_I;
import java.util.Set;

/**
 * Boolean HTML attribute that is present or absent.
 * Lightweight architecture - fetches metadata on-demand from static maps.
 */
public class BooleanAttribute implements Attr_I<BooleanAttribute> {
    
    private final String name;
    private final boolean present;
    
    public BooleanAttribute(String name) {
        this.name = name;
        this.present = true; // Default to present
    }
    
    public BooleanAttribute(String name, boolean present) {
        this.name = name;
        this.present = present;
    }
    
    @Override
    public String name() {
        return name;
    }
    
    @Override
    public String value() {
        return present ? name : ""; // HTML boolean attributes have name as value when present
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
    
    public boolean isPresent() {
        return present;
    }
    
    @Override
    public BooleanAttribute self() {
        return this;
    }
    
    @Override
    public String toString() {
        return present ? name : "";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof BooleanAttribute other)) return false;
        return name.equals(other.name) && present == other.present;
    }
    
    @Override
    public int hashCode() {
        return name.hashCode() * 31 + Boolean.hashCode(present);
    }
}