package luvml;

import java.util.*;
import static java.util.Collections.EMPTY_SET;

import static java.util.Set.of;
import static luvml.AttributeCategory.*;
import static luvml.AttributeType.*;
import static luvml.AttributeScope.*;

public record HtmlAttributeData(
    String attribute,
    Set<AttributeCategory> categories,
    AttributeType type,
    AttributeScope scope,
    String description,
    Set<String> enumValues  // For ENUM type attributes
) {
    
    private static Set<AttributeCategory> categories(AttributeCategory... categories) {
        if(categories==null || categories.length<1)return EMPTY_SET;
        return of(categories);
    }
    
    
    
    private static Set<String> enumValues(String... values) {
        return values.length == 0 ? Set.of() : of(values);
    }
    
    private static HtmlAttributeData attribute(String name, AttributeType type, AttributeScope scope,
                                             Set<AttributeCategory> categories, String description) {
        return new HtmlAttributeData(name, categories, type, scope, description, Set.of());
    }
    
    private static HtmlAttributeData enumAttribute(String name, AttributeScope scope,
                                                 Set<AttributeCategory> categories, String description,
                                                 String... enumValues) {
        return new HtmlAttributeData(name, categories, ENUM, scope, description, of(enumValues));
    }
    
    public static final Map<String, HtmlAttributeData> ALL_ATTRIBUTES = allattributes();

    private static final Map<String, HtmlAttributeData> allattributes(){
        var map = new LinkedHashMap<String, HtmlAttributeData>();
        // Will convert List.of() to map.put() calls
        map.put("accesskey",
        // Global attributes
        attribute("accesskey", STRING, UNIVERSAL, categories(GLOBAL), "Keyboard shortcut for element"));
        map.put("class",attribute("class", TOKEN_LIST, UNIVERSAL, categories(GLOBAL), "CSS class names"));
        map.put("contenteditable",enumAttribute("contenteditable", UNIVERSAL, categories(GLOBAL), "Whether content is editable", "true", "false", "plaintext-only"));
        map.put("dir",enumAttribute("dir", UNIVERSAL, categories(GLOBAL), "Text directionality", "ltr", "rtl", "auto"));
        map.put("draggable",attribute("draggable", BOOLEAN, UNIVERSAL, categories(GLOBAL), "Whether element is draggable"));
        map.put("hidden",attribute("hidden", BOOLEAN, UNIVERSAL, categories(GLOBAL), "Whether element is hidden"));
        map.put("id",attribute("id", STRING, UNIVERSAL, categories(GLOBAL), "Unique identifier"));
        map.put("lang",attribute("lang", LANGUAGE, UNIVERSAL, categories(GLOBAL), "Language of element content"));
        map.put("spellcheck",attribute("spellcheck", BOOLEAN, UNIVERSAL, categories(GLOBAL), "Whether to check spelling"));
        map.put("style",attribute("style", STRING, UNIVERSAL, categories(GLOBAL), "Inline CSS styles"));
        map.put("tabindex",attribute("tabindex", NUMBER, UNIVERSAL, categories(GLOBAL), "Tab order for keyboard navigation"));
        map.put("title",attribute("title", STRING, UNIVERSAL, categories(GLOBAL), "Advisory information about element"));
        map.put("translate",enumAttribute("translate", UNIVERSAL, categories(GLOBAL), "Whether content should be translated", "yes", "no"));

        // Data attributes (template)
        map.put("data-*",attribute("data-*", STRING, UNIVERSAL, categories(GLOBAL, DATA), "Custom data attributes"));

        // Event handler attributes (common ones)
        map.put("onclick",attribute("onclick", SCRIPT, UNIVERSAL, categories(GLOBAL, EVENT), "Click event handler"));
        map.put("onload",attribute("onload", SCRIPT, UNIVERSAL, categories(GLOBAL, EVENT), "Load event handler"));
        map.put("onchange",attribute("onchange", SCRIPT, UNIVERSAL, categories(GLOBAL, EVENT), "Change event handler"));
        map.put("onsubmit",attribute("onsubmit", SCRIPT, UNIVERSAL, categories(GLOBAL, EVENT), "Submit event handler"));
        map.put("onfocus",attribute("onfocus", SCRIPT, UNIVERSAL, categories(GLOBAL, EVENT), "Focus event handler"));
        map.put("onblur",attribute("onblur", SCRIPT, UNIVERSAL, categories(GLOBAL, EVENT), "Blur event handler"));

        // ARIA attributes (selection)
        map.put("aria-label",attribute("aria-label", STRING, UNIVERSAL, categories(ACCESSIBILITY), "Accessible name for element"));
        map.put("aria-labelledby",attribute("aria-labelledby", TOKEN_LIST, UNIVERSAL, categories(ACCESSIBILITY), "IDs of elements that label this element"));
        map.put("aria-describedby",attribute("aria-describedby", TOKEN_LIST, UNIVERSAL, categories(ACCESSIBILITY), "IDs of elements that describe this element"));
        map.put("aria-hidden",attribute("aria-hidden", BOOLEAN, UNIVERSAL, categories(ACCESSIBILITY), "Whether element is hidden from assistive technology"));
        map.put("aria-expanded",enumAttribute("aria-expanded", UNIVERSAL, categories(ACCESSIBILITY), "Whether collapsible element is expanded", "true", "false", "undefined"));

        // Form attributes
        map.put("accept",attribute("accept", COMMA_LIST, FORM_ELEMENTS, categories(FORM), "File types the server accepts"));
        map.put("accept-charset",attribute("accept-charset", TOKEN_LIST, FORM_ELEMENTS, categories(FORM), "Character encodings for form submission"));
        map.put("action",attribute("action", URL, FORM_ELEMENTS, categories(FORM), "URL for form submission"));
        map.put("autocomplete",enumAttribute("autocomplete", FORM_ELEMENTS, categories(FORM), "Whether form control should have autocomplete", "on", "off", "name", "email", "username", "current-password", "new-password"));
        map.put("autofocus",attribute("autofocus", BOOLEAN, FORM_ELEMENTS, categories(FORM), "Whether element should be focused on page load"));
        map.put("checked",attribute("checked", BOOLEAN, FORM_ELEMENTS, categories(FORM), "Whether input is checked"));
        map.put("disabled",attribute("disabled", BOOLEAN, FORM_ELEMENTS, categories(FORM), "Whether form control is disabled"));
        map.put("enctype",enumAttribute("enctype", FORM_ELEMENTS, categories(FORM), "Encoding type for form submission", "application/x-www-form-urlencoded", "multipart/form-data", "text/plain"));
        map.put("for",attribute("for", STRING, FORM_ELEMENTS, categories(FORM), "ID of form control this label is for"));
        map.put("form",attribute("form", STRING, FORM_ELEMENTS, categories(FORM), "ID of form this element belongs to"));
        map.put("formaction",attribute("formaction", URL, FORM_ELEMENTS, categories(FORM), "URL for form submission (overrides form action)"));
        map.put("formenctype",enumAttribute("formenctype", FORM_ELEMENTS, categories(FORM), "Encoding type (overrides form enctype)", "application/x-www-form-urlencoded", "multipart/form-data", "text/plain"));
        map.put("formmethod",enumAttribute("formmethod", FORM_ELEMENTS, categories(FORM), "HTTP method (overrides form method)", "get", "post"));
        map.put("formnovalidate",attribute("formnovalidate", BOOLEAN, FORM_ELEMENTS, categories(FORM), "Skip form validation on submission"));
        map.put("formtarget",attribute("formtarget", STRING, FORM_ELEMENTS, categories(FORM), "Target for form submission (overrides form target)"));
        map.put("max",attribute("max", STRING, FORM_ELEMENTS, categories(FORM), "Maximum value for input"));
        map.put("maxlength",attribute("maxlength", NUMBER, FORM_ELEMENTS, categories(FORM), "Maximum number of characters"));
        map.put("method",enumAttribute("method", FORM_ELEMENTS, categories(FORM), "HTTP method for form submission", "get", "post"));
        map.put("min",attribute("min", STRING, FORM_ELEMENTS, categories(FORM), "Minimum value for input"));
        map.put("minlength",attribute("minlength", NUMBER, FORM_ELEMENTS, categories(FORM), "Minimum number of characters"));
        map.put("multiple",attribute("multiple", BOOLEAN, FORM_ELEMENTS, categories(FORM), "Whether multiple values are allowed"));
        map.put("name",attribute("name", STRING, FORM_ELEMENTS, categories(FORM), "Name of form control"));
        map.put("novalidate",attribute("novalidate", BOOLEAN, FORM_ELEMENTS, categories(FORM), "Skip form validation"));
        map.put("pattern",attribute("pattern", REGEX, FORM_ELEMENTS, categories(FORM), "Regular expression for input validation"));
        map.put("placeholder",attribute("placeholder", STRING, FORM_ELEMENTS, categories(FORM), "Placeholder text for input"));
        map.put("readonly",attribute("readonly", BOOLEAN, FORM_ELEMENTS, categories(FORM), "Whether form control is read-only"));
        map.put("required",attribute("required", BOOLEAN, FORM_ELEMENTS, categories(FORM), "Whether form control is required"));
        map.put("selected",attribute("selected", BOOLEAN, FORM_ELEMENTS, categories(FORM), "Whether option is selected"));
        map.put("size",attribute("size", NUMBER, FORM_ELEMENTS, categories(FORM), "Size of form control"));
        map.put("step",attribute("step", STRING, FORM_ELEMENTS, categories(FORM), "Step value for numeric inputs"));
        map.put("target",enumAttribute("target", FORM_ELEMENTS, categories(FORM), "Target for form submission", "_blank", "_self", "_parent", "_top"));
        map.put("type",enumAttribute("type", FORM_ELEMENTS, categories(FORM), "Type of input control", 
                "text", "password", "email", "url", "tel", "search", "number", "range", "date", "time", "datetime-local", 
                "month", "week", "color", "file", "hidden", "checkbox", "radio", "submit", "reset", "button", "image"));
        map.put("value",attribute("value", STRING, FORM_ELEMENTS, categories(FORM), "Value of form control"));

        // Media attributes
        map.put("alt",attribute("alt", STRING, MEDIA_ELEMENTS, categories(MEDIA), "Alternative text for image"));
        map.put("autoplay",attribute("autoplay", BOOLEAN, MEDIA_ELEMENTS, categories(MEDIA), "Whether media should autoplay"));
        map.put("controls",attribute("controls", BOOLEAN, MEDIA_ELEMENTS, categories(MEDIA), "Whether media controls should be shown"));
        map.put("crossorigin",enumAttribute("crossorigin", MEDIA_ELEMENTS, categories(MEDIA), "CORS settings for media", "anonymous", "use-credentials"));
        map.put("height",attribute("height", DIMENSION, MEDIA_ELEMENTS, categories(MEDIA), "Height of media element"));
        map.put("loop",attribute("loop", BOOLEAN, MEDIA_ELEMENTS, categories(MEDIA), "Whether media should loop"));
        map.put("muted",attribute("muted", BOOLEAN, MEDIA_ELEMENTS, categories(MEDIA), "Whether media should be muted"));
        map.put("preload",enumAttribute("preload", MEDIA_ELEMENTS, categories(MEDIA), "How media should be preloaded", "none", "metadata", "auto"));
        map.put("poster",attribute("poster", URL, MEDIA_ELEMENTS, categories(MEDIA), "Poster image for video"));
        map.put("src",attribute("src", URL, MEDIA_ELEMENTS, categories(MEDIA), "Source URL for media"));
        map.put("srcset",attribute("srcset", STRING, MEDIA_ELEMENTS, categories(MEDIA), "Set of source images with descriptors"));
        map.put("width",attribute("width", DIMENSION, MEDIA_ELEMENTS, categories(MEDIA), "Width of media element"));

        // Link attributes
        map.put("download",attribute("download", STRING, LINK_ELEMENTS, categories(LINK), "Filename for download"));
        map.put("href",attribute("href", URL, LINK_ELEMENTS, categories(LINK), "Hyperlink reference"));
        map.put("hreflang",attribute("hreflang", LANGUAGE, LINK_ELEMENTS, categories(LINK), "Language of linked resource"));
        map.put("ping",attribute("ping", TOKEN_LIST, LINK_ELEMENTS, categories(LINK), "URLs to ping when link is followed"));
        map.put("referrerpolicy",enumAttribute("referrerpolicy", LINK_ELEMENTS, categories(LINK), "Referrer policy for link", 
                "no-referrer", "no-referrer-when-downgrade", "origin", "origin-when-cross-origin", "same-origin", "strict-origin", "strict-origin-when-cross-origin", "unsafe-url"));
        map.put("rel",enumAttribute("rel", LINK_ELEMENTS, categories(LINK), "Relationship to linked resource",
                "alternate", "author", "bookmark", "canonical", "dns-prefetch", "external", "help", "icon", "license", "manifest", "next", "nofollow", "noopener", "noreferrer", "opener", "prev", "preconnect", "prefetch", "preload", "prerender", "search", "stylesheet", "tag"));
        map.put("sizes",attribute("sizes", TOKEN_LIST, LINK_ELEMENTS, categories(LINK), "Sizes of linked resource (for icons)"));
        map.put("type",enumAttribute("type", LINK_ELEMENTS, categories(LINK), "MIME type of linked resource", "text/css", "text/javascript", "image/x-icon", "application/rss+xml"));

        // Table attributes
        map.put("colspan",attribute("colspan", NUMBER, TABLE_ELEMENTS, categories(TABLE), "Number of columns cell spans"));
        map.put("rowspan",attribute("rowspan", NUMBER, TABLE_ELEMENTS, categories(TABLE), "Number of rows cell spans"));
        map.put("headers",attribute("headers", TOKEN_LIST, TABLE_ELEMENTS, categories(TABLE), "IDs of header cells for this cell"));
        map.put("scope",enumAttribute("scope", TABLE_ELEMENTS, categories(TABLE), "Scope of header cell", "row", "col", "rowgroup", "colgroup"));
        map.put("span",attribute("span", NUMBER, TABLE_ELEMENTS, categories(TABLE), "Number of columns in column group"));

        // Interactive attributes
        map.put("open",attribute("open", BOOLEAN, INTERACTIVE_ELEMENTS, categories(INTERACTIVE), "Whether details element is open"));

        // Metadata attributes
        map.put("charset",attribute("charset", CHARSET, METADATA_ELEMENTS, categories(METADATA), "Character encoding"));
        map.put("content",attribute("content", STRING, METADATA_ELEMENTS, categories(METADATA), "Value of meta element"));
        map.put("http-equiv",attribute("http-equiv", STRING, METADATA_ELEMENTS, categories(METADATA), "HTTP header name"));
        map.put("media",attribute("media", STRING, METADATA_ELEMENTS, categories(METADATA), "Media query for linked resource"));

        // Microdata attributes
        map.put("itemid",attribute("itemid", URL, UNIVERSAL, categories(MICRODATA), "Global identifier for microdata item"));
        map.put("itemprop",attribute("itemprop", TOKEN_LIST, UNIVERSAL, categories(MICRODATA), "Microdata property names"));
        map.put("itemref",attribute("itemref", TOKEN_LIST, UNIVERSAL, categories(MICRODATA), "IDs of additional microdata properties"));
        map.put("itemscope",attribute("itemscope", BOOLEAN, UNIVERSAL, categories(MICRODATA), "Whether element is microdata item"));
        map.put("itemtype",attribute("itemtype", URL, UNIVERSAL, categories(MICRODATA), "Microdata vocabulary URL"));

        // Specific element attributes
        map.put("coords",attribute("coords", COMMA_LIST, SPECIFIC_ELEMENTS, categories(null), "Coordinates for area element"));
        map.put("shape",enumAttribute("shape", SPECIFIC_ELEMENTS, categories(null), "Shape of area element", "rect", "circle", "poly", "default"));
        map.put("usemap",attribute("usemap", STRING, SPECIFIC_ELEMENTS, categories(null), "Name of image map to use"));
        map.put("wrap",enumAttribute("wrap", SPECIFIC_ELEMENTS, categories(null), "How text should wrap in textarea", "soft", "hard"));
        map.put("rows",attribute("rows", NUMBER, SPECIFIC_ELEMENTS, categories(null), "Number of rows in textarea"));
        map.put("cols",attribute("cols", NUMBER, SPECIFIC_ELEMENTS, categories(null), "Number of columns in textarea"));
        map.put("start",attribute("start", NUMBER, SPECIFIC_ELEMENTS, categories(null), "Starting number for ordered list"));
        map.put("reversed",attribute("reversed", BOOLEAN, SPECIFIC_ELEMENTS, categories(null), "Whether ordered list is reversed"));
        map.put("kind",enumAttribute("kind", SPECIFIC_ELEMENTS, categories(null), "Kind of text track", "subtitles", "captions", "descriptions", "chapters", "metadata"));
        map.put("srclang",attribute("srclang", LANGUAGE, SPECIFIC_ELEMENTS, categories(null), "Language of text track"));
        map.put("label",attribute("label", STRING, SPECIFIC_ELEMENTS, categories(null), "User-readable title for text track"));
        map.put("default",attribute("default", BOOLEAN, SPECIFIC_ELEMENTS, categories(null), "Whether track should be enabled by default"));

        // Deprecated attributes (common ones still encountered)
        map.put("align",attribute("align", STRING, SPECIFIC_ELEMENTS, categories(DEPRECATED), "Alignment (deprecated, use CSS)"));
        map.put("bgcolor",attribute("bgcolor", COLOR, SPECIFIC_ELEMENTS, categories(DEPRECATED), "Background color (deprecated, use CSS)"));
        map.put("border",attribute("border", NUMBER, SPECIFIC_ELEMENTS, categories(DEPRECATED), "Border width (deprecated, use CSS)"));
        map.put("cellpadding",attribute("cellpadding", NUMBER, SPECIFIC_ELEMENTS, categories(DEPRECATED), "Cell padding (deprecated, use CSS)"));
        map.put("cellspacing",attribute("cellspacing", NUMBER, SPECIFIC_ELEMENTS, categories(DEPRECATED), "Cell spacing (deprecated, use CSS)"));
        map.put("color",attribute("color", COLOR, SPECIFIC_ELEMENTS, categories(DEPRECATED), "Text color (deprecated, use CSS)"));
        map.put("face",attribute("face", STRING, SPECIFIC_ELEMENTS, categories(DEPRECATED), "Font face (deprecated, use CSS)"));
        map.put("size",attribute("size", NUMBER, SPECIFIC_ELEMENTS, categories(DEPRECATED), "Font size (deprecated, use CSS)"));

        return Collections.unmodifiableMap(map);
    }

    /**
     * Get attribute data by attribute name.
     */
    public static HtmlAttributeData get(String attributeName) {
        return ALL_ATTRIBUTES.get(attributeName);
    }
}