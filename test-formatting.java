import luvml.o.*;
import static luvml.E.*;
import static luvml.T.*;

public class TestFormatting {
    public static void main(String[] args) {
        System.out.println("=== Testing Single Child Formatting ===");
        
        // Test single text child - should be inline
        var h1 = h1("Simple Heading");
        System.out.println("Single text child:");
        System.out.println(HtmlRenderer.asFormattedString(h1));
        System.out.println();
        
        // Test multiple children - should be multi-line
        var p = p(strong("Bold"), text(" and "), em("italic"), text(" text"));
        System.out.println("Multiple children:");
        System.out.println(HtmlRenderer.asFormattedString(p));
        System.out.println();
    }
}