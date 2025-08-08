// Test to understand how frags() vs individual children work in LuvML DSL
// Run with: jbang --class-path xyz-jphil-luvx-base/target/classes:xyz-jphil-luvml/target/classes test-frags-structure.java

import luvml.o.*;
import static luvml.E.*;
import static luvml.A.*;
import static luvml.T.*;
import static luvml.Frags.*;

class TestFragsStructure {
    
    public static void main(String[] args) {
        System.out.println("=== Testing Frags Structure ===\n");
        
        // Test 1: Individual children (what we want)
        System.out.println("1. Section with individual paragraph children:");
        var section1 = section(
            id("test1"),
            p("Paragraph 1"),
            p("Paragraph 2"),
            p("Paragraph 3")
        );
        System.out.println(HtmlRenderer.asFormattedString(section1));
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Test 2: Using frags() wrapper (current approach)
        System.out.println("2. Section with frags() wrapper:");
        var paragraphs = java.util.List.of(
            p("Paragraph 1"),
            p("Paragraph 2"), 
            p("Paragraph 3")
        );
        var section2 = section(
            id("test2"),
            frags(paragraphs.toArray(new luvx.Frag_I[0]))
        );
        System.out.println(HtmlRenderer.asFormattedString(section2));
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Test 3: Mixed approach
        System.out.println("3. Section with mixed individual + frags:");
        var section3 = section(
            id("test3"),
            p("First paragraph"),
            frags(paragraphs.toArray(new luvx.Frag_I[0])),
            p("Last paragraph")
        );
        System.out.println(HtmlRenderer.asFormattedString(section3));
        
        System.out.println("\n=== Analysis ===");
        System.out.println("This will show us whether frags() creates a separate rendering path");
        System.out.println("or if it properly integrates paragraphs as direct children.");
    }
}