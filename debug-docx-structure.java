// Debug test to replicate DocxParser structure and find formatting issue
// Run with: jbang --class-path xyz-jphil-luvx-base/target/classes:xyz-jphil-luvml/target/classes debug-docx-structure.java

import luvml.o.*;
import static luvml.E.*;
import static luvml.A.*;
import static luvml.T.*;
import static luvml.Frags.*;
import java.util.*;

class DebugDocxStructure {
    
    public static void main(String[] args) {
        System.out.println("=== Debugging DocxParser Structure ===\n");
        
        // Replicate exactly what DocxParser.parse() does
        testDocxParserStructure();
    }
    
    static void testDocxParserStructure() {
        // Simulate what DocxParser does:
        // 1. Create paragraph list
        var paras = new ArrayList<ContainerElement>();
        paras.add(h1(bid("p001evtawk"), "Heading 1"));
        paras.add(p(bid("p002hUtKSY"), "Para below h1"));
        paras.add(h2(bid("p003ldVpRm"), "Heading 2"));
        paras.add(p(bid("p004bWCASi"), "Para below h2"));
        
        // 2. Create annotation fragments (comments/footnotes)
        var annotationFragments = frags(
            comment(date("2025-06-06T13:45"), author("S H"), bid("c001dDdHlR"), "Test comment"),
            footnote(bid("f001kqoqXR"), "Test footnote")
        );
        
        // 3. Create section exactly like DocxParser does
        System.out.println("=== DocxParser Structure Replication ===");
        var docxSection = section(
            id("DOC-sample_docx"), 
            type("semantic-document"),
            frags(paras.toArray(new ContainerElement[0])),  // This is what DocxParser does
            annotationFragments
        );
        
        System.out.println("DocxParser-style structure:");
        System.out.println(HtmlRenderer.asFormattedString(docxSection));
        
        System.out.println("\n" + "=".repeat(60) + "\n");
        
        // 4. Compare with direct children approach
        System.out.println("=== Direct Children Approach ===");
        var directSection = section(
            id("DOC-sample_docx"), 
            type("semantic-document"),
            h1(bid("p001evtawk"), "Heading 1"),
            p(bid("p002hUtKSY"), "Para below h1"), 
            h2(bid("p003ldVpRm"), "Heading 2"),
            p(bid("p004bWCASi"), "Para below h2"),
            annotationFragments
        );
        
        System.out.println("Direct children structure:");
        System.out.println(HtmlRenderer.asFormattedString(directSection));
        
        System.out.println("\n=== Analysis ===");
        System.out.println("If both render the same, the issue is elsewhere.");
        System.out.println("If different, we found the structure issue.");
    }
}