package luvml;

import static luvml.ContentCategory.*;
import static luvml.Context.*;
import static luvml.DisplayType.*;
import static luvml.ElementType.*;

import java.lang.Iterable;
import java.lang.String;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import luvx.Attr_I;
import luvx.Frag_I;

public final class E {
  private static final Map<String, Set<ContentCategory>> CONTENT_CATEGORIES = new HashMap<String, Set<ContentCategory>>() {
      {
          put("a", Set.of(PHRASING, FLOW, INTERACTIVE));
          put("abbr", Set.of(FLOW, PHRASING));
          put("address", Set.of(FLOW));
          put("area", Set.of(PHRASING, FLOW, INTERACTIVE));
          put("article", Set.of(SECTIONING, FLOW));
          put("aside", Set.of(SECTIONING, FLOW));
          put("audio", Set.of(EMBEDDED, INTERACTIVE, FLOW, PHRASING));
          put("b", Set.of(FLOW, PHRASING));
          put("base", Set.of(METADATA));
          put("bdi", Set.of(FLOW, PHRASING));
          put("bdo", Set.of(FLOW, PHRASING));
          put("blockquote", Set.of(FLOW));
          put("body", Set.of(SECTIONING));
          put("br", Set.of(FLOW, PHRASING));
          put("button", Set.of(INTERACTIVE, FLOW, FORM_ASSOCIATED, PHRASING));
          put("canvas", Set.of(PHRASING, EMBEDDED, FLOW));
          put("caption", Set.of());
          put("cite", Set.of(FLOW, PHRASING));
          put("code", Set.of(FLOW, PHRASING));
          put("col", Set.of());
          put("colgroup", Set.of());
          put("data", Set.of(FLOW, PHRASING));
          put("datalist", Set.of(FLOW, PHRASING));
          put("dd", Set.of());
          put("del", Set.of(PHRASING, FLOW, TRANSPARENT));
          put("details", Set.of(INTERACTIVE, FLOW));
          put("dfn", Set.of(FLOW, PHRASING));
          put("dialog", Set.of(FLOW));
          put("div", Set.of(FLOW));
          put("dl", Set.of(FLOW));
          put("dt", Set.of());
          put("em", Set.of(FLOW, PHRASING));
          put("embed", Set.of(EMBEDDED, INTERACTIVE, FLOW, PHRASING));
          put("fieldset", Set.of(FORM_ASSOCIATED, FLOW));
          put("figcaption", Set.of());
          put("figure", Set.of(FLOW));
          put("footer", Set.of(FLOW));
          put("form", Set.of(FLOW));
          put("h1", Set.of(HEADING, FLOW));
          put("h2", Set.of(HEADING, FLOW));
          put("h3", Set.of(HEADING, FLOW));
          put("h4", Set.of(HEADING, FLOW));
          put("h5", Set.of(HEADING, FLOW));
          put("h6", Set.of(HEADING, FLOW));
          put("head", Set.of());
          put("header", Set.of(FLOW));
          put("hgroup", Set.of(HEADING, FLOW));
          put("hr", Set.of(FLOW));
          put("html", Set.of());
          put("i", Set.of(FLOW, PHRASING));
          put("iframe", Set.of(EMBEDDED, INTERACTIVE, FLOW, PHRASING));
          put("img", Set.of(INTERACTIVE, FORM_ASSOCIATED, PHRASING, FLOW, EMBEDDED));
          put("input", Set.of(INTERACTIVE, FLOW, FORM_ASSOCIATED, PHRASING));
          put("ins", Set.of(PHRASING, FLOW, TRANSPARENT));
          put("kbd", Set.of(FLOW, PHRASING));
          put("label", Set.of(INTERACTIVE, FLOW, FORM_ASSOCIATED, PHRASING));
          put("legend", Set.of());
          put("li", Set.of());
          put("link", Set.of(PHRASING, FLOW, METADATA));
          put("main", Set.of(FLOW));
          put("map", Set.of(PHRASING, FLOW, TRANSPARENT));
          put("mark", Set.of(FLOW, PHRASING));
          put("math", Set.of(PHRASING, EMBEDDED, FLOW));
          put("menu", Set.of(FLOW));
          put("meta", Set.of(METADATA));
          put("meter", Set.of(FLOW, PHRASING));
          put("nav", Set.of(SECTIONING, FLOW));
          put("noscript", Set.of(PHRASING, FLOW, METADATA));
          put("object", Set.of(INTERACTIVE, FORM_ASSOCIATED, PHRASING, FLOW, EMBEDDED));
          put("ol", Set.of(FLOW));
          put("optgroup", Set.of());
          put("option", Set.of());
          put("output", Set.of(PHRASING, FORM_ASSOCIATED, FLOW));
          put("p", Set.of(FLOW));
          put("picture", Set.of(PHRASING, EMBEDDED, FLOW));
          put("pre", Set.of(FLOW));
          put("progress", Set.of(FLOW, PHRASING));
          put("q", Set.of(FLOW, PHRASING));
          put("rp", Set.of());
          put("rt", Set.of());
          put("ruby", Set.of(FLOW, PHRASING));
          put("s", Set.of(FLOW, PHRASING));
          put("samp", Set.of(FLOW, PHRASING));
          put("script", Set.of(SCRIPT_SUPPORTING, FLOW, METADATA, PHRASING));
          put("search", Set.of(FLOW));
          put("section", Set.of(SECTIONING, FLOW));
          put("select", Set.of(INTERACTIVE, FLOW, FORM_ASSOCIATED, PHRASING));
          put("slot", Set.of(PHRASING, FLOW, TRANSPARENT));
          put("small", Set.of(FLOW, PHRASING));
          put("source", Set.of());
          put("span", Set.of(FLOW, PHRASING));
          put("strong", Set.of(FLOW, PHRASING));
          put("style", Set.of(METADATA));
          put("sub", Set.of(FLOW, PHRASING));
          put("summary", Set.of());
          put("sup", Set.of(FLOW, PHRASING));
          put("svg", Set.of(PHRASING, EMBEDDED, FLOW));
          put("table", Set.of(FLOW));
          put("tbody", Set.of());
          put("td", Set.of());
          put("template", Set.of(SCRIPT_SUPPORTING, FLOW, METADATA, PHRASING));
          put("textarea", Set.of(INTERACTIVE, FLOW, FORM_ASSOCIATED, PHRASING));
          put("tfoot", Set.of());
          put("th", Set.of());
          put("thead", Set.of());
          put("time", Set.of(FLOW, PHRASING));
          put("title", Set.of(METADATA));
          put("tr", Set.of());
          put("track", Set.of());
          put("u", Set.of(FLOW, PHRASING));
          put("ul", Set.of(FLOW));
          put("var", Set.of(FLOW, PHRASING));
          put("video", Set.of(EMBEDDED, INTERACTIVE, FLOW, PHRASING));
          put("wbr", Set.of(FLOW, PHRASING));
      }
  };

  private static final Map<String, DisplayType> DISPLAY_TYPES = new HashMap<String, DisplayType>() {
      {
          put("a", INLINE);
          put("abbr", INLINE);
          put("address", BLOCK);
          put("area", NONE);
          put("article", BLOCK);
          put("aside", BLOCK);
          put("audio", INLINE_BLOCK);
          put("b", INLINE);
          put("base", NONE);
          put("bdi", INLINE);
          put("bdo", INLINE);
          put("blockquote", BLOCK);
          put("body", BLOCK);
          put("br", INLINE);
          put("button", INLINE_BLOCK);
          put("canvas", INLINE_BLOCK);
          put("caption", TABLE);
          put("cite", INLINE);
          put("code", INLINE);
          put("col", TABLE);
          put("colgroup", TABLE);
          put("data", INLINE);
          put("datalist", NONE);
          put("dd", BLOCK);
          put("del", INLINE);
          put("details", BLOCK);
          put("dfn", INLINE);
          put("dialog", BLOCK);
          put("div", BLOCK);
          put("dl", BLOCK);
          put("dt", BLOCK);
          put("em", INLINE);
          put("embed", INLINE_BLOCK);
          put("fieldset", BLOCK);
          put("figcaption", BLOCK);
          put("figure", BLOCK);
          put("footer", BLOCK);
          put("form", BLOCK);
          put("h1", BLOCK);
          put("h2", BLOCK);
          put("h3", BLOCK);
          put("h4", BLOCK);
          put("h5", BLOCK);
          put("h6", BLOCK);
          put("head", NONE);
          put("header", BLOCK);
          put("hgroup", BLOCK);
          put("hr", BLOCK);
          put("html", BLOCK);
          put("i", INLINE);
          put("iframe", INLINE_BLOCK);
          put("img", INLINE_BLOCK);
          put("input", INLINE_BLOCK);
          put("ins", INLINE);
          put("kbd", INLINE);
          put("label", INLINE);
          put("legend", BLOCK);
          put("li", BLOCK);
          put("link", NONE);
          put("main", BLOCK);
          put("map", INLINE);
          put("mark", INLINE);
          put("math", INLINE_BLOCK);
          put("menu", BLOCK);
          put("meta", NONE);
          put("meter", INLINE);
          put("nav", BLOCK);
          put("noscript", INLINE);
          put("object", INLINE_BLOCK);
          put("ol", BLOCK);
          put("optgroup", NONE);
          put("option", NONE);
          put("output", INLINE);
          put("p", BLOCK);
          put("picture", INLINE_BLOCK);
          put("pre", BLOCK);
          put("progress", INLINE);
          put("q", INLINE);
          put("rp", INLINE);
          put("rt", INLINE);
          put("ruby", INLINE);
          put("s", INLINE);
          put("samp", INLINE);
          put("script", NONE);
          put("search", BLOCK);
          put("section", BLOCK);
          put("select", INLINE_BLOCK);
          put("slot", INLINE);
          put("small", INLINE);
          put("source", NONE);
          put("span", INLINE);
          put("strong", INLINE);
          put("style", NONE);
          put("sub", INLINE);
          put("summary", BLOCK);
          put("sup", INLINE);
          put("svg", INLINE_BLOCK);
          put("table", TABLE);
          put("tbody", TABLE);
          put("td", TABLE);
          put("template", NONE);
          put("textarea", INLINE_BLOCK);
          put("tfoot", TABLE);
          put("th", TABLE);
          put("thead", TABLE);
          put("time", INLINE);
          put("title", NONE);
          put("tr", TABLE);
          put("track", NONE);
          put("u", INLINE);
          put("ul", BLOCK);
          put("var", INLINE);
          put("video", INLINE_BLOCK);
          put("wbr", INLINE);
      }
  };

  private static final Map<String, ElementType> ELEMENT_TYPES = new HashMap<String, ElementType>() {
      {
          put("a", CONTAINER);
          put("abbr", CONTAINER);
          put("address", CONTAINER);
          put("area", VOID);
          put("article", CONTAINER);
          put("aside", CONTAINER);
          put("audio", CONTAINER);
          put("b", CONTAINER);
          put("base", VOID);
          put("bdi", CONTAINER);
          put("bdo", CONTAINER);
          put("blockquote", CONTAINER);
          put("body", CONTAINER);
          put("br", VOID);
          put("button", CONTAINER);
          put("canvas", CONTAINER);
          put("caption", CONTAINER);
          put("cite", CONTAINER);
          put("code", CONTAINER);
          put("col", VOID);
          put("colgroup", CONTAINER);
          put("data", CONTAINER);
          put("datalist", CONTAINER);
          put("dd", CONTAINER);
          put("del", CONTAINER);
          put("details", CONTAINER);
          put("dfn", CONTAINER);
          put("dialog", CONTAINER);
          put("div", CONTAINER);
          put("dl", CONTAINER);
          put("dt", CONTAINER);
          put("em", CONTAINER);
          put("embed", VOID);
          put("fieldset", CONTAINER);
          put("figcaption", CONTAINER);
          put("figure", CONTAINER);
          put("footer", CONTAINER);
          put("form", CONTAINER);
          put("h1", CONTAINER);
          put("h2", CONTAINER);
          put("h3", CONTAINER);
          put("h4", CONTAINER);
          put("h5", CONTAINER);
          put("h6", CONTAINER);
          put("head", CONTAINER);
          put("header", CONTAINER);
          put("hgroup", CONTAINER);
          put("hr", VOID);
          put("html", CONTAINER);
          put("i", CONTAINER);
          put("iframe", CONTAINER);
          put("img", VOID);
          put("input", VOID);
          put("ins", CONTAINER);
          put("kbd", CONTAINER);
          put("label", CONTAINER);
          put("legend", CONTAINER);
          put("li", CONTAINER);
          put("link", VOID);
          put("main", CONTAINER);
          put("map", CONTAINER);
          put("mark", CONTAINER);
          put("math", CONTAINER);
          put("menu", CONTAINER);
          put("meta", VOID);
          put("meter", CONTAINER);
          put("nav", CONTAINER);
          put("noscript", CONTAINER);
          put("object", CONTAINER);
          put("ol", CONTAINER);
          put("optgroup", CONTAINER);
          put("option", CONTAINER);
          put("output", CONTAINER);
          put("p", CONTAINER);
          put("picture", CONTAINER);
          put("pre", CONTAINER);
          put("progress", CONTAINER);
          put("q", CONTAINER);
          put("rp", CONTAINER);
          put("rt", CONTAINER);
          put("ruby", CONTAINER);
          put("s", CONTAINER);
          put("samp", CONTAINER);
          put("script", RAW_TEXT);
          put("search", CONTAINER);
          put("section", CONTAINER);
          put("select", CONTAINER);
          put("slot", CONTAINER);
          put("small", CONTAINER);
          put("source", VOID);
          put("span", CONTAINER);
          put("strong", CONTAINER);
          put("style", RAW_TEXT);
          put("sub", CONTAINER);
          put("summary", CONTAINER);
          put("sup", CONTAINER);
          put("svg", CONTAINER);
          put("table", CONTAINER);
          put("tbody", CONTAINER);
          put("td", CONTAINER);
          put("template", CONTAINER);
          put("textarea", ESCAPABLE_RAW_TEXT);
          put("tfoot", CONTAINER);
          put("th", CONTAINER);
          put("thead", CONTAINER);
          put("time", CONTAINER);
          put("title", ESCAPABLE_RAW_TEXT);
          put("tr", CONTAINER);
          put("track", VOID);
          put("u", CONTAINER);
          put("ul", CONTAINER);
          put("var", CONTAINER);
          put("video", CONTAINER);
          put("wbr", VOID);
      }
  };

  private static final Map<String, Set<Context>> VALID_CONTEXTS = new HashMap<String, Set<Context>>() {
      {
          put("a", Set.of(PHRASING_CTX));
          put("abbr", Set.of(PHRASING_CTX));
          put("address", Set.of(FLOW_CTX));
          put("area", Set.of(MAP_CTX));
          put("article", Set.of(FLOW_CTX));
          put("aside", Set.of(FLOW_CTX));
          put("audio", Set.of(PHRASING_CTX));
          put("b", Set.of(PHRASING_CTX));
          put("base", Set.of(HEAD_CTX));
          put("bdi", Set.of(PHRASING_CTX));
          put("bdo", Set.of(PHRASING_CTX));
          put("blockquote", Set.of(FLOW_CTX));
          put("body", Set.of(HTML_CTX));
          put("br", Set.of(PHRASING_CTX));
          put("button", Set.of(PHRASING_CTX));
          put("canvas", Set.of(PHRASING_CTX));
          put("caption", Set.of(TABLE_CTX));
          put("cite", Set.of(PHRASING_CTX));
          put("code", Set.of(PHRASING_CTX));
          put("col", Set.of(COLGROUP_CTX));
          put("colgroup", Set.of(TABLE_CTX));
          put("data", Set.of(PHRASING_CTX));
          put("datalist", Set.of(PHRASING_CTX));
          put("dd", Set.of(DL_CTX));
          put("del", Set.of(FLOW_CTX, PHRASING_CTX));
          put("details", Set.of(FLOW_CTX));
          put("dfn", Set.of(PHRASING_CTX));
          put("dialog", Set.of(FLOW_CTX));
          put("div", Set.of(FLOW_CTX));
          put("dl", Set.of(FLOW_CTX));
          put("dt", Set.of(DL_CTX));
          put("em", Set.of(PHRASING_CTX));
          put("embed", Set.of(PHRASING_CTX));
          put("fieldset", Set.of(FLOW_CTX));
          put("figcaption", Set.of(FIGURE_CTX));
          put("figure", Set.of(FLOW_CTX));
          put("footer", Set.of(FLOW_CTX));
          put("form", Set.of(FLOW_CTX));
          put("h1", Set.of(FLOW_CTX));
          put("h2", Set.of(FLOW_CTX));
          put("h3", Set.of(FLOW_CTX));
          put("h4", Set.of(FLOW_CTX));
          put("h5", Set.of(FLOW_CTX));
          put("h6", Set.of(FLOW_CTX));
          put("head", Set.of(HTML_CTX));
          put("header", Set.of(FLOW_CTX));
          put("hgroup", Set.of(FLOW_CTX));
          put("hr", Set.of(FLOW_CTX));
          put("html", Set.of(ROOT_CTX));
          put("i", Set.of(PHRASING_CTX));
          put("iframe", Set.of(PHRASING_CTX));
          put("img", Set.of(PHRASING_CTX));
          put("input", Set.of(PHRASING_CTX));
          put("ins", Set.of(FLOW_CTX, PHRASING_CTX));
          put("kbd", Set.of(PHRASING_CTX));
          put("label", Set.of(PHRASING_CTX));
          put("legend", Set.of(FIELDSET_CTX));
          put("li", Set.of(OL_CTX, UL_CTX));
          put("link", Set.of(PHRASING_CTX, HEAD_CTX));
          put("main", Set.of(FLOW_CTX));
          put("map", Set.of(PHRASING_CTX));
          put("mark", Set.of(PHRASING_CTX));
          put("math", Set.of(PHRASING_CTX));
          put("menu", Set.of(FLOW_CTX));
          put("meta", Set.of(HEAD_CTX));
          put("meter", Set.of(PHRASING_CTX));
          put("nav", Set.of(FLOW_CTX));
          put("noscript", Set.of(PHRASING_CTX, HEAD_CTX));
          put("object", Set.of(PHRASING_CTX));
          put("ol", Set.of(FLOW_CTX));
          put("optgroup", Set.of(SELECT_CTX));
          put("option", Set.of(DATALIST_CTX, SELECT_CTX));
          put("output", Set.of(PHRASING_CTX));
          put("p", Set.of(FLOW_CTX));
          put("picture", Set.of(PHRASING_CTX));
          put("pre", Set.of(FLOW_CTX));
          put("progress", Set.of(PHRASING_CTX));
          put("q", Set.of(PHRASING_CTX));
          put("rp", Set.of(RUBY_CTX));
          put("rt", Set.of(RUBY_CTX));
          put("ruby", Set.of(PHRASING_CTX));
          put("s", Set.of(PHRASING_CTX));
          put("samp", Set.of(PHRASING_CTX));
          put("script", Set.of(PHRASING_CTX, HEAD_CTX));
          put("search", Set.of(FLOW_CTX));
          put("section", Set.of(FLOW_CTX));
          put("select", Set.of(PHRASING_CTX));
          put("slot", Set.of(PHRASING_CTX));
          put("small", Set.of(PHRASING_CTX));
          put("source", Set.of(VIDEO_CTX, PICTURE_CTX, AUDIO_CTX));
          put("span", Set.of(PHRASING_CTX));
          put("strong", Set.of(PHRASING_CTX));
          put("style", Set.of(HEAD_CTX));
          put("sub", Set.of(PHRASING_CTX));
          put("summary", Set.of(DETAILS_CTX));
          put("sup", Set.of(PHRASING_CTX));
          put("svg", Set.of(PHRASING_CTX));
          put("table", Set.of(FLOW_CTX));
          put("tbody", Set.of(TABLE_CTX));
          put("td", Set.of(TR_CTX));
          put("template", Set.of(PHRASING_CTX, HEAD_CTX));
          put("textarea", Set.of(PHRASING_CTX));
          put("tfoot", Set.of(TABLE_CTX));
          put("th", Set.of(TR_CTX));
          put("thead", Set.of(TABLE_CTX));
          put("time", Set.of(PHRASING_CTX));
          put("title", Set.of(HEAD_CTX));
          put("tr", Set.of(TABLE_CTX));
          put("track", Set.of(VIDEO_CTX, AUDIO_CTX));
          put("u", Set.of(PHRASING_CTX));
          put("ul", Set.of(FLOW_CTX));
          put("var", Set.of(PHRASING_CTX));
          put("video", Set.of(PHRASING_CTX));
          put("wbr", Set.of(PHRASING_CTX));
      }
  };

  private E() {
    // Utility class;
  }

  public static Set<ContentCategory> getContentCategories(String elementName) {
    return CONTENT_CATEGORIES.getOrDefault(elementName, Set.of());
  }

  public static DisplayType getDisplayType(String elementName) {
    return DISPLAY_TYPES.get(elementName);
  }

  public static ElementType getElementType(String elementName) {
    return ELEMENT_TYPES.get(elementName);
  }

  public static Set<Context> getValidContexts(String elementName) {
    return VALID_CONTEXTS.getOrDefault(elementName, Set.of());
  }

  public static BlockContainerElement blockContainer(String tagName, Frag_I<?>... fragments) {
    return new BlockContainerElement(tagName).addContent(fragments);
  }

  public static BlockContainerElement blockContainer(String tagName,
      Iterable<Frag_I<?>> fragments) {
    if (fragments instanceof Collection<Frag_I<?>>) {
      var fragArray = ((Collection<Frag_I<?>>) fragments).toArray(new Frag_I<?>[0]);
      return new BlockContainerElement(tagName).addContent(fragArray);
    } else {
      var fragList = new ArrayList<Frag_I<?>>();
      fragments.forEach(fragList::add);
      return new BlockContainerElement(tagName).addContent(fragList.toArray(new Frag_I<?>[0]));
    }
  }

  public static BlockContainerElement blockContainer(String tagName, String... textContent) {
    return new BlockContainerElement(tagName).addContent(textContent);
  }

  public static BlockContainerElement blockContainer(String tagName) {
    return new BlockContainerElement(tagName);
  }

  public static InlineContainerElement inlineContainer(String tagName, Frag_I<?>... fragments) {
    return new InlineContainerElement(tagName).addContent(fragments);
  }

  public static InlineContainerElement inlineContainer(String tagName,
      Iterable<Frag_I<?>> fragments) {
    if (fragments instanceof Collection<Frag_I<?>>) {
      var fragArray = ((Collection<Frag_I<?>>) fragments).toArray(new Frag_I<?>[0]);
      return new InlineContainerElement(tagName).addContent(fragArray);
    } else {
      var fragList = new ArrayList<Frag_I<?>>();
      fragments.forEach(fragList::add);
      return new InlineContainerElement(tagName).addContent(fragList.toArray(new Frag_I<?>[0]));
    }
  }

  public static InlineContainerElement inlineContainer(String tagName, String... textContent) {
    return new InlineContainerElement(tagName).addContent(textContent);
  }

  public static InlineContainerElement inlineContainer(String tagName) {
    return new InlineContainerElement(tagName);
  }

  public static BlockVoidElement blockVoidElement(String tagName, Attr_I<?>... attributes) {
    return new BlockVoidElement(tagName).addAttributes(attributes);
  }

  public static BlockVoidElement blockVoidElement(String tagName) {
    return new BlockVoidElement(tagName);
  }

  public static InlineVoidElement inlineVoidElement(String tagName, Attr_I<?>... attributes) {
    return new InlineVoidElement(tagName).addAttributes(attributes);
  }

  public static InlineVoidElement inlineVoidElement(String tagName) {
    return new InlineVoidElement(tagName);
  }

  public static InlineContainerElement a(Frag_I<?>... fragments) {
    return inlineContainer("a", fragments);
  }

  public static InlineContainerElement a(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("a", fragments);
  }

  public static InlineContainerElement a(String... textContent) {
    return inlineContainer("a", textContent);
  }

  public static InlineContainerElement a() {
    return inlineContainer("a");
  }

  public static InlineContainerElement abbr(Frag_I<?>... fragments) {
    return inlineContainer("abbr", fragments);
  }

  public static InlineContainerElement abbr(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("abbr", fragments);
  }

  public static InlineContainerElement abbr(String... textContent) {
    return inlineContainer("abbr", textContent);
  }

  public static InlineContainerElement abbr() {
    return inlineContainer("abbr");
  }

  public static BlockContainerElement address(Frag_I<?>... fragments) {
    return blockContainer("address", fragments);
  }

  public static BlockContainerElement address(Iterable<Frag_I<?>> fragments) {
    return blockContainer("address", fragments);
  }

  public static BlockContainerElement address(String... textContent) {
    return blockContainer("address", textContent);
  }

  public static BlockContainerElement address() {
    return blockContainer("address");
  }

  public static InlineVoidElement area(Attr_I<?>... attributes) {
    return inlineVoidElement("area", attributes);
  }

  public static InlineVoidElement area() {
    return inlineVoidElement("area");
  }

  public static BlockContainerElement article(Frag_I<?>... fragments) {
    return blockContainer("article", fragments);
  }

  public static BlockContainerElement article(Iterable<Frag_I<?>> fragments) {
    return blockContainer("article", fragments);
  }

  public static BlockContainerElement article(String... textContent) {
    return blockContainer("article", textContent);
  }

  public static BlockContainerElement article() {
    return blockContainer("article");
  }

  public static BlockContainerElement aside(Frag_I<?>... fragments) {
    return blockContainer("aside", fragments);
  }

  public static BlockContainerElement aside(Iterable<Frag_I<?>> fragments) {
    return blockContainer("aside", fragments);
  }

  public static BlockContainerElement aside(String... textContent) {
    return blockContainer("aside", textContent);
  }

  public static BlockContainerElement aside() {
    return blockContainer("aside");
  }

  public static BlockContainerElement audio(Frag_I<?>... fragments) {
    return blockContainer("audio", fragments);
  }

  public static BlockContainerElement audio(Iterable<Frag_I<?>> fragments) {
    return blockContainer("audio", fragments);
  }

  public static BlockContainerElement audio(String... textContent) {
    return blockContainer("audio", textContent);
  }

  public static BlockContainerElement audio() {
    return blockContainer("audio");
  }

  public static InlineContainerElement b(Frag_I<?>... fragments) {
    return inlineContainer("b", fragments);
  }

  public static InlineContainerElement b(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("b", fragments);
  }

  public static InlineContainerElement b(String... textContent) {
    return inlineContainer("b", textContent);
  }

  public static InlineContainerElement b() {
    return inlineContainer("b");
  }

  public static BlockVoidElement base(Attr_I<?>... attributes) {
    return blockVoidElement("base", attributes);
  }

  public static BlockVoidElement base() {
    return blockVoidElement("base");
  }

  public static InlineContainerElement bdi(Frag_I<?>... fragments) {
    return inlineContainer("bdi", fragments);
  }

  public static InlineContainerElement bdi(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("bdi", fragments);
  }

  public static InlineContainerElement bdi(String... textContent) {
    return inlineContainer("bdi", textContent);
  }

  public static InlineContainerElement bdi() {
    return inlineContainer("bdi");
  }

  public static InlineContainerElement bdo(Frag_I<?>... fragments) {
    return inlineContainer("bdo", fragments);
  }

  public static InlineContainerElement bdo(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("bdo", fragments);
  }

  public static InlineContainerElement bdo(String... textContent) {
    return inlineContainer("bdo", textContent);
  }

  public static InlineContainerElement bdo() {
    return inlineContainer("bdo");
  }

  public static BlockContainerElement blockquote(Frag_I<?>... fragments) {
    return blockContainer("blockquote", fragments);
  }

  public static BlockContainerElement blockquote(Iterable<Frag_I<?>> fragments) {
    return blockContainer("blockquote", fragments);
  }

  public static BlockContainerElement blockquote(String... textContent) {
    return blockContainer("blockquote", textContent);
  }

  public static BlockContainerElement blockquote() {
    return blockContainer("blockquote");
  }

  public static BlockContainerElement body(Frag_I<?>... fragments) {
    return blockContainer("body", fragments);
  }

  public static BlockContainerElement body(Iterable<Frag_I<?>> fragments) {
    return blockContainer("body", fragments);
  }

  public static BlockContainerElement body(String... textContent) {
    return blockContainer("body", textContent);
  }

  public static BlockContainerElement body() {
    return blockContainer("body");
  }

  public static InlineVoidElement br(Attr_I<?>... attributes) {
    return inlineVoidElement("br", attributes);
  }

  public static InlineVoidElement br() {
    return inlineVoidElement("br");
  }

  public static InlineContainerElement button(Frag_I<?>... fragments) {
    return inlineContainer("button", fragments);
  }

  public static InlineContainerElement button(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("button", fragments);
  }

  public static InlineContainerElement button(String... textContent) {
    return inlineContainer("button", textContent);
  }

  public static InlineContainerElement button() {
    return inlineContainer("button");
  }

  public static BlockContainerElement canvas(Frag_I<?>... fragments) {
    return blockContainer("canvas", fragments);
  }

  public static BlockContainerElement canvas(Iterable<Frag_I<?>> fragments) {
    return blockContainer("canvas", fragments);
  }

  public static BlockContainerElement canvas(String... textContent) {
    return blockContainer("canvas", textContent);
  }

  public static BlockContainerElement canvas() {
    return blockContainer("canvas");
  }

  public static BlockContainerElement caption(Frag_I<?>... fragments) {
    return blockContainer("caption", fragments);
  }

  public static BlockContainerElement caption(Iterable<Frag_I<?>> fragments) {
    return blockContainer("caption", fragments);
  }

  public static BlockContainerElement caption(String... textContent) {
    return blockContainer("caption", textContent);
  }

  public static BlockContainerElement caption() {
    return blockContainer("caption");
  }

  public static InlineContainerElement cite(Frag_I<?>... fragments) {
    return inlineContainer("cite", fragments);
  }

  public static InlineContainerElement cite(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("cite", fragments);
  }

  public static InlineContainerElement cite(String... textContent) {
    return inlineContainer("cite", textContent);
  }

  public static InlineContainerElement cite() {
    return inlineContainer("cite");
  }

  public static InlineContainerElement code(Frag_I<?>... fragments) {
    return inlineContainer("code", fragments);
  }

  public static InlineContainerElement code(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("code", fragments);
  }

  public static InlineContainerElement code(String... textContent) {
    return inlineContainer("code", textContent);
  }

  public static InlineContainerElement code() {
    return inlineContainer("code");
  }

  public static InlineVoidElement col(Attr_I<?>... attributes) {
    return inlineVoidElement("col", attributes);
  }

  public static InlineVoidElement col() {
    return inlineVoidElement("col");
  }

  public static BlockContainerElement colgroup(Frag_I<?>... fragments) {
    return blockContainer("colgroup", fragments);
  }

  public static BlockContainerElement colgroup(Iterable<Frag_I<?>> fragments) {
    return blockContainer("colgroup", fragments);
  }

  public static BlockContainerElement colgroup(String... textContent) {
    return blockContainer("colgroup", textContent);
  }

  public static BlockContainerElement colgroup() {
    return blockContainer("colgroup");
  }

  public static InlineContainerElement data(Frag_I<?>... fragments) {
    return inlineContainer("data", fragments);
  }

  public static InlineContainerElement data(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("data", fragments);
  }

  public static InlineContainerElement data(String... textContent) {
    return inlineContainer("data", textContent);
  }

  public static InlineContainerElement data() {
    return inlineContainer("data");
  }

  public static BlockContainerElement datalist(Frag_I<?>... fragments) {
    return blockContainer("datalist", fragments);
  }

  public static BlockContainerElement datalist(Iterable<Frag_I<?>> fragments) {
    return blockContainer("datalist", fragments);
  }

  public static BlockContainerElement datalist(String... textContent) {
    return blockContainer("datalist", textContent);
  }

  public static BlockContainerElement datalist() {
    return blockContainer("datalist");
  }

  public static BlockContainerElement dd(Frag_I<?>... fragments) {
    return blockContainer("dd", fragments);
  }

  public static BlockContainerElement dd(Iterable<Frag_I<?>> fragments) {
    return blockContainer("dd", fragments);
  }

  public static BlockContainerElement dd(String... textContent) {
    return blockContainer("dd", textContent);
  }

  public static BlockContainerElement dd() {
    return blockContainer("dd");
  }

  public static InlineContainerElement del(Frag_I<?>... fragments) {
    return inlineContainer("del", fragments);
  }

  public static InlineContainerElement del(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("del", fragments);
  }

  public static InlineContainerElement del(String... textContent) {
    return inlineContainer("del", textContent);
  }

  public static InlineContainerElement del() {
    return inlineContainer("del");
  }

  public static BlockContainerElement details(Frag_I<?>... fragments) {
    return blockContainer("details", fragments);
  }

  public static BlockContainerElement details(Iterable<Frag_I<?>> fragments) {
    return blockContainer("details", fragments);
  }

  public static BlockContainerElement details(String... textContent) {
    return blockContainer("details", textContent);
  }

  public static BlockContainerElement details() {
    return blockContainer("details");
  }

  public static InlineContainerElement dfn(Frag_I<?>... fragments) {
    return inlineContainer("dfn", fragments);
  }

  public static InlineContainerElement dfn(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("dfn", fragments);
  }

  public static InlineContainerElement dfn(String... textContent) {
    return inlineContainer("dfn", textContent);
  }

  public static InlineContainerElement dfn() {
    return inlineContainer("dfn");
  }

  public static BlockContainerElement dialog(Frag_I<?>... fragments) {
    return blockContainer("dialog", fragments);
  }

  public static BlockContainerElement dialog(Iterable<Frag_I<?>> fragments) {
    return blockContainer("dialog", fragments);
  }

  public static BlockContainerElement dialog(String... textContent) {
    return blockContainer("dialog", textContent);
  }

  public static BlockContainerElement dialog() {
    return blockContainer("dialog");
  }

  public static BlockContainerElement div(Frag_I<?>... fragments) {
    return blockContainer("div", fragments);
  }

  public static BlockContainerElement div(Iterable<Frag_I<?>> fragments) {
    return blockContainer("div", fragments);
  }

  public static BlockContainerElement div(String... textContent) {
    return blockContainer("div", textContent);
  }

  public static BlockContainerElement div() {
    return blockContainer("div");
  }

  public static BlockContainerElement dl(Frag_I<?>... fragments) {
    return blockContainer("dl", fragments);
  }

  public static BlockContainerElement dl(Iterable<Frag_I<?>> fragments) {
    return blockContainer("dl", fragments);
  }

  public static BlockContainerElement dl(String... textContent) {
    return blockContainer("dl", textContent);
  }

  public static BlockContainerElement dl() {
    return blockContainer("dl");
  }

  public static BlockContainerElement dt(Frag_I<?>... fragments) {
    return blockContainer("dt", fragments);
  }

  public static BlockContainerElement dt(Iterable<Frag_I<?>> fragments) {
    return blockContainer("dt", fragments);
  }

  public static BlockContainerElement dt(String... textContent) {
    return blockContainer("dt", textContent);
  }

  public static BlockContainerElement dt() {
    return blockContainer("dt");
  }

  public static InlineContainerElement em(Frag_I<?>... fragments) {
    return inlineContainer("em", fragments);
  }

  public static InlineContainerElement em(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("em", fragments);
  }

  public static InlineContainerElement em(String... textContent) {
    return inlineContainer("em", textContent);
  }

  public static InlineContainerElement em() {
    return inlineContainer("em");
  }

  public static InlineVoidElement embed(Attr_I<?>... attributes) {
    return inlineVoidElement("embed", attributes);
  }

  public static InlineVoidElement embed() {
    return inlineVoidElement("embed");
  }

  public static BlockContainerElement fieldset(Frag_I<?>... fragments) {
    return blockContainer("fieldset", fragments);
  }

  public static BlockContainerElement fieldset(Iterable<Frag_I<?>> fragments) {
    return blockContainer("fieldset", fragments);
  }

  public static BlockContainerElement fieldset(String... textContent) {
    return blockContainer("fieldset", textContent);
  }

  public static BlockContainerElement fieldset() {
    return blockContainer("fieldset");
  }

  public static BlockContainerElement figcaption(Frag_I<?>... fragments) {
    return blockContainer("figcaption", fragments);
  }

  public static BlockContainerElement figcaption(Iterable<Frag_I<?>> fragments) {
    return blockContainer("figcaption", fragments);
  }

  public static BlockContainerElement figcaption(String... textContent) {
    return blockContainer("figcaption", textContent);
  }

  public static BlockContainerElement figcaption() {
    return blockContainer("figcaption");
  }

  public static BlockContainerElement figure(Frag_I<?>... fragments) {
    return blockContainer("figure", fragments);
  }

  public static BlockContainerElement figure(Iterable<Frag_I<?>> fragments) {
    return blockContainer("figure", fragments);
  }

  public static BlockContainerElement figure(String... textContent) {
    return blockContainer("figure", textContent);
  }

  public static BlockContainerElement figure() {
    return blockContainer("figure");
  }

  public static BlockContainerElement footer(Frag_I<?>... fragments) {
    return blockContainer("footer", fragments);
  }

  public static BlockContainerElement footer(Iterable<Frag_I<?>> fragments) {
    return blockContainer("footer", fragments);
  }

  public static BlockContainerElement footer(String... textContent) {
    return blockContainer("footer", textContent);
  }

  public static BlockContainerElement footer() {
    return blockContainer("footer");
  }

  public static BlockContainerElement form(Frag_I<?>... fragments) {
    return blockContainer("form", fragments);
  }

  public static BlockContainerElement form(Iterable<Frag_I<?>> fragments) {
    return blockContainer("form", fragments);
  }

  public static BlockContainerElement form(String... textContent) {
    return blockContainer("form", textContent);
  }

  public static BlockContainerElement form() {
    return blockContainer("form");
  }

  public static BlockContainerElement h1(Frag_I<?>... fragments) {
    return blockContainer("h1", fragments);
  }

  public static BlockContainerElement h1(Iterable<Frag_I<?>> fragments) {
    return blockContainer("h1", fragments);
  }

  public static BlockContainerElement h1(String... textContent) {
    return blockContainer("h1", textContent);
  }

  public static BlockContainerElement h1() {
    return blockContainer("h1");
  }

  public static BlockContainerElement h2(Frag_I<?>... fragments) {
    return blockContainer("h2", fragments);
  }

  public static BlockContainerElement h2(Iterable<Frag_I<?>> fragments) {
    return blockContainer("h2", fragments);
  }

  public static BlockContainerElement h2(String... textContent) {
    return blockContainer("h2", textContent);
  }

  public static BlockContainerElement h2() {
    return blockContainer("h2");
  }

  public static BlockContainerElement h3(Frag_I<?>... fragments) {
    return blockContainer("h3", fragments);
  }

  public static BlockContainerElement h3(Iterable<Frag_I<?>> fragments) {
    return blockContainer("h3", fragments);
  }

  public static BlockContainerElement h3(String... textContent) {
    return blockContainer("h3", textContent);
  }

  public static BlockContainerElement h3() {
    return blockContainer("h3");
  }

  public static BlockContainerElement h4(Frag_I<?>... fragments) {
    return blockContainer("h4", fragments);
  }

  public static BlockContainerElement h4(Iterable<Frag_I<?>> fragments) {
    return blockContainer("h4", fragments);
  }

  public static BlockContainerElement h4(String... textContent) {
    return blockContainer("h4", textContent);
  }

  public static BlockContainerElement h4() {
    return blockContainer("h4");
  }

  public static BlockContainerElement h5(Frag_I<?>... fragments) {
    return blockContainer("h5", fragments);
  }

  public static BlockContainerElement h5(Iterable<Frag_I<?>> fragments) {
    return blockContainer("h5", fragments);
  }

  public static BlockContainerElement h5(String... textContent) {
    return blockContainer("h5", textContent);
  }

  public static BlockContainerElement h5() {
    return blockContainer("h5");
  }

  public static BlockContainerElement h6(Frag_I<?>... fragments) {
    return blockContainer("h6", fragments);
  }

  public static BlockContainerElement h6(Iterable<Frag_I<?>> fragments) {
    return blockContainer("h6", fragments);
  }

  public static BlockContainerElement h6(String... textContent) {
    return blockContainer("h6", textContent);
  }

  public static BlockContainerElement h6() {
    return blockContainer("h6");
  }

  public static BlockContainerElement head(Frag_I<?>... fragments) {
    return blockContainer("head", fragments);
  }

  public static BlockContainerElement head(Iterable<Frag_I<?>> fragments) {
    return blockContainer("head", fragments);
  }

  public static BlockContainerElement head(String... textContent) {
    return blockContainer("head", textContent);
  }

  public static BlockContainerElement head() {
    return blockContainer("head");
  }

  public static BlockContainerElement header(Frag_I<?>... fragments) {
    return blockContainer("header", fragments);
  }

  public static BlockContainerElement header(Iterable<Frag_I<?>> fragments) {
    return blockContainer("header", fragments);
  }

  public static BlockContainerElement header(String... textContent) {
    return blockContainer("header", textContent);
  }

  public static BlockContainerElement header() {
    return blockContainer("header");
  }

  public static BlockContainerElement hgroup(Frag_I<?>... fragments) {
    return blockContainer("hgroup", fragments);
  }

  public static BlockContainerElement hgroup(Iterable<Frag_I<?>> fragments) {
    return blockContainer("hgroup", fragments);
  }

  public static BlockContainerElement hgroup(String... textContent) {
    return blockContainer("hgroup", textContent);
  }

  public static BlockContainerElement hgroup() {
    return blockContainer("hgroup");
  }

  public static BlockVoidElement hr(Attr_I<?>... attributes) {
    return blockVoidElement("hr", attributes);
  }

  public static BlockVoidElement hr() {
    return blockVoidElement("hr");
  }

  public static BlockContainerElement html(Frag_I<?>... fragments) {
    return blockContainer("html", fragments);
  }

  public static BlockContainerElement html(Iterable<Frag_I<?>> fragments) {
    return blockContainer("html", fragments);
  }

  public static BlockContainerElement html(String... textContent) {
    return blockContainer("html", textContent);
  }

  public static BlockContainerElement html() {
    return blockContainer("html");
  }

  public static InlineContainerElement i(Frag_I<?>... fragments) {
    return inlineContainer("i", fragments);
  }

  public static InlineContainerElement i(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("i", fragments);
  }

  public static InlineContainerElement i(String... textContent) {
    return inlineContainer("i", textContent);
  }

  public static InlineContainerElement i() {
    return inlineContainer("i");
  }

  public static BlockContainerElement iframe(Frag_I<?>... fragments) {
    return blockContainer("iframe", fragments);
  }

  public static BlockContainerElement iframe(Iterable<Frag_I<?>> fragments) {
    return blockContainer("iframe", fragments);
  }

  public static BlockContainerElement iframe(String... textContent) {
    return blockContainer("iframe", textContent);
  }

  public static BlockContainerElement iframe() {
    return blockContainer("iframe");
  }

  public static InlineVoidElement img(Attr_I<?>... attributes) {
    return inlineVoidElement("img", attributes);
  }

  public static InlineVoidElement img() {
    return inlineVoidElement("img");
  }

  public static InlineVoidElement input(Attr_I<?>... attributes) {
    return inlineVoidElement("input", attributes);
  }

  public static InlineVoidElement input() {
    return inlineVoidElement("input");
  }

  public static InlineContainerElement ins(Frag_I<?>... fragments) {
    return inlineContainer("ins", fragments);
  }

  public static InlineContainerElement ins(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("ins", fragments);
  }

  public static InlineContainerElement ins(String... textContent) {
    return inlineContainer("ins", textContent);
  }

  public static InlineContainerElement ins() {
    return inlineContainer("ins");
  }

  public static InlineContainerElement kbd(Frag_I<?>... fragments) {
    return inlineContainer("kbd", fragments);
  }

  public static InlineContainerElement kbd(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("kbd", fragments);
  }

  public static InlineContainerElement kbd(String... textContent) {
    return inlineContainer("kbd", textContent);
  }

  public static InlineContainerElement kbd() {
    return inlineContainer("kbd");
  }

  public static InlineContainerElement label(Frag_I<?>... fragments) {
    return inlineContainer("label", fragments);
  }

  public static InlineContainerElement label(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("label", fragments);
  }

  public static InlineContainerElement label(String... textContent) {
    return inlineContainer("label", textContent);
  }

  public static InlineContainerElement label() {
    return inlineContainer("label");
  }

  public static BlockContainerElement legend(Frag_I<?>... fragments) {
    return blockContainer("legend", fragments);
  }

  public static BlockContainerElement legend(Iterable<Frag_I<?>> fragments) {
    return blockContainer("legend", fragments);
  }

  public static BlockContainerElement legend(String... textContent) {
    return blockContainer("legend", textContent);
  }

  public static BlockContainerElement legend() {
    return blockContainer("legend");
  }

  public static BlockContainerElement li(Frag_I<?>... fragments) {
    return blockContainer("li", fragments);
  }

  public static BlockContainerElement li(Iterable<Frag_I<?>> fragments) {
    return blockContainer("li", fragments);
  }

  public static BlockContainerElement li(String... textContent) {
    return blockContainer("li", textContent);
  }

  public static BlockContainerElement li() {
    return blockContainer("li");
  }

  public static BlockVoidElement link(Attr_I<?>... attributes) {
    return blockVoidElement("link", attributes);
  }

  public static BlockVoidElement link() {
    return blockVoidElement("link");
  }

  public static BlockContainerElement main(Frag_I<?>... fragments) {
    return blockContainer("main", fragments);
  }

  public static BlockContainerElement main(Iterable<Frag_I<?>> fragments) {
    return blockContainer("main", fragments);
  }

  public static BlockContainerElement main(String... textContent) {
    return blockContainer("main", textContent);
  }

  public static BlockContainerElement main() {
    return blockContainer("main");
  }

  public static BlockContainerElement map(Frag_I<?>... fragments) {
    return blockContainer("map", fragments);
  }

  public static BlockContainerElement map(Iterable<Frag_I<?>> fragments) {
    return blockContainer("map", fragments);
  }

  public static BlockContainerElement map(String... textContent) {
    return blockContainer("map", textContent);
  }

  public static BlockContainerElement map() {
    return blockContainer("map");
  }

  public static InlineContainerElement mark(Frag_I<?>... fragments) {
    return inlineContainer("mark", fragments);
  }

  public static InlineContainerElement mark(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("mark", fragments);
  }

  public static InlineContainerElement mark(String... textContent) {
    return inlineContainer("mark", textContent);
  }

  public static InlineContainerElement mark() {
    return inlineContainer("mark");
  }

  public static BlockContainerElement math(Frag_I<?>... fragments) {
    return blockContainer("math", fragments);
  }

  public static BlockContainerElement math(Iterable<Frag_I<?>> fragments) {
    return blockContainer("math", fragments);
  }

  public static BlockContainerElement math(String... textContent) {
    return blockContainer("math", textContent);
  }

  public static BlockContainerElement math() {
    return blockContainer("math");
  }

  public static BlockContainerElement menu(Frag_I<?>... fragments) {
    return blockContainer("menu", fragments);
  }

  public static BlockContainerElement menu(Iterable<Frag_I<?>> fragments) {
    return blockContainer("menu", fragments);
  }

  public static BlockContainerElement menu(String... textContent) {
    return blockContainer("menu", textContent);
  }

  public static BlockContainerElement menu() {
    return blockContainer("menu");
  }

  public static BlockVoidElement meta(Attr_I<?>... attributes) {
    return blockVoidElement("meta", attributes);
  }

  public static BlockVoidElement meta() {
    return blockVoidElement("meta");
  }

  public static InlineContainerElement meter(Frag_I<?>... fragments) {
    return inlineContainer("meter", fragments);
  }

  public static InlineContainerElement meter(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("meter", fragments);
  }

  public static InlineContainerElement meter(String... textContent) {
    return inlineContainer("meter", textContent);
  }

  public static InlineContainerElement meter() {
    return inlineContainer("meter");
  }

  public static BlockContainerElement nav(Frag_I<?>... fragments) {
    return blockContainer("nav", fragments);
  }

  public static BlockContainerElement nav(Iterable<Frag_I<?>> fragments) {
    return blockContainer("nav", fragments);
  }

  public static BlockContainerElement nav(String... textContent) {
    return blockContainer("nav", textContent);
  }

  public static BlockContainerElement nav() {
    return blockContainer("nav");
  }

  public static InlineContainerElement noscript(Frag_I<?>... fragments) {
    return inlineContainer("noscript", fragments);
  }

  public static InlineContainerElement noscript(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("noscript", fragments);
  }

  public static InlineContainerElement noscript(String... textContent) {
    return inlineContainer("noscript", textContent);
  }

  public static InlineContainerElement noscript() {
    return inlineContainer("noscript");
  }

  public static BlockContainerElement object(Frag_I<?>... fragments) {
    return blockContainer("object", fragments);
  }

  public static BlockContainerElement object(Iterable<Frag_I<?>> fragments) {
    return blockContainer("object", fragments);
  }

  public static BlockContainerElement object(String... textContent) {
    return blockContainer("object", textContent);
  }

  public static BlockContainerElement object() {
    return blockContainer("object");
  }

  public static BlockContainerElement ol(Frag_I<?>... fragments) {
    return blockContainer("ol", fragments);
  }

  public static BlockContainerElement ol(Iterable<Frag_I<?>> fragments) {
    return blockContainer("ol", fragments);
  }

  public static BlockContainerElement ol(String... textContent) {
    return blockContainer("ol", textContent);
  }

  public static BlockContainerElement ol() {
    return blockContainer("ol");
  }

  public static BlockContainerElement optgroup(Frag_I<?>... fragments) {
    return blockContainer("optgroup", fragments);
  }

  public static BlockContainerElement optgroup(Iterable<Frag_I<?>> fragments) {
    return blockContainer("optgroup", fragments);
  }

  public static BlockContainerElement optgroup(String... textContent) {
    return blockContainer("optgroup", textContent);
  }

  public static BlockContainerElement optgroup() {
    return blockContainer("optgroup");
  }

  public static BlockContainerElement option(Frag_I<?>... fragments) {
    return blockContainer("option", fragments);
  }

  public static BlockContainerElement option(Iterable<Frag_I<?>> fragments) {
    return blockContainer("option", fragments);
  }

  public static BlockContainerElement option(String... textContent) {
    return blockContainer("option", textContent);
  }

  public static BlockContainerElement option() {
    return blockContainer("option");
  }

  public static InlineContainerElement output(Frag_I<?>... fragments) {
    return inlineContainer("output", fragments);
  }

  public static InlineContainerElement output(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("output", fragments);
  }

  public static InlineContainerElement output(String... textContent) {
    return inlineContainer("output", textContent);
  }

  public static InlineContainerElement output() {
    return inlineContainer("output");
  }

  public static BlockContainerElement p(Frag_I<?>... fragments) {
    return blockContainer("p", fragments);
  }

  public static BlockContainerElement p(Iterable<Frag_I<?>> fragments) {
    return blockContainer("p", fragments);
  }

  public static BlockContainerElement p(String... textContent) {
    return blockContainer("p", textContent);
  }

  public static BlockContainerElement p() {
    return blockContainer("p");
  }

  public static BlockContainerElement picture(Frag_I<?>... fragments) {
    return blockContainer("picture", fragments);
  }

  public static BlockContainerElement picture(Iterable<Frag_I<?>> fragments) {
    return blockContainer("picture", fragments);
  }

  public static BlockContainerElement picture(String... textContent) {
    return blockContainer("picture", textContent);
  }

  public static BlockContainerElement picture() {
    return blockContainer("picture");
  }

  public static BlockContainerElement pre(Frag_I<?>... fragments) {
    return blockContainer("pre", fragments);
  }

  public static BlockContainerElement pre(Iterable<Frag_I<?>> fragments) {
    return blockContainer("pre", fragments);
  }

  public static BlockContainerElement pre(String... textContent) {
    return blockContainer("pre", textContent);
  }

  public static BlockContainerElement pre() {
    return blockContainer("pre");
  }

  public static InlineContainerElement progress(Frag_I<?>... fragments) {
    return inlineContainer("progress", fragments);
  }

  public static InlineContainerElement progress(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("progress", fragments);
  }

  public static InlineContainerElement progress(String... textContent) {
    return inlineContainer("progress", textContent);
  }

  public static InlineContainerElement progress() {
    return inlineContainer("progress");
  }

  public static InlineContainerElement q(Frag_I<?>... fragments) {
    return inlineContainer("q", fragments);
  }

  public static InlineContainerElement q(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("q", fragments);
  }

  public static InlineContainerElement q(String... textContent) {
    return inlineContainer("q", textContent);
  }

  public static InlineContainerElement q() {
    return inlineContainer("q");
  }

  public static BlockContainerElement rp(Frag_I<?>... fragments) {
    return blockContainer("rp", fragments);
  }

  public static BlockContainerElement rp(Iterable<Frag_I<?>> fragments) {
    return blockContainer("rp", fragments);
  }

  public static BlockContainerElement rp(String... textContent) {
    return blockContainer("rp", textContent);
  }

  public static BlockContainerElement rp() {
    return blockContainer("rp");
  }

  public static BlockContainerElement rt(Frag_I<?>... fragments) {
    return blockContainer("rt", fragments);
  }

  public static BlockContainerElement rt(Iterable<Frag_I<?>> fragments) {
    return blockContainer("rt", fragments);
  }

  public static BlockContainerElement rt(String... textContent) {
    return blockContainer("rt", textContent);
  }

  public static BlockContainerElement rt() {
    return blockContainer("rt");
  }

  public static InlineContainerElement ruby(Frag_I<?>... fragments) {
    return inlineContainer("ruby", fragments);
  }

  public static InlineContainerElement ruby(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("ruby", fragments);
  }

  public static InlineContainerElement ruby(String... textContent) {
    return inlineContainer("ruby", textContent);
  }

  public static InlineContainerElement ruby() {
    return inlineContainer("ruby");
  }

  public static InlineContainerElement s(Frag_I<?>... fragments) {
    return inlineContainer("s", fragments);
  }

  public static InlineContainerElement s(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("s", fragments);
  }

  public static InlineContainerElement s(String... textContent) {
    return inlineContainer("s", textContent);
  }

  public static InlineContainerElement s() {
    return inlineContainer("s");
  }

  public static InlineContainerElement samp(Frag_I<?>... fragments) {
    return inlineContainer("samp", fragments);
  }

  public static InlineContainerElement samp(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("samp", fragments);
  }

  public static InlineContainerElement samp(String... textContent) {
    return inlineContainer("samp", textContent);
  }

  public static InlineContainerElement samp() {
    return inlineContainer("samp");
  }

  public static BlockContainerElement script(Frag_I<?>... fragments) {
    return blockContainer("script", fragments);
  }

  public static BlockContainerElement script(Iterable<Frag_I<?>> fragments) {
    return blockContainer("script", fragments);
  }

  public static BlockContainerElement script(String... textContent) {
    return blockContainer("script", textContent);
  }

  public static BlockContainerElement script() {
    return blockContainer("script");
  }

  public static BlockContainerElement search(Frag_I<?>... fragments) {
    return blockContainer("search", fragments);
  }

  public static BlockContainerElement search(Iterable<Frag_I<?>> fragments) {
    return blockContainer("search", fragments);
  }

  public static BlockContainerElement search(String... textContent) {
    return blockContainer("search", textContent);
  }

  public static BlockContainerElement search() {
    return blockContainer("search");
  }

  public static BlockContainerElement section(Frag_I<?>... fragments) {
    return blockContainer("section", fragments);
  }

  public static BlockContainerElement section(Iterable<Frag_I<?>> fragments) {
    return blockContainer("section", fragments);
  }

  public static BlockContainerElement section(String... textContent) {
    return blockContainer("section", textContent);
  }

  public static BlockContainerElement section() {
    return blockContainer("section");
  }

  public static BlockContainerElement select(Frag_I<?>... fragments) {
    return blockContainer("select", fragments);
  }

  public static BlockContainerElement select(Iterable<Frag_I<?>> fragments) {
    return blockContainer("select", fragments);
  }

  public static BlockContainerElement select(String... textContent) {
    return blockContainer("select", textContent);
  }

  public static BlockContainerElement select() {
    return blockContainer("select");
  }

  public static BlockContainerElement slot(Frag_I<?>... fragments) {
    return blockContainer("slot", fragments);
  }

  public static BlockContainerElement slot(Iterable<Frag_I<?>> fragments) {
    return blockContainer("slot", fragments);
  }

  public static BlockContainerElement slot(String... textContent) {
    return blockContainer("slot", textContent);
  }

  public static BlockContainerElement slot() {
    return blockContainer("slot");
  }

  public static InlineContainerElement small(Frag_I<?>... fragments) {
    return inlineContainer("small", fragments);
  }

  public static InlineContainerElement small(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("small", fragments);
  }

  public static InlineContainerElement small(String... textContent) {
    return inlineContainer("small", textContent);
  }

  public static InlineContainerElement small() {
    return inlineContainer("small");
  }

  public static InlineVoidElement source(Attr_I<?>... attributes) {
    return inlineVoidElement("source", attributes);
  }

  public static InlineVoidElement source() {
    return inlineVoidElement("source");
  }

  public static InlineContainerElement span(Frag_I<?>... fragments) {
    return inlineContainer("span", fragments);
  }

  public static InlineContainerElement span(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("span", fragments);
  }

  public static InlineContainerElement span(String... textContent) {
    return inlineContainer("span", textContent);
  }

  public static InlineContainerElement span() {
    return inlineContainer("span");
  }

  public static InlineContainerElement strong(Frag_I<?>... fragments) {
    return inlineContainer("strong", fragments);
  }

  public static InlineContainerElement strong(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("strong", fragments);
  }

  public static InlineContainerElement strong(String... textContent) {
    return inlineContainer("strong", textContent);
  }

  public static InlineContainerElement strong() {
    return inlineContainer("strong");
  }

  public static BlockContainerElement style(Frag_I<?>... fragments) {
    return blockContainer("style", fragments);
  }

  public static BlockContainerElement style(Iterable<Frag_I<?>> fragments) {
    return blockContainer("style", fragments);
  }

  public static BlockContainerElement style(String... textContent) {
    return blockContainer("style", textContent);
  }

  public static BlockContainerElement style() {
    return blockContainer("style");
  }

  public static InlineContainerElement sub(Frag_I<?>... fragments) {
    return inlineContainer("sub", fragments);
  }

  public static InlineContainerElement sub(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("sub", fragments);
  }

  public static InlineContainerElement sub(String... textContent) {
    return inlineContainer("sub", textContent);
  }

  public static InlineContainerElement sub() {
    return inlineContainer("sub");
  }

  public static BlockContainerElement summary(Frag_I<?>... fragments) {
    return blockContainer("summary", fragments);
  }

  public static BlockContainerElement summary(Iterable<Frag_I<?>> fragments) {
    return blockContainer("summary", fragments);
  }

  public static BlockContainerElement summary(String... textContent) {
    return blockContainer("summary", textContent);
  }

  public static BlockContainerElement summary() {
    return blockContainer("summary");
  }

  public static InlineContainerElement sup(Frag_I<?>... fragments) {
    return inlineContainer("sup", fragments);
  }

  public static InlineContainerElement sup(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("sup", fragments);
  }

  public static InlineContainerElement sup(String... textContent) {
    return inlineContainer("sup", textContent);
  }

  public static InlineContainerElement sup() {
    return inlineContainer("sup");
  }

  public static BlockContainerElement svg(Frag_I<?>... fragments) {
    return blockContainer("svg", fragments);
  }

  public static BlockContainerElement svg(Iterable<Frag_I<?>> fragments) {
    return blockContainer("svg", fragments);
  }

  public static BlockContainerElement svg(String... textContent) {
    return blockContainer("svg", textContent);
  }

  public static BlockContainerElement svg() {
    return blockContainer("svg");
  }

  public static BlockContainerElement table(Frag_I<?>... fragments) {
    return blockContainer("table", fragments);
  }

  public static BlockContainerElement table(Iterable<Frag_I<?>> fragments) {
    return blockContainer("table", fragments);
  }

  public static BlockContainerElement table(String... textContent) {
    return blockContainer("table", textContent);
  }

  public static BlockContainerElement table() {
    return blockContainer("table");
  }

  public static BlockContainerElement tbody(Frag_I<?>... fragments) {
    return blockContainer("tbody", fragments);
  }

  public static BlockContainerElement tbody(Iterable<Frag_I<?>> fragments) {
    return blockContainer("tbody", fragments);
  }

  public static BlockContainerElement tbody(String... textContent) {
    return blockContainer("tbody", textContent);
  }

  public static BlockContainerElement tbody() {
    return blockContainer("tbody");
  }

  public static BlockContainerElement td(Frag_I<?>... fragments) {
    return blockContainer("td", fragments);
  }

  public static BlockContainerElement td(Iterable<Frag_I<?>> fragments) {
    return blockContainer("td", fragments);
  }

  public static BlockContainerElement td(String... textContent) {
    return blockContainer("td", textContent);
  }

  public static BlockContainerElement td() {
    return blockContainer("td");
  }

  public static BlockContainerElement template(Frag_I<?>... fragments) {
    return blockContainer("template", fragments);
  }

  public static BlockContainerElement template(Iterable<Frag_I<?>> fragments) {
    return blockContainer("template", fragments);
  }

  public static BlockContainerElement template(String... textContent) {
    return blockContainer("template", textContent);
  }

  public static BlockContainerElement template() {
    return blockContainer("template");
  }

  public static BlockContainerElement textarea(Frag_I<?>... fragments) {
    return blockContainer("textarea", fragments);
  }

  public static BlockContainerElement textarea(Iterable<Frag_I<?>> fragments) {
    return blockContainer("textarea", fragments);
  }

  public static BlockContainerElement textarea(String... textContent) {
    return blockContainer("textarea", textContent);
  }

  public static BlockContainerElement textarea() {
    return blockContainer("textarea");
  }

  public static BlockContainerElement tfoot(Frag_I<?>... fragments) {
    return blockContainer("tfoot", fragments);
  }

  public static BlockContainerElement tfoot(Iterable<Frag_I<?>> fragments) {
    return blockContainer("tfoot", fragments);
  }

  public static BlockContainerElement tfoot(String... textContent) {
    return blockContainer("tfoot", textContent);
  }

  public static BlockContainerElement tfoot() {
    return blockContainer("tfoot");
  }

  public static BlockContainerElement th(Frag_I<?>... fragments) {
    return blockContainer("th", fragments);
  }

  public static BlockContainerElement th(Iterable<Frag_I<?>> fragments) {
    return blockContainer("th", fragments);
  }

  public static BlockContainerElement th(String... textContent) {
    return blockContainer("th", textContent);
  }

  public static BlockContainerElement th() {
    return blockContainer("th");
  }

  public static BlockContainerElement thead(Frag_I<?>... fragments) {
    return blockContainer("thead", fragments);
  }

  public static BlockContainerElement thead(Iterable<Frag_I<?>> fragments) {
    return blockContainer("thead", fragments);
  }

  public static BlockContainerElement thead(String... textContent) {
    return blockContainer("thead", textContent);
  }

  public static BlockContainerElement thead() {
    return blockContainer("thead");
  }

  public static InlineContainerElement time(Frag_I<?>... fragments) {
    return inlineContainer("time", fragments);
  }

  public static InlineContainerElement time(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("time", fragments);
  }

  public static InlineContainerElement time(String... textContent) {
    return inlineContainer("time", textContent);
  }

  public static InlineContainerElement time() {
    return inlineContainer("time");
  }

  public static BlockContainerElement title(Frag_I<?>... fragments) {
    return blockContainer("title", fragments);
  }

  public static BlockContainerElement title(Iterable<Frag_I<?>> fragments) {
    return blockContainer("title", fragments);
  }

  public static BlockContainerElement title(String... textContent) {
    return blockContainer("title", textContent);
  }

  public static BlockContainerElement title() {
    return blockContainer("title");
  }

  public static BlockContainerElement tr(Frag_I<?>... fragments) {
    return blockContainer("tr", fragments);
  }

  public static BlockContainerElement tr(Iterable<Frag_I<?>> fragments) {
    return blockContainer("tr", fragments);
  }

  public static BlockContainerElement tr(String... textContent) {
    return blockContainer("tr", textContent);
  }

  public static BlockContainerElement tr() {
    return blockContainer("tr");
  }

  public static InlineVoidElement track(Attr_I<?>... attributes) {
    return inlineVoidElement("track", attributes);
  }

  public static InlineVoidElement track() {
    return inlineVoidElement("track");
  }

  public static InlineContainerElement u(Frag_I<?>... fragments) {
    return inlineContainer("u", fragments);
  }

  public static InlineContainerElement u(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("u", fragments);
  }

  public static InlineContainerElement u(String... textContent) {
    return inlineContainer("u", textContent);
  }

  public static InlineContainerElement u() {
    return inlineContainer("u");
  }

  public static BlockContainerElement ul(Frag_I<?>... fragments) {
    return blockContainer("ul", fragments);
  }

  public static BlockContainerElement ul(Iterable<Frag_I<?>> fragments) {
    return blockContainer("ul", fragments);
  }

  public static BlockContainerElement ul(String... textContent) {
    return blockContainer("ul", textContent);
  }

  public static BlockContainerElement ul() {
    return blockContainer("ul");
  }

  public static InlineContainerElement var(Frag_I<?>... fragments) {
    return inlineContainer("var", fragments);
  }

  public static InlineContainerElement var(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("var", fragments);
  }

  public static InlineContainerElement var(String... textContent) {
    return inlineContainer("var", textContent);
  }

  public static InlineContainerElement var() {
    return inlineContainer("var");
  }

  public static BlockContainerElement video(Frag_I<?>... fragments) {
    return blockContainer("video", fragments);
  }

  public static BlockContainerElement video(Iterable<Frag_I<?>> fragments) {
    return blockContainer("video", fragments);
  }

  public static BlockContainerElement video(String... textContent) {
    return blockContainer("video", textContent);
  }

  public static BlockContainerElement video() {
    return blockContainer("video");
  }

  public static InlineVoidElement wbr(Attr_I<?>... attributes) {
    return inlineVoidElement("wbr", attributes);
  }

  public static InlineVoidElement wbr() {
    return inlineVoidElement("wbr");
  }
}
