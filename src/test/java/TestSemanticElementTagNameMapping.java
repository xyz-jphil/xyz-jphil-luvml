// Test script for SemanticElementTagNameClassNameMapping
// First build: mvn clean compile -f xyz-jphil-luvx-base && mvn clean compile -f xyz-jphil-luvml
// Then run: mvn test-compile -f xyz-jphil-luvml && mvn exec:java -f xyz-jphil-luvml -Dexec.mainClass="TestSemanticElementTagNameMapping" -Dexec.classpathScope=test

import luvml.element.SemanticElementTagNameClassNameMapping;
import static luvml.element.SemanticElementTagNameClassNameMapping.*;
import testpkg.svg.Circle_E;
import testpkg.xlink.Href_E;

public class TestSemanticElementTagNameMapping {

    public static void main(String[] args) {
        System.out.println("=== Testing SemanticElementTagNameClassNameMapping ===\n");

        testCamelCase();
        testLowerCase();
        testUpperCase();
        testPreserveCase();
        testPreserveClassName();
        testLowerKebabAtUnderscores();
        testLowerKebabFromCamelCase();
        testXmlNamespaceColonAtUnderscores();
        testXmlNamespaceColonFromParentPackage();

        System.out.println("\n=== All tests completed ===");
    }

    @SuppressWarnings("unchecked")
    static void testCamelCase() {
        System.out.println("1. CamelCase_E test:");
        System.out.println("   MyElement_E -> " + CAMEL_CASE.tagNameFromClass((Class) MyElement_E.class));
        System.out.println("   Expected: myElement");
        System.out.println();
    }

    @SuppressWarnings("unchecked")
    static void testLowerCase() {
        System.out.println("2. LowerCase_E test:");
        System.out.println("   Div_E -> " + LOWER_CASE.tagNameFromClass((Class) Div_E.class));
        System.out.println("   Expected: div");
        System.out.println();
    }

    @SuppressWarnings("unchecked")
    static void testUpperCase() {
        System.out.println("3. UpperCase_E test:");
        System.out.println("   MyElement_E -> " + UPPER_CASE.tagNameFromClass((Class) MyElement_E.class));
        System.out.println("   Expected: MYELEMENT");
        System.out.println();
    }

    @SuppressWarnings("unchecked")
    static void testPreserveCase() {
        System.out.println("4. PreserveCase_E test:");
        System.out.println("   ViewBox_E -> " + PRESERVE_CASE.tagNameFromClass((Class) ViewBox_E.class));
        System.out.println("   Expected: ViewBox");
        System.out.println();
    }

    @SuppressWarnings("unchecked")
    static void testPreserveClassName() {
        System.out.println("5. PreserveClassName test:");
        System.out.println("   MyElement_E -> " + PRESERVE_CLASS_NAME.tagNameFromClass((Class) MyElement_E.class));
        System.out.println("   Expected: MyElement_E");
        System.out.println();
    }

    @SuppressWarnings("unchecked")
    static void testLowerKebabAtUnderscores() {
        System.out.println("6. LowerKebabAtUnderscores_E test:");
        System.out.println("   My_Custom_Element_E -> " + LOWER_KEBAB_AT_UNDERSCORES.tagNameFromClass((Class) My_Custom_Element_E.class));
        System.out.println("   Expected: my-custom-element");
        System.out.println();
    }

    @SuppressWarnings("unchecked")
    static void testLowerKebabFromCamelCase() {
        System.out.println("7. LowerKebabFromCamelCase_E test:");
        System.out.println("   MyCustomElement_E -> " + LOWER_KEBAB_FROM_CAMEL_CASE.tagNameFromClass((Class) MyCustomElement_E.class));
        System.out.println("   Expected: my-custom-element");
        System.out.println();
    }

    @SuppressWarnings("unchecked")
    static void testXmlNamespaceColonAtUnderscores() {
        System.out.println("8. XmlNamespaceColonAtUnderscores_E test:");
        System.out.println("   Svg_Circle_E -> " + XML_NAMESPACE_COLON_AT_UNDERSCORES.tagNameFromClass((Class) Svg_Circle_E.class));
        System.out.println("   Xlink_Href_E -> " + XML_NAMESPACE_COLON_AT_UNDERSCORES.tagNameFromClass((Class) Xlink_Href_E.class));
        System.out.println("   Expected: svg:circle, xlink:href");
        System.out.println();
    }

    @SuppressWarnings("unchecked")
    static void testXmlNamespaceColonFromParentPackage() {
        System.out.println("9. XmlNamespaceColonFromParentPackage_E test:");
        System.out.println("   svg.Circle_E -> " + XML_NAMESPACE_COLON_FROM_PARENT_PACKAGE.tagNameFromClass((Class) Circle_E.class));
        System.out.println("   xlink.Href_E -> " + XML_NAMESPACE_COLON_FROM_PARENT_PACKAGE.tagNameFromClass((Class) Href_E.class));
        System.out.println("   Expected: svg:circle, xlink:href");
        System.out.println();
    }

    // Test element classes - using interfaces instead of SemanticElement_I (which is sealed)
    static class MyElement_E implements CamelCase_E {
        public String tagNameFromClass(Class clss) { return null; }
    }
    static class Div_E implements LowerCase_E {
        public String tagNameFromClass(Class clss) { return null; }
    }
    static class ViewBox_E implements PreserveCase_E {
        public String tagNameFromClass(Class clss) { return null; }
    }
    static class My_Custom_Element_E implements LowerKebabAtUnderscores_E {
        public String tagNameFromClass(Class clss) { return null; }
    }
    static class MyCustomElement_E implements LowerKebabFromCamelCase_E {
        public String tagNameFromClass(Class clss) { return null; }
    }
    static class Svg_Circle_E implements XmlNamespaceColonAtUnderscores_E {
        public String tagNameFromClass(Class clss) { return null; }
    }
    static class Xlink_Href_E implements XmlNamespaceColonAtUnderscores_E {
        public String tagNameFromClass(Class clss) { return null; }
    }
}
