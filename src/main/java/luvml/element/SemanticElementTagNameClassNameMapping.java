package luvml.element;

import luvml.element.SemanticElement_I;

public interface SemanticElementTagNameClassNameMapping {
    String tagNameFromClass(Class<? extends SemanticElement_I> clss);

    public static String classTagName(Class<? extends SemanticElement_I> clss){
        if(CamelCase_E.class.isAssignableFrom(clss)){
            return CAMEL_CASE.tagNameFromClass(clss);
        }else if(LowerCase_E.class.isAssignableFrom(clss)){
            return LOWER_CASE.tagNameFromClass(clss);
        }else if(UpperCase_E.class.isAssignableFrom(clss)){
            return UPPER_CASE.tagNameFromClass(clss);
        }else if(PreserveCase_E.class.isAssignableFrom(clss)){
            return PRESERVE_CASE.tagNameFromClass(clss);
        }else if(PreserveClassName.class.isAssignableFrom(clss)){
            return PRESERVE_CLASS_NAME.tagNameFromClass(clss);
        }else if(LowerKebabAtUnderscores_E.class.isAssignableFrom(clss)){
            return LOWER_KEBAB_AT_UNDERSCORES.tagNameFromClass(clss);
        }else if(LowerKebabFromCamelCase_E.class.isAssignableFrom(clss)){
            return LOWER_KEBAB_FROM_CAMEL_CASE.tagNameFromClass(clss);
        }else if(XmlNamespaceColonAtUnderscores_E.class.isAssignableFrom(clss)){
            return XML_NAMESPACE_COLON_AT_UNDERSCORES.tagNameFromClass(clss);
        }else if(XmlNamespaceColonFromParentPackage_E.class.isAssignableFrom(clss)){
            return XML_NAMESPACE_COLON_FROM_PARENT_PACKAGE.tagNameFromClass(clss);
        }else if(SemanticElementTagNameClassNameMapping.class.isAssignableFrom(clss)){
            try {
                var x = clss.getConstructor().newInstance();
                return ((SemanticElementTagNameClassNameMapping)x).tagNameFromClass(clss);
            } catch (Exception e) {
                throw new IllegalArgumentException(e);
            }
        }
        throw new IllegalArgumentException();
    }

    public static String objTagName(Object obj, Class<? extends SemanticElement_I> clss) {
        return ((SemanticElementTagNameClassNameMapping)obj).tagNameFromClass(clss);
    }

    // CamelCase: MyElement_E -> myElement (JSX/React style)
    public static final CamelCase_E CAMEL_CASE = new CamelCase_E() {};
    public interface CamelCase_E extends SemanticElementTagNameClassNameMapping {
        default public String tagNameFromClass(Class<? extends SemanticElement_I> clss){
            var n = clss.getSimpleName();
            if(n.endsWith("_E")) n = n.substring(0,n.length()-2);
            if(n.length()>0)
                n = Character.toLowerCase(n.charAt(0))+n.substring(1);
            return n;
        }
    }

    // LowerCase: MyElement_E -> myelement (standard HTML)
    public static final LowerCase_E LOWER_CASE = new LowerCase_E() {};
    public interface LowerCase_E extends SemanticElementTagNameClassNameMapping {
        default public String tagNameFromClass(Class<? extends SemanticElement_I> clss){
            var n = clss.getSimpleName();
            if(n.endsWith("_E")) n = n.substring(0,n.length()-2);
            return n.toLowerCase();
        }
    }

    // UpperCase: MyElement_E -> MYELEMENT
    public static final UpperCase_E UPPER_CASE = new UpperCase_E() {};
    public interface UpperCase_E extends SemanticElementTagNameClassNameMapping {
        default public String tagNameFromClass(Class<? extends SemanticElement_I> clss){
            var n = clss.getSimpleName();
            if(n.endsWith("_E")) n = n.substring(0,n.length()-2);
            return n.toUpperCase();
        }
    }

    // PreserveCase: MyElement_E -> MyElement (strips _E suffix, preserves case)
    public static final PreserveCase_E PRESERVE_CASE = new PreserveCase_E() {};
    public interface PreserveCase_E extends SemanticElementTagNameClassNameMapping {
        default public String tagNameFromClass(Class<? extends SemanticElement_I> clss){
            var n = clss.getSimpleName();
            if(n.endsWith("_E")) n = n.substring(0,n.length()-2);
            return n;
        }
    }

    // PreserveClassName: MyElement_E -> MyElement_E (keeps exact class name including _E)
    public static final PreserveClassName PRESERVE_CLASS_NAME = new PreserveClassName() {};
    public interface PreserveClassName extends SemanticElementTagNameClassNameMapping {
        default public String tagNameFromClass(Class<? extends SemanticElement_I> clss){
            return clss.getSimpleName();
        }
    }

    // LowerKebabAtUnderscores: My_Element_E -> my-element
    public static final LowerKebabAtUnderscores_E LOWER_KEBAB_AT_UNDERSCORES = new LowerKebabAtUnderscores_E() {};
    public interface LowerKebabAtUnderscores_E extends SemanticElementTagNameClassNameMapping {
        default public String tagNameFromClass(Class<? extends SemanticElement_I> clss){
            var n = clss.getSimpleName();
            if(n.endsWith("_E")) n = n.substring(0,n.length()-2);
            n = n.replace("_", "-").toLowerCase();
            return n;
        }
    }

    // LowerKebabFromCamelCase: MyElement_E -> my-element (web components standard)
    public static final LowerKebabFromCamelCase_E LOWER_KEBAB_FROM_CAMEL_CASE = new LowerKebabFromCamelCase_E() {};
    public interface LowerKebabFromCamelCase_E extends SemanticElementTagNameClassNameMapping {
        default public String tagNameFromClass(Class<? extends SemanticElement_I> clss){
            var n = clss.getSimpleName();
            if(n.endsWith("_E")) n = n.substring(0,n.length()-2);
            var x = new StringBuilder();
            for (int i = 0; i < n.length(); i++) {
                var ch = n.charAt(i);
                if(Character.isUpperCase(ch) && i > 0){
                    x.append("-");
                }
                x.append(Character.toLowerCase(ch));
            }
            return x.toString();
        }
    }

    // XmlNamespaceColonAtUnderscores: Svg_Circle_E -> svg:circle (XML namespace from underscore)
    public static final XmlNamespaceColonAtUnderscores_E XML_NAMESPACE_COLON_AT_UNDERSCORES = new XmlNamespaceColonAtUnderscores_E() {};
    public interface XmlNamespaceColonAtUnderscores_E extends SemanticElementTagNameClassNameMapping {
        default public String tagNameFromClass(Class<? extends SemanticElement_I> clss){
            var n = clss.getSimpleName();
            if(n.endsWith("_E")) n = n.substring(0,n.length()-2);
            n = n.replace("_", ":").toLowerCase();
            return n;
        }
    }

    // XmlNamespaceColonFromParentPackage: mypackage.svg.Circle_E -> svg:circle (XML namespace from parent package name)
    public static final XmlNamespaceColonFromParentPackage_E XML_NAMESPACE_COLON_FROM_PARENT_PACKAGE = new XmlNamespaceColonFromParentPackage_E() {};
    public interface XmlNamespaceColonFromParentPackage_E extends SemanticElementTagNameClassNameMapping {
        default public String tagNameFromClass(Class<? extends SemanticElement_I> clss){
            var n = clss.getSimpleName();
            if(n.endsWith("_E")) n = n.substring(0,n.length()-2);
            var pkg = clss.getPackageName();
            var lastDot = pkg.lastIndexOf('.');
            var namespace = lastDot >= 0 ? pkg.substring(lastDot + 1) : pkg;
            return namespace.toLowerCase() + ":" + n.toLowerCase();
        }
    }

}
