package luvml;

import luvx.*;
import java.util.Map;
import java.util.HashMap;
import java.util.regex.Pattern;

/**
 * XML processing instruction for document-level directives.
 * Examples: <?xml version="1.0"?>, <?xml-stylesheet href="style.xsl"?>
 */
public final class ProcessingInstruction implements ProcessingInstruction_I<ProcessingInstruction> {
    
    private final String target;
    private final String data;
    private final Map<String, String> parsedAttributes;
    
    private ProcessingInstruction(String target, String data) {
        this.target = target;
        this.data = data;
        this.parsedAttributes = parseAttributes(data);
    }
    
    /**
     * Parses attributes from processing instruction data.
     * Example: 'version="1.0" encoding="UTF-8"' -> {version=1.0, encoding=UTF-8}
     */
    private static Map<String, String> parseAttributes(String data) {
        var attributes = new HashMap<String, String>();
        if (data == null || data.trim().isEmpty()) {
            return attributes;
        }
        
        // Pattern to match attribute="value" or attribute='value'
        var pattern = Pattern.compile("(\\w+)\\s*=\\s*[\"']([^\"']*)[\"']");
        var matcher = pattern.matcher(data);
        
        while (matcher.find()) {
            attributes.put(matcher.group(1), matcher.group(2));
        }
        
        return attributes;
    }
    
    @Override
    public ProcessingInstruction self() {
        return this;
    }
    
    @Override
    public String target() {
        return target;
    }
    
    @Override
    public String data() {
        return data;
    }
    
    @Override
    public String attr(String name) {
        return parsedAttributes.get(name);
    }
    
    @Override
    public Map<String, String> attributes() {
        return Map.copyOf(parsedAttributes);
    }
    
    // XML declaration
    public static ProcessingInstruction xmlDeclaration() {
        return new ProcessingInstruction("xml", "version=\"1.0\"");
    }
    
    public static ProcessingInstruction xmlDeclaration(String encoding) {
        return new ProcessingInstruction("xml", "version=\"1.0\" encoding=\"" + encoding + "\"");
    }
    
    public static ProcessingInstruction xmlDeclaration(String encoding, boolean standalone) {
        var data = "version=\"1.0\" encoding=\"" + encoding + "\" standalone=\"" + (standalone ? "yes" : "no") + "\"";
        return new ProcessingInstruction("xml", data);
    }
    
    // XML stylesheet
    public static ProcessingInstruction xmlStylesheet(String href) {
        return new ProcessingInstruction("xml-stylesheet", "type=\"text/xsl\" href=\"" + href + "\"");
    }
    
    public static ProcessingInstruction xmlStylesheet(String type, String href) {
        return new ProcessingInstruction("xml-stylesheet", "type=\"" + type + "\" href=\"" + href + "\"");
    }
    
    public static ProcessingInstruction cssStylesheet(String href) {
        return new ProcessingInstruction("xml-stylesheet", "type=\"text/css\" href=\"" + href + "\"");
    }
    
    // Custom processing instruction
    public static ProcessingInstruction custom(String target, String data) {
        return new ProcessingInstruction(target, data);
    }
    
    /**
     * Renders the processing instruction as string.
     */
    public String toDeclaration() {
        return "<?" + target + (data != null && !data.isEmpty() ? " " + data : "") + "?>";
    }
    
    @Override
    public String toString() {
        return toDeclaration();
    }
}