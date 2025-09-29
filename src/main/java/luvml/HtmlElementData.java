package luvml;

import java.util.*;

import static java.util.Set.of;
import static luvml.ContentCategory.*;
import static luvml.DisplayType.*;
import static luvml.ElementType.*;
import static luvml.Context.*;

public record HtmlElementData(
    String element,
    Set<ContentCategory> contentCategories,
    DisplayType displayType,
    ElementType elementType,
    Set<Context> contexts,
    String description
) {
    
    private static Set<ContentCategory> categories(ContentCategory... categories) {
        return of(categories);
    }
    
    private static Set<Context> contexts(Context... contexts) {
        return of(contexts);
    }
    
    private static HtmlElementData element(String name, DisplayType display, ElementType type,
                                         Set<ContentCategory> categories, Set<Context> contexts, 
                                         String description) {
        return new HtmlElementData(name, categories, display, type, contexts, description);
    }
    
    public static final Map<String, HtmlElementData> ALL_ELEMENTS = allelements();
    
    private static final Map<String, HtmlElementData> allelements(){
        var map = new LinkedHashMap<String, HtmlElementData>();
        map.put("a", element("a", INLINE, CONTAINER, categories(PHRASING, INTERACTIVE, FLOW), contexts(PHRASING_CTX), "Hyperlink"));
        map.put("abbr",element("abbr", INLINE, CONTAINER, categories(PHRASING, FLOW), contexts(PHRASING_CTX), "Abbreviation"));
        map.put("address",element("address", BLOCK, CONTAINER, categories(FLOW), contexts(FLOW_CTX), "Contact information"));
        map.put("area",element("area", NONE, VOID, categories(PHRASING, INTERACTIVE, FLOW), contexts(MAP_CTX), "Image map area"));
        map.put("article",element("article", BLOCK, CONTAINER, categories(FLOW, SECTIONING), contexts(FLOW_CTX), "Independent content"));
        map.put("aside",element("aside", BLOCK, CONTAINER, categories(FLOW, SECTIONING), contexts(FLOW_CTX), "Sidebar content"));
        map.put("audio",element("audio", INLINE_BLOCK, CONTAINER, categories(PHRASING, EMBEDDED, INTERACTIVE, FLOW), contexts(PHRASING_CTX), "Audio content"));
        map.put("b",element("b", INLINE, CONTAINER, categories(PHRASING, FLOW), contexts(PHRASING_CTX), "Bold text"));
        map.put("base",element("base", NONE, VOID, categories(METADATA), contexts(HEAD_CTX), "Document base URL"));
        map.put("bdi",element("bdi", INLINE, CONTAINER, categories(PHRASING, FLOW), contexts(PHRASING_CTX), "Bidirectional isolation"));
        map.put("bdo",element("bdo", INLINE, CONTAINER, categories(PHRASING, FLOW), contexts(PHRASING_CTX), "Bidirectional override"));
        map.put("blockquote",element("blockquote", BLOCK, CONTAINER, categories(FLOW), contexts(FLOW_CTX), "Block quotation"));
        map.put("body",element("body", BLOCK, CONTAINER, categories(SECTIONING), contexts(HTML_CTX), "Document body"));
        map.put("br",element("br", INLINE, VOID, categories(PHRASING, FLOW), contexts(PHRASING_CTX), "Line break"));
        map.put("button",element("button", INLINE_BLOCK, CONTAINER, categories(PHRASING, INTERACTIVE, FORM_ASSOCIATED, FLOW), contexts(PHRASING_CTX), "Button"));
        map.put("canvas",element("canvas", INLINE_BLOCK, CONTAINER, categories(PHRASING, EMBEDDED, FLOW), contexts(PHRASING_CTX), "Graphics canvas"));
        map.put("caption",element("caption", TABLE, CONTAINER, categories(), contexts(TABLE_CTX), "Table caption"));
        map.put("cite",element("cite", INLINE, CONTAINER, categories(PHRASING, FLOW), contexts(PHRASING_CTX), "Citation"));
        map.put("code",element("code", INLINE, CONTAINER, categories(PHRASING, FLOW), contexts(PHRASING_CTX), "Code fragment"));
        map.put("col",element("col", TABLE, VOID, categories(), contexts(COLGROUP_CTX), "Table column"));
        map.put("colgroup",element("colgroup", TABLE, CONTAINER, categories(), contexts(TABLE_CTX), "Table column group"));
        map.put("data",element("data", INLINE, CONTAINER, categories(PHRASING, FLOW), contexts(PHRASING_CTX), "Machine-readable data"));
        map.put("datalist",element("datalist", NONE, CONTAINER, categories(PHRASING, FLOW), contexts(PHRASING_CTX), "Input options"));
        map.put("dd",element("dd", BLOCK, CONTAINER, categories(), contexts(DL_CTX), "Description list description"));
        map.put("del",element("del", INLINE, CONTAINER, categories(PHRASING, FLOW, TRANSPARENT), contexts(PHRASING_CTX, FLOW_CTX), "Deleted text"));
        map.put("details",element("details", BLOCK, CONTAINER, categories(FLOW, INTERACTIVE), contexts(FLOW_CTX), "Disclosure widget"));
        map.put("dfn",element("dfn", INLINE, CONTAINER, categories(PHRASING, FLOW), contexts(PHRASING_CTX), "Definition term"));
        map.put("dialog",element("dialog", BLOCK, CONTAINER, categories(FLOW), contexts(FLOW_CTX), "Dialog box"));
        map.put("div",element("div", BLOCK, CONTAINER, categories(FLOW), contexts(FLOW_CTX), "Generic container"));
        map.put("dl",element("dl", BLOCK, CONTAINER, categories(FLOW), contexts(FLOW_CTX), "Description list"));
        map.put("dt",element("dt", BLOCK, CONTAINER, categories(), contexts(DL_CTX), "Description list term"));
        map.put("em",element("em", INLINE, CONTAINER, categories(PHRASING, FLOW), contexts(PHRASING_CTX), "Emphasized text"));
        map.put("embed",element("embed", INLINE_BLOCK, VOID, categories(PHRASING, EMBEDDED, INTERACTIVE, FLOW), contexts(PHRASING_CTX), "External application"));
        map.put("fieldset",element("fieldset", BLOCK, CONTAINER, categories(FLOW, FORM_ASSOCIATED), contexts(FLOW_CTX), "Form field group"));
        map.put("figcaption",element("figcaption", BLOCK, CONTAINER, categories(), contexts(FIGURE_CTX), "Figure caption"));
        map.put("figure",element("figure", BLOCK, CONTAINER, categories(FLOW), contexts(FLOW_CTX), "Figure with caption"));
        map.put("footer",element("footer", BLOCK, CONTAINER, categories(FLOW), contexts(FLOW_CTX), "Footer"));
        map.put("form",element("form", BLOCK, CONTAINER, categories(FLOW), contexts(FLOW_CTX), "Form"));
        map.put("h1",element("h1", BLOCK, CONTAINER, categories(FLOW, HEADING), contexts(FLOW_CTX), "Level 1 heading"));
        map.put("h2",element("h2", BLOCK, CONTAINER, categories(FLOW, HEADING), contexts(FLOW_CTX), "Level 2 heading"));
        map.put("h3",element("h3", BLOCK, CONTAINER, categories(FLOW, HEADING), contexts(FLOW_CTX), "Level 3 heading"));
        map.put("h4",element("h4", BLOCK, CONTAINER, categories(FLOW, HEADING), contexts(FLOW_CTX), "Level 4 heading"));
        map.put("h5",element("h5", BLOCK, CONTAINER, categories(FLOW, HEADING), contexts(FLOW_CTX), "Level 5 heading"));
        map.put("h6",element("h6", BLOCK, CONTAINER, categories(FLOW, HEADING), contexts(FLOW_CTX), "Level 6 heading"));
        map.put("head",element("head", NONE, CONTAINER, categories(), contexts(HTML_CTX), "Document head"));
        map.put("header",element("header", BLOCK, CONTAINER, categories(FLOW), contexts(FLOW_CTX), "Header"));
        map.put("hgroup",element("hgroup", BLOCK, CONTAINER, categories(FLOW, HEADING), contexts(FLOW_CTX), "Heading group"));
        map.put("hr",element("hr", BLOCK, VOID, categories(FLOW), contexts(FLOW_CTX), "Horizontal rule"));
        map.put("html",element("html", BLOCK, CONTAINER, categories(), contexts(ROOT_CTX), "Document root"));
        map.put("i",element("i", INLINE, CONTAINER, categories(PHRASING, FLOW), contexts(PHRASING_CTX), "Italic text"));
        map.put("iframe",element("iframe", INLINE_BLOCK, CONTAINER, categories(PHRASING, EMBEDDED, INTERACTIVE, FLOW), contexts(PHRASING_CTX), "Inline frame"));
        map.put("img",element("img", INLINE_BLOCK, VOID, categories(PHRASING, EMBEDDED, INTERACTIVE, FORM_ASSOCIATED, FLOW), contexts(PHRASING_CTX), "Image"));
        map.put("input",element("input", INLINE_BLOCK, VOID, categories(PHRASING, INTERACTIVE, FORM_ASSOCIATED, FLOW), contexts(PHRASING_CTX), "Form input"));
        map.put("ins",element("ins", INLINE, CONTAINER, categories(PHRASING, FLOW, TRANSPARENT), contexts(PHRASING_CTX, FLOW_CTX), "Inserted text"));
        map.put("kbd",element("kbd", INLINE, CONTAINER, categories(PHRASING, FLOW), contexts(PHRASING_CTX), "Keyboard input"));
        map.put("label",element("label", INLINE, CONTAINER, categories(PHRASING, INTERACTIVE, FORM_ASSOCIATED, FLOW), contexts(PHRASING_CTX), "Form label"));
        map.put("legend",element("legend", BLOCK, CONTAINER, categories(), contexts(FIELDSET_CTX), "Fieldset legend"));
        map.put("li",element("li", BLOCK, CONTAINER, categories(), contexts(UL_CTX, OL_CTX), "List item"));
        map.put("link",element("link", NONE, VOID, categories(METADATA, PHRASING, FLOW), contexts(HEAD_CTX, PHRASING_CTX), "External resource link"));
        map.put("main",element("main", BLOCK, CONTAINER, categories(FLOW), contexts(FLOW_CTX), "Main content"));
        map.put("map",element("map", INLINE, CONTAINER, categories(PHRASING, FLOW, TRANSPARENT), contexts(PHRASING_CTX), "Image map"));
        map.put("mark",element("mark", INLINE, CONTAINER, categories(PHRASING, FLOW), contexts(PHRASING_CTX), "Marked text"));
        map.put("math",element("math", INLINE_BLOCK, CONTAINER, categories(PHRASING, EMBEDDED, FLOW), contexts(PHRASING_CTX), "MathML math"));
        map.put("menu",element("menu", BLOCK, CONTAINER, categories(FLOW), contexts(FLOW_CTX), "Menu"));
        map.put("meta",element("meta", NONE, VOID, categories(METADATA), contexts(HEAD_CTX), "Metadata"));
        map.put("meter",element("meter", INLINE, CONTAINER, categories(PHRASING, FLOW), contexts(PHRASING_CTX), "Scalar measurement"));
        map.put("nav",element("nav", BLOCK, CONTAINER, categories(FLOW, SECTIONING), contexts(FLOW_CTX), "Navigation"));
        map.put("noscript",element("noscript", INLINE, CONTAINER, categories(METADATA, PHRASING, FLOW), contexts(HEAD_CTX, PHRASING_CTX), "No script fallback"));
        map.put("object",element("object", INLINE_BLOCK, CONTAINER, categories(PHRASING, EMBEDDED, INTERACTIVE, FORM_ASSOCIATED, FLOW), contexts(PHRASING_CTX), "Generic object"));
        map.put("ol",element("ol", BLOCK, CONTAINER, categories(FLOW), contexts(FLOW_CTX), "Ordered list"));
        map.put("optgroup",element("optgroup", NONE, CONTAINER, categories(), contexts(SELECT_CTX), "Option group"));
        map.put("option",element("option", NONE, CONTAINER, categories(), contexts(SELECT_CTX, DATALIST_CTX), "Select option"));
        map.put("output",element("output", INLINE, CONTAINER, categories(PHRASING, FORM_ASSOCIATED, FLOW), contexts(PHRASING_CTX), "Form output"));
        map.put("p",element("p", BLOCK, CONTAINER, categories(FLOW), contexts(FLOW_CTX), "Paragraph"));
        map.put("picture",element("picture", INLINE_BLOCK, CONTAINER, categories(PHRASING, EMBEDDED, FLOW), contexts(PHRASING_CTX), "Responsive image"));
        map.put("pre",element("pre", BLOCK, CONTAINER, categories(FLOW), contexts(FLOW_CTX), "Preformatted text"));
        map.put("progress",element("progress", INLINE, CONTAINER, categories(PHRASING, FLOW), contexts(PHRASING_CTX), "Progress indicator"));
        map.put("q",element("q", INLINE, CONTAINER, categories(PHRASING, FLOW), contexts(PHRASING_CTX), "Inline quotation"));
        map.put("rp",element("rp", INLINE, CONTAINER, categories(), contexts(RUBY_CTX), "Ruby parenthesis"));
        map.put("rt",element("rt", INLINE, CONTAINER, categories(), contexts(RUBY_CTX), "Ruby text"));
        map.put("ruby",element("ruby", INLINE, CONTAINER, categories(PHRASING, FLOW), contexts(PHRASING_CTX), "Ruby annotation"));
        map.put("s",element("s", INLINE, CONTAINER, categories(PHRASING, FLOW), contexts(PHRASING_CTX), "Strikethrough"));
        map.put("samp",element("samp", INLINE, CONTAINER, categories(PHRASING, FLOW), contexts(PHRASING_CTX), "Sample output"));
        map.put("script",element("script", NONE, RAW_TEXT, categories(METADATA, PHRASING, FLOW, SCRIPT_SUPPORTING), contexts(HEAD_CTX, PHRASING_CTX), "Script"));
        map.put("search",element("search", BLOCK, CONTAINER, categories(FLOW), contexts(FLOW_CTX), "Search"));
        map.put("section",element("section", BLOCK, CONTAINER, categories(FLOW, SECTIONING), contexts(FLOW_CTX), "Document section"));
        map.put("select",element("select", INLINE_BLOCK, CONTAINER, categories(PHRASING, INTERACTIVE, FORM_ASSOCIATED, FLOW), contexts(PHRASING_CTX), "Select control"));
        map.put("slot",element("slot", INLINE, CONTAINER, categories(PHRASING, FLOW, TRANSPARENT), contexts(PHRASING_CTX), "Shadow DOM slot"));
        map.put("small",element("small", INLINE, CONTAINER, categories(PHRASING, FLOW), contexts(PHRASING_CTX), "Small text"));
        map.put("source",element("source", NONE, VOID, categories(), contexts(PICTURE_CTX, AUDIO_CTX, VIDEO_CTX), "Media source"));
        map.put("span",element("span", INLINE, CONTAINER, categories(PHRASING, FLOW), contexts(PHRASING_CTX), "Generic inline"));
        map.put("strong",element("strong", INLINE, CONTAINER, categories(PHRASING, FLOW), contexts(PHRASING_CTX), "Strong importance"));
        map.put("style",element("style", NONE, RAW_TEXT, categories(METADATA), contexts(HEAD_CTX), "Style information"));
        map.put("sub",element("sub", INLINE, CONTAINER, categories(PHRASING, FLOW), contexts(PHRASING_CTX), "Subscript"));
        map.put("summary",element("summary", BLOCK, CONTAINER, categories(), contexts(DETAILS_CTX), "Details summary"));
        map.put("sup",element("sup", INLINE, CONTAINER, categories(PHRASING, FLOW), contexts(PHRASING_CTX), "Superscript"));
        map.put("svg",element("svg", INLINE_BLOCK, CONTAINER, categories(PHRASING, EMBEDDED, FLOW), contexts(PHRASING_CTX), "SVG graphics"));
        map.put("table",element("table", TABLE, CONTAINER, categories(FLOW), contexts(FLOW_CTX), "Table"));
        map.put("tbody",element("tbody", TABLE, CONTAINER, categories(), contexts(TABLE_CTX), "Table body"));
        map.put("td",element("td", TABLE, CONTAINER, categories(), contexts(TR_CTX), "Table cell"));
        map.put("template",element("template", NONE, CONTAINER, categories(METADATA, PHRASING, FLOW, SCRIPT_SUPPORTING), contexts(HEAD_CTX, PHRASING_CTX), "Content template"));
        map.put("textarea",element("textarea", INLINE_BLOCK, ESCAPABLE_RAW_TEXT, categories(PHRASING, INTERACTIVE, FORM_ASSOCIATED, FLOW), contexts(PHRASING_CTX), "Text area"));
        map.put("tfoot",element("tfoot", TABLE, CONTAINER, categories(), contexts(TABLE_CTX), "Table footer"));
        map.put("th",element("th", TABLE, CONTAINER, categories(), contexts(TR_CTX), "Table header cell"));
        map.put("thead",element("thead", TABLE, CONTAINER, categories(), contexts(TABLE_CTX), "Table header"));
        map.put("time",element("time", INLINE, CONTAINER, categories(PHRASING, FLOW), contexts(PHRASING_CTX), "Date/time"));
        map.put("title",element("title", NONE, ESCAPABLE_RAW_TEXT, categories(METADATA), contexts(HEAD_CTX), "Document title"));
        map.put("tr",element("tr", TABLE, CONTAINER, categories(), contexts(TABLE_CTX), "Table row"));
        map.put("track",element("track", NONE, VOID, categories(), contexts(AUDIO_CTX, VIDEO_CTX), "Media track"));
        map.put("u",element("u", INLINE, CONTAINER, categories(PHRASING, FLOW), contexts(PHRASING_CTX), "Underlined text"));
        map.put("ul",element("ul", BLOCK, CONTAINER, categories(FLOW), contexts(FLOW_CTX), "Unordered list"));
        map.put("var",element("var", INLINE, CONTAINER, categories(PHRASING, FLOW), contexts(PHRASING_CTX), "Variable"));
        map.put("video",element("video", INLINE_BLOCK, CONTAINER, categories(PHRASING, EMBEDDED, INTERACTIVE, FLOW), contexts(PHRASING_CTX), "Video content"));
        map.put("wbr",element("wbr", INLINE, VOID, categories(PHRASING, FLOW), contexts(PHRASING_CTX), "Line break opportunity"));
        return Collections.unmodifiableMap(map);
    }

    /**
     * Get element data by element name.
     */
    public static HtmlElementData get(String elementName) {
        return ALL_ELEMENTS.get(elementName);
    }

    /**
     * Check if an element is a phrasing element (inline).
     */
    public boolean isPhrasingElement() {
        return contentCategories.contains(PHRASING);
    }

    /**
     * Check if an element is a block-level void element.
     */
    public boolean isBlockVoidElement() {
        return elementType == VOID && !isPhrasingElement();
    }
}