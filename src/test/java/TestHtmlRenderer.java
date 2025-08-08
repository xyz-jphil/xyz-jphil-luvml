// Test script for HTML renderer 
// First build: mvn clean compile -f xyz-jphil-luvx-base && mvn clean compile -f xyz-jphil-luvml
// Then run: jbang --class-path xyz-jphil-luvx-base/target/classes:xyz-jphil-luvml/target/classes test-scripts/TestHtmlRenderer.java

import luvml.o.*;
import static luvml.E.*;
import static luvml.A.*;
import static luvml.T.*;
import static luvml.Util_E.*;
import static luvml.Util_A.*;

public class TestHtmlRenderer {
    
    public static void main(String[] args) {
        System.out.println("=== Testing HTML Renderer ===\n");
        
        testBasicElement();
        testFormattedOutput();
        testXhtmlMode();
        testTextEscaping();
        testComplexDocument();
    }
    
    static void testBasicElement() {
        System.out.println("1. Basic element test:");
        var div = div("Hello World");
        System.out.println(HtmlRenderer.asString(div));
        System.out.println();
    }
    
    static void testFormattedOutput() {
        System.out.println("2. Formatted output test:");
        var nested = div(
            h1("Title"),
            p("Paragraph content"),
            ul(
                li("Item 1"),
                li("Item 2")
            )
        );
        System.out.println(HtmlRenderer.asFormattedString(nested));
        System.out.println();
    }
    
    static void testXhtmlMode() {
        System.out.println("3. XHTML mode test:");
        var img = img(src("test.jpg"), alt("Test image"));
        
        // HTML5 mode (default)
        var out1 = new StringBuilderOut(config -> config.htmlMode());
        HtmlRenderer.render(img, out1);
        System.out.println("HTML5: " + out1.render());
        
        // XHTML mode
        var out2 = new StringBuilderOut(config -> config.xhtmlMode(true));
        HtmlRenderer.render(img, out2);
        System.out.println("XHTML: " + out2.render());
        System.out.println();
    }
    
    static void testTextEscaping() {
        System.out.println("4. Text escaping test:");
        var content = div(
            text("Text with <tags> & \"quotes\""),
            comment("This is a comment"),
            inlineCData("Raw <content> here")
        );
        System.out.println(HtmlRenderer.asString(content));
        System.out.println();
    }
    
    static void testComplexDocument() {
        System.out.println("5. Complex document test:");
        var doc = html(
            head(
                title("Test Document"),
                meta_charset_utf8()
            ),
            body(
                div(id("header"), class_("main-header"),
                    h1("Welcome")
                ),
                div(class_("content"),
                    p(
                      text("This is a test paragraph with "),
                      strong("bold text"),
                      text(" and "),
                      em("italic text"),
                      text(".")
                    )
                )
            )
        );
        System.out.println(HtmlRenderer.asFormattedString(doc));
    }
}