package luvml;

import static luvml.AttributeCategory.*;
import static luvml.AttributeScope.*;
import static luvml.AttributeType.*;

import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class A {
  private static final Map<String, Set<String>> ENUM_VALUES = new HashMap<String, Set<String>>() {{
          put("contenteditable:UNIVERSAL", Set.of("false", "plaintext-only", "true"));
          put("dir:UNIVERSAL", Set.of("ltr", "rtl", "auto"));
          put("translate:UNIVERSAL", Set.of("no", "yes"));
          put("aria-expanded:UNIVERSAL", Set.of("false", "undefined", "true"));
          put("autocomplete:FORM_ELEMENTS", Set.of("name", "email", "off", "current-password", "on", "username", "new-password"));
          put("enctype:FORM_ELEMENTS", Set.of("application/x-www-form-urlencoded", "multipart/form-data", "text/plain"));
          put("formenctype:FORM_ELEMENTS", Set.of("application/x-www-form-urlencoded", "multipart/form-data", "text/plain"));
          put("formmethod:FORM_ELEMENTS", Set.of("post", "get"));
          put("method:FORM_ELEMENTS", Set.of("post", "get"));
          put("target:FORM_ELEMENTS", Set.of("_parent", "_self", "_blank", "_top"));
          put("type:FORM_ELEMENTS", Set.of("text", "datetime-local", "checkbox", "search", "password", "url", "tel", "radio", "submit", "number", "time", "reset", "date", "color", "month", "button", "week", "file", "hidden", "image", "email", "range"));
          put("crossorigin:MEDIA_ELEMENTS", Set.of("use-credentials", "anonymous"));
          put("preload:MEDIA_ELEMENTS", Set.of("none", "auto", "metadata"));
          put("referrerpolicy:LINK_ELEMENTS", Set.of("strict-origin-when-cross-origin", "no-referrer-when-downgrade", "origin", "unsafe-url", "strict-origin", "no-referrer", "same-origin", "origin-when-cross-origin"));
          put("rel:LINK_ELEMENTS", Set.of("opener", "prefetch", "tag", "external", "canonical", "preconnect", "noopener", "prerender", "dns-prefetch", "manifest", "preload", "stylesheet", "icon", "author", "bookmark", "nofollow", "alternate", "license", "next", "help", "prev", "search", "noreferrer"));
          put("type:LINK_ELEMENTS", Set.of("application/rss+xml", "text/css", "image/x-icon", "text/javascript"));
          put("scope:TABLE_ELEMENTS", Set.of("col", "row", "rowgroup", "colgroup"));
          put("shape:SPECIFIC_ELEMENTS", Set.of("circle", "default", "rect", "poly"));
          put("wrap:SPECIFIC_ELEMENTS", Set.of("hard", "soft"));
          put("kind:SPECIFIC_ELEMENTS", Set.of("chapters", "metadata", "captions", "descriptions", "subtitles"));
      }};

  private static final Map<String, Set<AttributeCategory>> ATTRIBUTE_CATEGORIES = new HashMap<String, Set<AttributeCategory>>() {{
          put("accesskey", Set.of(GLOBAL));
          put("accesskey:UNIVERSAL", Set.of(GLOBAL));
          put("class", Set.of(GLOBAL));
          put("class:UNIVERSAL", Set.of(GLOBAL));
          put("contenteditable", Set.of(GLOBAL));
          put("contenteditable:UNIVERSAL", Set.of(GLOBAL));
          put("dir", Set.of(GLOBAL));
          put("dir:UNIVERSAL", Set.of(GLOBAL));
          put("draggable", Set.of(GLOBAL));
          put("draggable:UNIVERSAL", Set.of(GLOBAL));
          put("hidden", Set.of(GLOBAL));
          put("hidden:UNIVERSAL", Set.of(GLOBAL));
          put("id", Set.of(GLOBAL));
          put("id:UNIVERSAL", Set.of(GLOBAL));
          put("lang", Set.of(GLOBAL));
          put("lang:UNIVERSAL", Set.of(GLOBAL));
          put("spellcheck", Set.of(GLOBAL));
          put("spellcheck:UNIVERSAL", Set.of(GLOBAL));
          put("style", Set.of(GLOBAL));
          put("style:UNIVERSAL", Set.of(GLOBAL));
          put("tabindex", Set.of(GLOBAL));
          put("tabindex:UNIVERSAL", Set.of(GLOBAL));
          put("title", Set.of(GLOBAL));
          put("title:UNIVERSAL", Set.of(GLOBAL));
          put("translate", Set.of(GLOBAL));
          put("translate:UNIVERSAL", Set.of(GLOBAL));
          put("aria-label", Set.of(ACCESSIBILITY));
          put("aria-label:UNIVERSAL", Set.of(ACCESSIBILITY));
          put("aria-labelledby", Set.of(ACCESSIBILITY));
          put("aria-labelledby:UNIVERSAL", Set.of(ACCESSIBILITY));
          put("aria-describedby", Set.of(ACCESSIBILITY));
          put("aria-describedby:UNIVERSAL", Set.of(ACCESSIBILITY));
          put("aria-hidden", Set.of(ACCESSIBILITY));
          put("aria-hidden:UNIVERSAL", Set.of(ACCESSIBILITY));
          put("aria-expanded", Set.of(ACCESSIBILITY));
          put("aria-expanded:UNIVERSAL", Set.of(ACCESSIBILITY));
          put("accept", Set.of(FORM));
          put("accept:FORM_ELEMENTS", Set.of(FORM));
          put("accept-charset", Set.of(FORM));
          put("accept-charset:FORM_ELEMENTS", Set.of(FORM));
          put("action", Set.of(FORM));
          put("action:FORM_ELEMENTS", Set.of(FORM));
          put("autocomplete", Set.of(FORM));
          put("autocomplete:FORM_ELEMENTS", Set.of(FORM));
          put("autofocus", Set.of(FORM));
          put("autofocus:FORM_ELEMENTS", Set.of(FORM));
          put("checked", Set.of(FORM));
          put("checked:FORM_ELEMENTS", Set.of(FORM));
          put("disabled", Set.of(FORM));
          put("disabled:FORM_ELEMENTS", Set.of(FORM));
          put("enctype", Set.of(FORM));
          put("enctype:FORM_ELEMENTS", Set.of(FORM));
          put("for", Set.of(FORM));
          put("for:FORM_ELEMENTS", Set.of(FORM));
          put("form", Set.of(FORM));
          put("form:FORM_ELEMENTS", Set.of(FORM));
          put("formaction", Set.of(FORM));
          put("formaction:FORM_ELEMENTS", Set.of(FORM));
          put("formenctype", Set.of(FORM));
          put("formenctype:FORM_ELEMENTS", Set.of(FORM));
          put("formmethod", Set.of(FORM));
          put("formmethod:FORM_ELEMENTS", Set.of(FORM));
          put("formnovalidate", Set.of(FORM));
          put("formnovalidate:FORM_ELEMENTS", Set.of(FORM));
          put("formtarget", Set.of(FORM));
          put("formtarget:FORM_ELEMENTS", Set.of(FORM));
          put("max", Set.of(FORM));
          put("max:FORM_ELEMENTS", Set.of(FORM));
          put("maxlength", Set.of(FORM));
          put("maxlength:FORM_ELEMENTS", Set.of(FORM));
          put("method", Set.of(FORM));
          put("method:FORM_ELEMENTS", Set.of(FORM));
          put("min", Set.of(FORM));
          put("min:FORM_ELEMENTS", Set.of(FORM));
          put("minlength", Set.of(FORM));
          put("minlength:FORM_ELEMENTS", Set.of(FORM));
          put("multiple", Set.of(FORM));
          put("multiple:FORM_ELEMENTS", Set.of(FORM));
          put("name", Set.of(FORM));
          put("name:FORM_ELEMENTS", Set.of(FORM));
          put("novalidate", Set.of(FORM));
          put("novalidate:FORM_ELEMENTS", Set.of(FORM));
          put("pattern", Set.of(FORM));
          put("pattern:FORM_ELEMENTS", Set.of(FORM));
          put("placeholder", Set.of(FORM));
          put("placeholder:FORM_ELEMENTS", Set.of(FORM));
          put("readonly", Set.of(FORM));
          put("readonly:FORM_ELEMENTS", Set.of(FORM));
          put("required", Set.of(FORM));
          put("required:FORM_ELEMENTS", Set.of(FORM));
          put("selected", Set.of(FORM));
          put("selected:FORM_ELEMENTS", Set.of(FORM));
          put("size", Set.of(FORM));
          put("size:FORM_ELEMENTS", Set.of(FORM));
          put("step", Set.of(FORM));
          put("step:FORM_ELEMENTS", Set.of(FORM));
          put("target", Set.of(FORM));
          put("target:FORM_ELEMENTS", Set.of(FORM));
          put("type", Set.of(FORM));
          put("type:FORM_ELEMENTS", Set.of(FORM));
          put("value", Set.of(FORM));
          put("value:FORM_ELEMENTS", Set.of(FORM));
          put("alt", Set.of(MEDIA));
          put("alt:MEDIA_ELEMENTS", Set.of(MEDIA));
          put("autoplay", Set.of(MEDIA));
          put("autoplay:MEDIA_ELEMENTS", Set.of(MEDIA));
          put("controls", Set.of(MEDIA));
          put("controls:MEDIA_ELEMENTS", Set.of(MEDIA));
          put("crossorigin", Set.of(MEDIA));
          put("crossorigin:MEDIA_ELEMENTS", Set.of(MEDIA));
          put("height", Set.of(MEDIA));
          put("height:MEDIA_ELEMENTS", Set.of(MEDIA));
          put("loop", Set.of(MEDIA));
          put("loop:MEDIA_ELEMENTS", Set.of(MEDIA));
          put("muted", Set.of(MEDIA));
          put("muted:MEDIA_ELEMENTS", Set.of(MEDIA));
          put("preload", Set.of(MEDIA));
          put("preload:MEDIA_ELEMENTS", Set.of(MEDIA));
          put("poster", Set.of(MEDIA));
          put("poster:MEDIA_ELEMENTS", Set.of(MEDIA));
          put("src", Set.of(MEDIA));
          put("src:MEDIA_ELEMENTS", Set.of(MEDIA));
          put("srcset", Set.of(MEDIA));
          put("srcset:MEDIA_ELEMENTS", Set.of(MEDIA));
          put("width", Set.of(MEDIA));
          put("width:MEDIA_ELEMENTS", Set.of(MEDIA));
          put("download", Set.of(LINK));
          put("download:LINK_ELEMENTS", Set.of(LINK));
          put("href", Set.of(LINK));
          put("href:LINK_ELEMENTS", Set.of(LINK));
          put("hreflang", Set.of(LINK));
          put("hreflang:LINK_ELEMENTS", Set.of(LINK));
          put("ping", Set.of(LINK));
          put("ping:LINK_ELEMENTS", Set.of(LINK));
          put("referrerpolicy", Set.of(LINK));
          put("referrerpolicy:LINK_ELEMENTS", Set.of(LINK));
          put("rel", Set.of(LINK));
          put("rel:LINK_ELEMENTS", Set.of(LINK));
          put("sizes", Set.of(LINK));
          put("sizes:LINK_ELEMENTS", Set.of(LINK));
          put("type", Set.of(LINK));
          put("type:LINK_ELEMENTS", Set.of(LINK));
          put("colspan", Set.of(TABLE));
          put("colspan:TABLE_ELEMENTS", Set.of(TABLE));
          put("rowspan", Set.of(TABLE));
          put("rowspan:TABLE_ELEMENTS", Set.of(TABLE));
          put("headers", Set.of(TABLE));
          put("headers:TABLE_ELEMENTS", Set.of(TABLE));
          put("scope", Set.of(TABLE));
          put("scope:TABLE_ELEMENTS", Set.of(TABLE));
          put("span", Set.of(TABLE));
          put("span:TABLE_ELEMENTS", Set.of(TABLE));
          put("open", Set.of(INTERACTIVE));
          put("open:INTERACTIVE_ELEMENTS", Set.of(INTERACTIVE));
          put("charset", Set.of(METADATA));
          put("charset:METADATA_ELEMENTS", Set.of(METADATA));
          put("content", Set.of(METADATA));
          put("content:METADATA_ELEMENTS", Set.of(METADATA));
          put("http-equiv", Set.of(METADATA));
          put("http-equiv:METADATA_ELEMENTS", Set.of(METADATA));
          put("media", Set.of(METADATA));
          put("media:METADATA_ELEMENTS", Set.of(METADATA));
          put("itemid", Set.of(MICRODATA));
          put("itemid:UNIVERSAL", Set.of(MICRODATA));
          put("itemprop", Set.of(MICRODATA));
          put("itemprop:UNIVERSAL", Set.of(MICRODATA));
          put("itemref", Set.of(MICRODATA));
          put("itemref:UNIVERSAL", Set.of(MICRODATA));
          put("itemscope", Set.of(MICRODATA));
          put("itemscope:UNIVERSAL", Set.of(MICRODATA));
          put("itemtype", Set.of(MICRODATA));
          put("itemtype:UNIVERSAL", Set.of(MICRODATA));
          put("coords", Set.of());
          put("coords:SPECIFIC_ELEMENTS", Set.of());
          put("shape", Set.of());
          put("shape:SPECIFIC_ELEMENTS", Set.of());
          put("usemap", Set.of());
          put("usemap:SPECIFIC_ELEMENTS", Set.of());
          put("wrap", Set.of());
          put("wrap:SPECIFIC_ELEMENTS", Set.of());
          put("rows", Set.of());
          put("rows:SPECIFIC_ELEMENTS", Set.of());
          put("cols", Set.of());
          put("cols:SPECIFIC_ELEMENTS", Set.of());
          put("start", Set.of());
          put("start:SPECIFIC_ELEMENTS", Set.of());
          put("reversed", Set.of());
          put("reversed:SPECIFIC_ELEMENTS", Set.of());
          put("kind", Set.of());
          put("kind:SPECIFIC_ELEMENTS", Set.of());
          put("srclang", Set.of());
          put("srclang:SPECIFIC_ELEMENTS", Set.of());
          put("label", Set.of());
          put("label:SPECIFIC_ELEMENTS", Set.of());
          put("default", Set.of());
          put("default:SPECIFIC_ELEMENTS", Set.of());
          put("align", Set.of(DEPRECATED));
          put("align:SPECIFIC_ELEMENTS", Set.of(DEPRECATED));
          put("bgcolor", Set.of(DEPRECATED));
          put("bgcolor:SPECIFIC_ELEMENTS", Set.of(DEPRECATED));
          put("border", Set.of(DEPRECATED));
          put("border:SPECIFIC_ELEMENTS", Set.of(DEPRECATED));
          put("cellpadding", Set.of(DEPRECATED));
          put("cellpadding:SPECIFIC_ELEMENTS", Set.of(DEPRECATED));
          put("cellspacing", Set.of(DEPRECATED));
          put("cellspacing:SPECIFIC_ELEMENTS", Set.of(DEPRECATED));
          put("color", Set.of(DEPRECATED));
          put("color:SPECIFIC_ELEMENTS", Set.of(DEPRECATED));
          put("face", Set.of(DEPRECATED));
          put("face:SPECIFIC_ELEMENTS", Set.of(DEPRECATED));
          put("size", Set.of(DEPRECATED));
          put("size:SPECIFIC_ELEMENTS", Set.of(DEPRECATED));
      }};

  private static final Map<String, AttributeType> ATTRIBUTE_TYPES = new HashMap<String, AttributeType>() {{
          put("accesskey", STRING);
          put("accesskey:UNIVERSAL", STRING);
          put("class", TOKEN_LIST);
          put("class:UNIVERSAL", TOKEN_LIST);
          put("contenteditable", ENUM);
          put("contenteditable:UNIVERSAL", ENUM);
          put("dir", ENUM);
          put("dir:UNIVERSAL", ENUM);
          put("draggable", BOOLEAN);
          put("draggable:UNIVERSAL", BOOLEAN);
          put("hidden", BOOLEAN);
          put("hidden:UNIVERSAL", BOOLEAN);
          put("id", STRING);
          put("id:UNIVERSAL", STRING);
          put("lang", LANGUAGE);
          put("lang:UNIVERSAL", LANGUAGE);
          put("spellcheck", BOOLEAN);
          put("spellcheck:UNIVERSAL", BOOLEAN);
          put("style", STRING);
          put("style:UNIVERSAL", STRING);
          put("tabindex", NUMBER);
          put("tabindex:UNIVERSAL", NUMBER);
          put("title", STRING);
          put("title:UNIVERSAL", STRING);
          put("translate", ENUM);
          put("translate:UNIVERSAL", ENUM);
          put("aria-label", STRING);
          put("aria-label:UNIVERSAL", STRING);
          put("aria-labelledby", TOKEN_LIST);
          put("aria-labelledby:UNIVERSAL", TOKEN_LIST);
          put("aria-describedby", TOKEN_LIST);
          put("aria-describedby:UNIVERSAL", TOKEN_LIST);
          put("aria-hidden", BOOLEAN);
          put("aria-hidden:UNIVERSAL", BOOLEAN);
          put("aria-expanded", ENUM);
          put("aria-expanded:UNIVERSAL", ENUM);
          put("accept", COMMA_LIST);
          put("accept:FORM_ELEMENTS", COMMA_LIST);
          put("accept-charset", TOKEN_LIST);
          put("accept-charset:FORM_ELEMENTS", TOKEN_LIST);
          put("action", URL);
          put("action:FORM_ELEMENTS", URL);
          put("autocomplete", ENUM);
          put("autocomplete:FORM_ELEMENTS", ENUM);
          put("autofocus", BOOLEAN);
          put("autofocus:FORM_ELEMENTS", BOOLEAN);
          put("checked", BOOLEAN);
          put("checked:FORM_ELEMENTS", BOOLEAN);
          put("disabled", BOOLEAN);
          put("disabled:FORM_ELEMENTS", BOOLEAN);
          put("enctype", ENUM);
          put("enctype:FORM_ELEMENTS", ENUM);
          put("for", STRING);
          put("for:FORM_ELEMENTS", STRING);
          put("form", STRING);
          put("form:FORM_ELEMENTS", STRING);
          put("formaction", URL);
          put("formaction:FORM_ELEMENTS", URL);
          put("formenctype", ENUM);
          put("formenctype:FORM_ELEMENTS", ENUM);
          put("formmethod", ENUM);
          put("formmethod:FORM_ELEMENTS", ENUM);
          put("formnovalidate", BOOLEAN);
          put("formnovalidate:FORM_ELEMENTS", BOOLEAN);
          put("formtarget", STRING);
          put("formtarget:FORM_ELEMENTS", STRING);
          put("max", STRING);
          put("max:FORM_ELEMENTS", STRING);
          put("maxlength", NUMBER);
          put("maxlength:FORM_ELEMENTS", NUMBER);
          put("method", ENUM);
          put("method:FORM_ELEMENTS", ENUM);
          put("min", STRING);
          put("min:FORM_ELEMENTS", STRING);
          put("minlength", NUMBER);
          put("minlength:FORM_ELEMENTS", NUMBER);
          put("multiple", BOOLEAN);
          put("multiple:FORM_ELEMENTS", BOOLEAN);
          put("name", STRING);
          put("name:FORM_ELEMENTS", STRING);
          put("novalidate", BOOLEAN);
          put("novalidate:FORM_ELEMENTS", BOOLEAN);
          put("pattern", REGEX);
          put("pattern:FORM_ELEMENTS", REGEX);
          put("placeholder", STRING);
          put("placeholder:FORM_ELEMENTS", STRING);
          put("readonly", BOOLEAN);
          put("readonly:FORM_ELEMENTS", BOOLEAN);
          put("required", BOOLEAN);
          put("required:FORM_ELEMENTS", BOOLEAN);
          put("selected", BOOLEAN);
          put("selected:FORM_ELEMENTS", BOOLEAN);
          put("size", NUMBER);
          put("size:FORM_ELEMENTS", NUMBER);
          put("step", STRING);
          put("step:FORM_ELEMENTS", STRING);
          put("target", ENUM);
          put("target:FORM_ELEMENTS", ENUM);
          put("type", ENUM);
          put("type:FORM_ELEMENTS", ENUM);
          put("value", STRING);
          put("value:FORM_ELEMENTS", STRING);
          put("alt", STRING);
          put("alt:MEDIA_ELEMENTS", STRING);
          put("autoplay", BOOLEAN);
          put("autoplay:MEDIA_ELEMENTS", BOOLEAN);
          put("controls", BOOLEAN);
          put("controls:MEDIA_ELEMENTS", BOOLEAN);
          put("crossorigin", ENUM);
          put("crossorigin:MEDIA_ELEMENTS", ENUM);
          put("height", DIMENSION);
          put("height:MEDIA_ELEMENTS", DIMENSION);
          put("loop", BOOLEAN);
          put("loop:MEDIA_ELEMENTS", BOOLEAN);
          put("muted", BOOLEAN);
          put("muted:MEDIA_ELEMENTS", BOOLEAN);
          put("preload", ENUM);
          put("preload:MEDIA_ELEMENTS", ENUM);
          put("poster", URL);
          put("poster:MEDIA_ELEMENTS", URL);
          put("src", URL);
          put("src:MEDIA_ELEMENTS", URL);
          put("srcset", STRING);
          put("srcset:MEDIA_ELEMENTS", STRING);
          put("width", DIMENSION);
          put("width:MEDIA_ELEMENTS", DIMENSION);
          put("download", STRING);
          put("download:LINK_ELEMENTS", STRING);
          put("href", URL);
          put("href:LINK_ELEMENTS", URL);
          put("hreflang", LANGUAGE);
          put("hreflang:LINK_ELEMENTS", LANGUAGE);
          put("ping", TOKEN_LIST);
          put("ping:LINK_ELEMENTS", TOKEN_LIST);
          put("referrerpolicy", ENUM);
          put("referrerpolicy:LINK_ELEMENTS", ENUM);
          put("rel", ENUM);
          put("rel:LINK_ELEMENTS", ENUM);
          put("sizes", TOKEN_LIST);
          put("sizes:LINK_ELEMENTS", TOKEN_LIST);
          put("type", ENUM);
          put("type:LINK_ELEMENTS", ENUM);
          put("colspan", NUMBER);
          put("colspan:TABLE_ELEMENTS", NUMBER);
          put("rowspan", NUMBER);
          put("rowspan:TABLE_ELEMENTS", NUMBER);
          put("headers", TOKEN_LIST);
          put("headers:TABLE_ELEMENTS", TOKEN_LIST);
          put("scope", ENUM);
          put("scope:TABLE_ELEMENTS", ENUM);
          put("span", NUMBER);
          put("span:TABLE_ELEMENTS", NUMBER);
          put("open", BOOLEAN);
          put("open:INTERACTIVE_ELEMENTS", BOOLEAN);
          put("charset", CHARSET);
          put("charset:METADATA_ELEMENTS", CHARSET);
          put("content", STRING);
          put("content:METADATA_ELEMENTS", STRING);
          put("http-equiv", STRING);
          put("http-equiv:METADATA_ELEMENTS", STRING);
          put("media", STRING);
          put("media:METADATA_ELEMENTS", STRING);
          put("itemid", URL);
          put("itemid:UNIVERSAL", URL);
          put("itemprop", TOKEN_LIST);
          put("itemprop:UNIVERSAL", TOKEN_LIST);
          put("itemref", TOKEN_LIST);
          put("itemref:UNIVERSAL", TOKEN_LIST);
          put("itemscope", BOOLEAN);
          put("itemscope:UNIVERSAL", BOOLEAN);
          put("itemtype", URL);
          put("itemtype:UNIVERSAL", URL);
          put("coords", COMMA_LIST);
          put("coords:SPECIFIC_ELEMENTS", COMMA_LIST);
          put("shape", ENUM);
          put("shape:SPECIFIC_ELEMENTS", ENUM);
          put("usemap", STRING);
          put("usemap:SPECIFIC_ELEMENTS", STRING);
          put("wrap", ENUM);
          put("wrap:SPECIFIC_ELEMENTS", ENUM);
          put("rows", NUMBER);
          put("rows:SPECIFIC_ELEMENTS", NUMBER);
          put("cols", NUMBER);
          put("cols:SPECIFIC_ELEMENTS", NUMBER);
          put("start", NUMBER);
          put("start:SPECIFIC_ELEMENTS", NUMBER);
          put("reversed", BOOLEAN);
          put("reversed:SPECIFIC_ELEMENTS", BOOLEAN);
          put("kind", ENUM);
          put("kind:SPECIFIC_ELEMENTS", ENUM);
          put("srclang", LANGUAGE);
          put("srclang:SPECIFIC_ELEMENTS", LANGUAGE);
          put("label", STRING);
          put("label:SPECIFIC_ELEMENTS", STRING);
          put("default", BOOLEAN);
          put("default:SPECIFIC_ELEMENTS", BOOLEAN);
          put("align", STRING);
          put("align:SPECIFIC_ELEMENTS", STRING);
          put("bgcolor", COLOR);
          put("bgcolor:SPECIFIC_ELEMENTS", COLOR);
          put("border", NUMBER);
          put("border:SPECIFIC_ELEMENTS", NUMBER);
          put("cellpadding", NUMBER);
          put("cellpadding:SPECIFIC_ELEMENTS", NUMBER);
          put("cellspacing", NUMBER);
          put("cellspacing:SPECIFIC_ELEMENTS", NUMBER);
          put("color", COLOR);
          put("color:SPECIFIC_ELEMENTS", COLOR);
          put("face", STRING);
          put("face:SPECIFIC_ELEMENTS", STRING);
          put("size", NUMBER);
          put("size:SPECIFIC_ELEMENTS", NUMBER);
      }};

  private static final Map<String, AttributeScope> ATTRIBUTE_SCOPES = new HashMap<String, AttributeScope>() {{
          put("accesskey", UNIVERSAL);
          put("accesskey:UNIVERSAL", UNIVERSAL);
          put("class", UNIVERSAL);
          put("class:UNIVERSAL", UNIVERSAL);
          put("contenteditable", UNIVERSAL);
          put("contenteditable:UNIVERSAL", UNIVERSAL);
          put("dir", UNIVERSAL);
          put("dir:UNIVERSAL", UNIVERSAL);
          put("draggable", UNIVERSAL);
          put("draggable:UNIVERSAL", UNIVERSAL);
          put("hidden", UNIVERSAL);
          put("hidden:UNIVERSAL", UNIVERSAL);
          put("id", UNIVERSAL);
          put("id:UNIVERSAL", UNIVERSAL);
          put("lang", UNIVERSAL);
          put("lang:UNIVERSAL", UNIVERSAL);
          put("spellcheck", UNIVERSAL);
          put("spellcheck:UNIVERSAL", UNIVERSAL);
          put("style", UNIVERSAL);
          put("style:UNIVERSAL", UNIVERSAL);
          put("tabindex", UNIVERSAL);
          put("tabindex:UNIVERSAL", UNIVERSAL);
          put("title", UNIVERSAL);
          put("title:UNIVERSAL", UNIVERSAL);
          put("translate", UNIVERSAL);
          put("translate:UNIVERSAL", UNIVERSAL);
          put("aria-label", UNIVERSAL);
          put("aria-label:UNIVERSAL", UNIVERSAL);
          put("aria-labelledby", UNIVERSAL);
          put("aria-labelledby:UNIVERSAL", UNIVERSAL);
          put("aria-describedby", UNIVERSAL);
          put("aria-describedby:UNIVERSAL", UNIVERSAL);
          put("aria-hidden", UNIVERSAL);
          put("aria-hidden:UNIVERSAL", UNIVERSAL);
          put("aria-expanded", UNIVERSAL);
          put("aria-expanded:UNIVERSAL", UNIVERSAL);
          put("accept", FORM_ELEMENTS);
          put("accept:FORM_ELEMENTS", FORM_ELEMENTS);
          put("accept-charset", FORM_ELEMENTS);
          put("accept-charset:FORM_ELEMENTS", FORM_ELEMENTS);
          put("action", FORM_ELEMENTS);
          put("action:FORM_ELEMENTS", FORM_ELEMENTS);
          put("autocomplete", FORM_ELEMENTS);
          put("autocomplete:FORM_ELEMENTS", FORM_ELEMENTS);
          put("autofocus", FORM_ELEMENTS);
          put("autofocus:FORM_ELEMENTS", FORM_ELEMENTS);
          put("checked", FORM_ELEMENTS);
          put("checked:FORM_ELEMENTS", FORM_ELEMENTS);
          put("disabled", FORM_ELEMENTS);
          put("disabled:FORM_ELEMENTS", FORM_ELEMENTS);
          put("enctype", FORM_ELEMENTS);
          put("enctype:FORM_ELEMENTS", FORM_ELEMENTS);
          put("for", FORM_ELEMENTS);
          put("for:FORM_ELEMENTS", FORM_ELEMENTS);
          put("form", FORM_ELEMENTS);
          put("form:FORM_ELEMENTS", FORM_ELEMENTS);
          put("formaction", FORM_ELEMENTS);
          put("formaction:FORM_ELEMENTS", FORM_ELEMENTS);
          put("formenctype", FORM_ELEMENTS);
          put("formenctype:FORM_ELEMENTS", FORM_ELEMENTS);
          put("formmethod", FORM_ELEMENTS);
          put("formmethod:FORM_ELEMENTS", FORM_ELEMENTS);
          put("formnovalidate", FORM_ELEMENTS);
          put("formnovalidate:FORM_ELEMENTS", FORM_ELEMENTS);
          put("formtarget", FORM_ELEMENTS);
          put("formtarget:FORM_ELEMENTS", FORM_ELEMENTS);
          put("max", FORM_ELEMENTS);
          put("max:FORM_ELEMENTS", FORM_ELEMENTS);
          put("maxlength", FORM_ELEMENTS);
          put("maxlength:FORM_ELEMENTS", FORM_ELEMENTS);
          put("method", FORM_ELEMENTS);
          put("method:FORM_ELEMENTS", FORM_ELEMENTS);
          put("min", FORM_ELEMENTS);
          put("min:FORM_ELEMENTS", FORM_ELEMENTS);
          put("minlength", FORM_ELEMENTS);
          put("minlength:FORM_ELEMENTS", FORM_ELEMENTS);
          put("multiple", FORM_ELEMENTS);
          put("multiple:FORM_ELEMENTS", FORM_ELEMENTS);
          put("name", FORM_ELEMENTS);
          put("name:FORM_ELEMENTS", FORM_ELEMENTS);
          put("novalidate", FORM_ELEMENTS);
          put("novalidate:FORM_ELEMENTS", FORM_ELEMENTS);
          put("pattern", FORM_ELEMENTS);
          put("pattern:FORM_ELEMENTS", FORM_ELEMENTS);
          put("placeholder", FORM_ELEMENTS);
          put("placeholder:FORM_ELEMENTS", FORM_ELEMENTS);
          put("readonly", FORM_ELEMENTS);
          put("readonly:FORM_ELEMENTS", FORM_ELEMENTS);
          put("required", FORM_ELEMENTS);
          put("required:FORM_ELEMENTS", FORM_ELEMENTS);
          put("selected", FORM_ELEMENTS);
          put("selected:FORM_ELEMENTS", FORM_ELEMENTS);
          put("size", FORM_ELEMENTS);
          put("size:FORM_ELEMENTS", FORM_ELEMENTS);
          put("step", FORM_ELEMENTS);
          put("step:FORM_ELEMENTS", FORM_ELEMENTS);
          put("target", FORM_ELEMENTS);
          put("target:FORM_ELEMENTS", FORM_ELEMENTS);
          put("type", FORM_ELEMENTS);
          put("type:FORM_ELEMENTS", FORM_ELEMENTS);
          put("value", FORM_ELEMENTS);
          put("value:FORM_ELEMENTS", FORM_ELEMENTS);
          put("alt", MEDIA_ELEMENTS);
          put("alt:MEDIA_ELEMENTS", MEDIA_ELEMENTS);
          put("autoplay", MEDIA_ELEMENTS);
          put("autoplay:MEDIA_ELEMENTS", MEDIA_ELEMENTS);
          put("controls", MEDIA_ELEMENTS);
          put("controls:MEDIA_ELEMENTS", MEDIA_ELEMENTS);
          put("crossorigin", MEDIA_ELEMENTS);
          put("crossorigin:MEDIA_ELEMENTS", MEDIA_ELEMENTS);
          put("height", MEDIA_ELEMENTS);
          put("height:MEDIA_ELEMENTS", MEDIA_ELEMENTS);
          put("loop", MEDIA_ELEMENTS);
          put("loop:MEDIA_ELEMENTS", MEDIA_ELEMENTS);
          put("muted", MEDIA_ELEMENTS);
          put("muted:MEDIA_ELEMENTS", MEDIA_ELEMENTS);
          put("preload", MEDIA_ELEMENTS);
          put("preload:MEDIA_ELEMENTS", MEDIA_ELEMENTS);
          put("poster", MEDIA_ELEMENTS);
          put("poster:MEDIA_ELEMENTS", MEDIA_ELEMENTS);
          put("src", MEDIA_ELEMENTS);
          put("src:MEDIA_ELEMENTS", MEDIA_ELEMENTS);
          put("srcset", MEDIA_ELEMENTS);
          put("srcset:MEDIA_ELEMENTS", MEDIA_ELEMENTS);
          put("width", MEDIA_ELEMENTS);
          put("width:MEDIA_ELEMENTS", MEDIA_ELEMENTS);
          put("download", LINK_ELEMENTS);
          put("download:LINK_ELEMENTS", LINK_ELEMENTS);
          put("href", LINK_ELEMENTS);
          put("href:LINK_ELEMENTS", LINK_ELEMENTS);
          put("hreflang", LINK_ELEMENTS);
          put("hreflang:LINK_ELEMENTS", LINK_ELEMENTS);
          put("ping", LINK_ELEMENTS);
          put("ping:LINK_ELEMENTS", LINK_ELEMENTS);
          put("referrerpolicy", LINK_ELEMENTS);
          put("referrerpolicy:LINK_ELEMENTS", LINK_ELEMENTS);
          put("rel", LINK_ELEMENTS);
          put("rel:LINK_ELEMENTS", LINK_ELEMENTS);
          put("sizes", LINK_ELEMENTS);
          put("sizes:LINK_ELEMENTS", LINK_ELEMENTS);
          put("type", LINK_ELEMENTS);
          put("type:LINK_ELEMENTS", LINK_ELEMENTS);
          put("colspan", TABLE_ELEMENTS);
          put("colspan:TABLE_ELEMENTS", TABLE_ELEMENTS);
          put("rowspan", TABLE_ELEMENTS);
          put("rowspan:TABLE_ELEMENTS", TABLE_ELEMENTS);
          put("headers", TABLE_ELEMENTS);
          put("headers:TABLE_ELEMENTS", TABLE_ELEMENTS);
          put("scope", TABLE_ELEMENTS);
          put("scope:TABLE_ELEMENTS", TABLE_ELEMENTS);
          put("span", TABLE_ELEMENTS);
          put("span:TABLE_ELEMENTS", TABLE_ELEMENTS);
          put("open", INTERACTIVE_ELEMENTS);
          put("open:INTERACTIVE_ELEMENTS", INTERACTIVE_ELEMENTS);
          put("charset", METADATA_ELEMENTS);
          put("charset:METADATA_ELEMENTS", METADATA_ELEMENTS);
          put("content", METADATA_ELEMENTS);
          put("content:METADATA_ELEMENTS", METADATA_ELEMENTS);
          put("http-equiv", METADATA_ELEMENTS);
          put("http-equiv:METADATA_ELEMENTS", METADATA_ELEMENTS);
          put("media", METADATA_ELEMENTS);
          put("media:METADATA_ELEMENTS", METADATA_ELEMENTS);
          put("itemid", UNIVERSAL);
          put("itemid:UNIVERSAL", UNIVERSAL);
          put("itemprop", UNIVERSAL);
          put("itemprop:UNIVERSAL", UNIVERSAL);
          put("itemref", UNIVERSAL);
          put("itemref:UNIVERSAL", UNIVERSAL);
          put("itemscope", UNIVERSAL);
          put("itemscope:UNIVERSAL", UNIVERSAL);
          put("itemtype", UNIVERSAL);
          put("itemtype:UNIVERSAL", UNIVERSAL);
          put("coords", SPECIFIC_ELEMENTS);
          put("coords:SPECIFIC_ELEMENTS", SPECIFIC_ELEMENTS);
          put("shape", SPECIFIC_ELEMENTS);
          put("shape:SPECIFIC_ELEMENTS", SPECIFIC_ELEMENTS);
          put("usemap", SPECIFIC_ELEMENTS);
          put("usemap:SPECIFIC_ELEMENTS", SPECIFIC_ELEMENTS);
          put("wrap", SPECIFIC_ELEMENTS);
          put("wrap:SPECIFIC_ELEMENTS", SPECIFIC_ELEMENTS);
          put("rows", SPECIFIC_ELEMENTS);
          put("rows:SPECIFIC_ELEMENTS", SPECIFIC_ELEMENTS);
          put("cols", SPECIFIC_ELEMENTS);
          put("cols:SPECIFIC_ELEMENTS", SPECIFIC_ELEMENTS);
          put("start", SPECIFIC_ELEMENTS);
          put("start:SPECIFIC_ELEMENTS", SPECIFIC_ELEMENTS);
          put("reversed", SPECIFIC_ELEMENTS);
          put("reversed:SPECIFIC_ELEMENTS", SPECIFIC_ELEMENTS);
          put("kind", SPECIFIC_ELEMENTS);
          put("kind:SPECIFIC_ELEMENTS", SPECIFIC_ELEMENTS);
          put("srclang", SPECIFIC_ELEMENTS);
          put("srclang:SPECIFIC_ELEMENTS", SPECIFIC_ELEMENTS);
          put("label", SPECIFIC_ELEMENTS);
          put("label:SPECIFIC_ELEMENTS", SPECIFIC_ELEMENTS);
          put("default", SPECIFIC_ELEMENTS);
          put("default:SPECIFIC_ELEMENTS", SPECIFIC_ELEMENTS);
          put("align", SPECIFIC_ELEMENTS);
          put("align:SPECIFIC_ELEMENTS", SPECIFIC_ELEMENTS);
          put("bgcolor", SPECIFIC_ELEMENTS);
          put("bgcolor:SPECIFIC_ELEMENTS", SPECIFIC_ELEMENTS);
          put("border", SPECIFIC_ELEMENTS);
          put("border:SPECIFIC_ELEMENTS", SPECIFIC_ELEMENTS);
          put("cellpadding", SPECIFIC_ELEMENTS);
          put("cellpadding:SPECIFIC_ELEMENTS", SPECIFIC_ELEMENTS);
          put("cellspacing", SPECIFIC_ELEMENTS);
          put("cellspacing:SPECIFIC_ELEMENTS", SPECIFIC_ELEMENTS);
          put("color", SPECIFIC_ELEMENTS);
          put("color:SPECIFIC_ELEMENTS", SPECIFIC_ELEMENTS);
          put("face", SPECIFIC_ELEMENTS);
          put("face:SPECIFIC_ELEMENTS", SPECIFIC_ELEMENTS);
          put("size", SPECIFIC_ELEMENTS);
          put("size:SPECIFIC_ELEMENTS", SPECIFIC_ELEMENTS);
      }};

  private A() {
    // Utility class;
  }

  static HtmlAttribute stringAttribute(String name, String value) {
    return new HtmlAttribute(name, value);
  }

  static ScopedHtmlAttribute scopedStringAttribute(String name, String value,
      AttributeScope scope) {
    return new ScopedHtmlAttribute(name, value, scope);
  }

  static BooleanAttribute booleanAttribute(String name, boolean present) {
    return new BooleanAttribute(name, present);
  }

  static EnumAttribute enumAttribute(String name, String value) {
    return new EnumAttribute(name, value);
  }

  static ScopedEnumAttribute scopedEnumAttribute(String name, String value, AttributeScope scope) {
    return new ScopedEnumAttribute(name, value, scope);
  }

  public static Set<AttributeCategory> getAttributeCategories(String attributeName) {
    return ATTRIBUTE_CATEGORIES.get(attributeName);
  }

  public static AttributeType getAttributeType(String attributeName) {
    return ATTRIBUTE_TYPES.get(attributeName);
  }

  public static AttributeScope getAttributeScope(String attributeName) {
    return ATTRIBUTE_SCOPES.get(attributeName);
  }

  public static Set<String> getEnumValues(String compositeKey) {
    return ENUM_VALUES.get(compositeKey);
  }

  public static HtmlAttribute accesskey(String value) {
    return stringAttribute("accesskey", value);
  }

  public static HtmlAttribute classAttr(String value) {
    return stringAttribute("class", value);
  }

  public static HtmlAttribute class_(String value) {
    return stringAttribute("class", value);
  }

  public static EnumAttribute contenteditableFalse() {
    return enumAttribute("contenteditable", "false");
  }

  public static EnumAttribute contenteditablePlaintextOnly() {
    return enumAttribute("contenteditable", "plaintext-only");
  }

  public static EnumAttribute contenteditableTrue() {
    return enumAttribute("contenteditable", "true");
  }

  public static EnumAttribute contenteditable() {
    return enumAttribute("contenteditable", "false");
  }

  public static EnumAttribute contenteditable(String value) {
    return enumAttribute("contenteditable", value);
  }

  public static EnumAttribute dirLtr() {
    return enumAttribute("dir", "ltr");
  }

  public static EnumAttribute dirRtl() {
    return enumAttribute("dir", "rtl");
  }

  public static EnumAttribute dirAuto() {
    return enumAttribute("dir", "auto");
  }

  public static EnumAttribute dir() {
    return enumAttribute("dir", "ltr");
  }

  public static EnumAttribute dir(String value) {
    return enumAttribute("dir", value);
  }

  public static BooleanAttribute draggable() {
    return booleanAttribute("draggable", true);
  }

  public static BooleanAttribute draggable(boolean value) {
    return booleanAttribute("draggable", value);
  }

  public static BooleanAttribute hidden() {
    return booleanAttribute("hidden", true);
  }

  public static BooleanAttribute hidden(boolean value) {
    return booleanAttribute("hidden", value);
  }

  public static HtmlAttribute id(String value) {
    return stringAttribute("id", value);
  }

  public static HtmlAttribute lang(String value) {
    return stringAttribute("lang", value);
  }

  public static BooleanAttribute spellcheck() {
    return booleanAttribute("spellcheck", true);
  }

  public static BooleanAttribute spellcheck(boolean value) {
    return booleanAttribute("spellcheck", value);
  }

  public static HtmlAttribute style(String value) {
    return stringAttribute("style", value);
  }

  public static HtmlAttribute tabindex(String value) {
    return stringAttribute("tabindex", value);
  }

  public static HtmlAttribute title(String value) {
    return stringAttribute("title", value);
  }

  public static EnumAttribute translateNo() {
    return enumAttribute("translate", "no");
  }

  public static EnumAttribute translateYes() {
    return enumAttribute("translate", "yes");
  }

  public static EnumAttribute translate() {
    return enumAttribute("translate", "no");
  }

  public static EnumAttribute translate(String value) {
    return enumAttribute("translate", value);
  }

  public static HtmlAttribute ariaLabel(String value) {
    return stringAttribute("aria-label", value);
  }

  public static HtmlAttribute ariaLabelledby(String value) {
    return stringAttribute("aria-labelledby", value);
  }

  public static HtmlAttribute ariaDescribedby(String value) {
    return stringAttribute("aria-describedby", value);
  }

  public static BooleanAttribute ariaHidden() {
    return booleanAttribute("aria-hidden", true);
  }

  public static BooleanAttribute ariaHidden(boolean value) {
    return booleanAttribute("aria-hidden", value);
  }

  public static EnumAttribute ariaExpandedFalse() {
    return enumAttribute("aria-expanded", "false");
  }

  public static EnumAttribute ariaExpandedUndefined() {
    return enumAttribute("aria-expanded", "undefined");
  }

  public static EnumAttribute ariaExpandedTrue() {
    return enumAttribute("aria-expanded", "true");
  }

  public static EnumAttribute ariaExpanded() {
    return enumAttribute("aria-expanded", "false");
  }

  public static EnumAttribute ariaExpanded(String value) {
    return enumAttribute("aria-expanded", value);
  }

  public static HtmlAttribute accept(String value) {
    return stringAttribute("accept", value);
  }

  public static HtmlAttribute acceptCharset(String value) {
    return stringAttribute("accept-charset", value);
  }

  public static HtmlAttribute action(String value) {
    return stringAttribute("action", value);
  }

  public static EnumAttribute autocompleteName() {
    return enumAttribute("autocomplete", "name");
  }

  public static EnumAttribute autocompleteEmail() {
    return enumAttribute("autocomplete", "email");
  }

  public static EnumAttribute autocompleteOff() {
    return enumAttribute("autocomplete", "off");
  }

  public static EnumAttribute autocompleteCurrentPassword() {
    return enumAttribute("autocomplete", "current-password");
  }

  public static EnumAttribute autocompleteOn() {
    return enumAttribute("autocomplete", "on");
  }

  public static EnumAttribute autocompleteUsername() {
    return enumAttribute("autocomplete", "username");
  }

  public static EnumAttribute autocompleteNewPassword() {
    return enumAttribute("autocomplete", "new-password");
  }

  public static EnumAttribute autocomplete() {
    return enumAttribute("autocomplete", "off");
  }

  public static EnumAttribute autocomplete(String value) {
    return enumAttribute("autocomplete", value);
  }

  public static BooleanAttribute autofocus() {
    return booleanAttribute("autofocus", true);
  }

  public static BooleanAttribute autofocus(boolean value) {
    return booleanAttribute("autofocus", value);
  }

  public static BooleanAttribute checked() {
    return booleanAttribute("checked", true);
  }

  public static BooleanAttribute checked(boolean value) {
    return booleanAttribute("checked", value);
  }

  public static BooleanAttribute disabled() {
    return booleanAttribute("disabled", true);
  }

  public static BooleanAttribute disabled(boolean value) {
    return booleanAttribute("disabled", value);
  }

  public static EnumAttribute enctypeApplicationXWwwFormUrlencoded() {
    return enumAttribute("enctype", "application/x-www-form-urlencoded");
  }

  public static EnumAttribute enctypeMultipartFormData() {
    return enumAttribute("enctype", "multipart/form-data");
  }

  public static EnumAttribute enctypeTextPlain() {
    return enumAttribute("enctype", "text/plain");
  }

  public static EnumAttribute enctype() {
    return enumAttribute("enctype", "application/x-www-form-urlencoded");
  }

  public static EnumAttribute enctype(String value) {
    return enumAttribute("enctype", value);
  }

  public static HtmlAttribute forAttr(String value) {
    return stringAttribute("for", value);
  }

  public static HtmlAttribute for_(String value) {
    return stringAttribute("for", value);
  }

  public static HtmlAttribute form(String value) {
    return stringAttribute("form", value);
  }

  public static HtmlAttribute formaction(String value) {
    return stringAttribute("formaction", value);
  }

  public static EnumAttribute formenctypeApplicationXWwwFormUrlencoded() {
    return enumAttribute("formenctype", "application/x-www-form-urlencoded");
  }

  public static EnumAttribute formenctypeMultipartFormData() {
    return enumAttribute("formenctype", "multipart/form-data");
  }

  public static EnumAttribute formenctypeTextPlain() {
    return enumAttribute("formenctype", "text/plain");
  }

  public static EnumAttribute formenctype() {
    return enumAttribute("formenctype", "application/x-www-form-urlencoded");
  }

  public static EnumAttribute formenctype(String value) {
    return enumAttribute("formenctype", value);
  }

  public static EnumAttribute formmethodPost() {
    return enumAttribute("formmethod", "post");
  }

  public static EnumAttribute formmethodGet() {
    return enumAttribute("formmethod", "get");
  }

  public static EnumAttribute formmethod() {
    return enumAttribute("formmethod", "post");
  }

  public static EnumAttribute formmethod(String value) {
    return enumAttribute("formmethod", value);
  }

  public static BooleanAttribute formnovalidate() {
    return booleanAttribute("formnovalidate", true);
  }

  public static BooleanAttribute formnovalidate(boolean value) {
    return booleanAttribute("formnovalidate", value);
  }

  public static HtmlAttribute formtarget(String value) {
    return stringAttribute("formtarget", value);
  }

  public static HtmlAttribute max(String value) {
    return stringAttribute("max", value);
  }

  public static HtmlAttribute maxlength(String value) {
    return stringAttribute("maxlength", value);
  }

  public static EnumAttribute methodPost() {
    return enumAttribute("method", "post");
  }

  public static EnumAttribute methodGet() {
    return enumAttribute("method", "get");
  }

  public static EnumAttribute method() {
    return enumAttribute("method", "get");
  }

  public static EnumAttribute method(String value) {
    return enumAttribute("method", value);
  }

  public static HtmlAttribute min(String value) {
    return stringAttribute("min", value);
  }

  public static HtmlAttribute minlength(String value) {
    return stringAttribute("minlength", value);
  }

  public static BooleanAttribute multiple() {
    return booleanAttribute("multiple", true);
  }

  public static BooleanAttribute multiple(boolean value) {
    return booleanAttribute("multiple", value);
  }

  public static HtmlAttribute name(String value) {
    return stringAttribute("name", value);
  }

  public static BooleanAttribute novalidate() {
    return booleanAttribute("novalidate", true);
  }

  public static BooleanAttribute novalidate(boolean value) {
    return booleanAttribute("novalidate", value);
  }

  public static HtmlAttribute pattern(String value) {
    return stringAttribute("pattern", value);
  }

  public static HtmlAttribute placeholder(String value) {
    return stringAttribute("placeholder", value);
  }

  public static BooleanAttribute readonly() {
    return booleanAttribute("readonly", true);
  }

  public static BooleanAttribute readonly(boolean value) {
    return booleanAttribute("readonly", value);
  }

  public static BooleanAttribute required() {
    return booleanAttribute("required", true);
  }

  public static BooleanAttribute required(boolean value) {
    return booleanAttribute("required", value);
  }

  public static BooleanAttribute selected() {
    return booleanAttribute("selected", true);
  }

  public static BooleanAttribute selected(boolean value) {
    return booleanAttribute("selected", value);
  }

  public static HtmlAttribute size(String value) {
    return stringAttribute("size", value);
  }

  public static HtmlAttribute step(String value) {
    return stringAttribute("step", value);
  }

  public static EnumAttribute targetParent() {
    return enumAttribute("target", "_parent");
  }

  public static EnumAttribute targetSelf() {
    return enumAttribute("target", "_self");
  }

  public static EnumAttribute targetBlank() {
    return enumAttribute("target", "_blank");
  }

  public static EnumAttribute targetTop() {
    return enumAttribute("target", "_top");
  }

  public static EnumAttribute target() {
    return enumAttribute("target", "_self");
  }

  public static EnumAttribute target(String value) {
    return enumAttribute("target", value);
  }

  public static EnumAttribute typeText() {
    return enumAttribute("type", "text");
  }

  public static EnumAttribute typeDatetimeLocal() {
    return enumAttribute("type", "datetime-local");
  }

  public static EnumAttribute typeCheckbox() {
    return enumAttribute("type", "checkbox");
  }

  public static EnumAttribute typeSearch() {
    return enumAttribute("type", "search");
  }

  public static EnumAttribute typePassword() {
    return enumAttribute("type", "password");
  }

  public static EnumAttribute typeUrl() {
    return enumAttribute("type", "url");
  }

  public static EnumAttribute typeTel() {
    return enumAttribute("type", "tel");
  }

  public static EnumAttribute typeRadio() {
    return enumAttribute("type", "radio");
  }

  public static EnumAttribute typeSubmit() {
    return enumAttribute("type", "submit");
  }

  public static EnumAttribute typeNumber() {
    return enumAttribute("type", "number");
  }

  public static EnumAttribute typeTime() {
    return enumAttribute("type", "time");
  }

  public static EnumAttribute typeReset() {
    return enumAttribute("type", "reset");
  }

  public static EnumAttribute typeDate() {
    return enumAttribute("type", "date");
  }

  public static EnumAttribute typeColor() {
    return enumAttribute("type", "color");
  }

  public static EnumAttribute typeMonth() {
    return enumAttribute("type", "month");
  }

  public static EnumAttribute typeButton() {
    return enumAttribute("type", "button");
  }

  public static EnumAttribute typeWeek() {
    return enumAttribute("type", "week");
  }

  public static EnumAttribute typeFile() {
    return enumAttribute("type", "file");
  }

  public static EnumAttribute typeHidden() {
    return enumAttribute("type", "hidden");
  }

  public static EnumAttribute typeImage() {
    return enumAttribute("type", "image");
  }

  public static EnumAttribute typeEmail() {
    return enumAttribute("type", "email");
  }

  public static EnumAttribute typeRange() {
    return enumAttribute("type", "range");
  }

  public static ScopedEnumAttribute typeForm(String value) {
    return scopedEnumAttribute("type", value, FORM_ELEMENTS);
  }

  public static HtmlAttribute value(String value) {
    return stringAttribute("value", value);
  }

  public static HtmlAttribute alt(String value) {
    return stringAttribute("alt", value);
  }

  public static BooleanAttribute autoplay() {
    return booleanAttribute("autoplay", true);
  }

  public static BooleanAttribute autoplay(boolean value) {
    return booleanAttribute("autoplay", value);
  }

  public static BooleanAttribute controls() {
    return booleanAttribute("controls", true);
  }

  public static BooleanAttribute controls(boolean value) {
    return booleanAttribute("controls", value);
  }

  public static EnumAttribute crossoriginUseCredentials() {
    return enumAttribute("crossorigin", "use-credentials");
  }

  public static EnumAttribute crossoriginAnonymous() {
    return enumAttribute("crossorigin", "anonymous");
  }

  public static EnumAttribute crossorigin() {
    return enumAttribute("crossorigin", "anonymous");
  }

  public static EnumAttribute crossorigin(String value) {
    return enumAttribute("crossorigin", value);
  }

  public static HtmlAttribute height(String value) {
    return stringAttribute("height", value);
  }

  public static BooleanAttribute loop() {
    return booleanAttribute("loop", true);
  }

  public static BooleanAttribute loop(boolean value) {
    return booleanAttribute("loop", value);
  }

  public static BooleanAttribute muted() {
    return booleanAttribute("muted", true);
  }

  public static BooleanAttribute muted(boolean value) {
    return booleanAttribute("muted", value);
  }

  public static EnumAttribute preloadNone() {
    return enumAttribute("preload", "none");
  }

  public static EnumAttribute preloadAuto() {
    return enumAttribute("preload", "auto");
  }

  public static EnumAttribute preloadMetadata() {
    return enumAttribute("preload", "metadata");
  }

  public static EnumAttribute preload() {
    return enumAttribute("preload", "metadata");
  }

  public static EnumAttribute preload(String value) {
    return enumAttribute("preload", value);
  }

  public static HtmlAttribute poster(String value) {
    return stringAttribute("poster", value);
  }

  public static HtmlAttribute src(String value) {
    return stringAttribute("src", value);
  }

  public static HtmlAttribute srcset(String value) {
    return stringAttribute("srcset", value);
  }

  public static HtmlAttribute width(String value) {
    return stringAttribute("width", value);
  }

  public static HtmlAttribute download(String value) {
    return stringAttribute("download", value);
  }

  public static HtmlAttribute href(String value) {
    return stringAttribute("href", value);
  }

  public static HtmlAttribute hreflang(String value) {
    return stringAttribute("hreflang", value);
  }

  public static HtmlAttribute ping(String value) {
    return stringAttribute("ping", value);
  }

  public static EnumAttribute referrerpolicyStrictOriginWhenCrossOrigin() {
    return enumAttribute("referrerpolicy", "strict-origin-when-cross-origin");
  }

  public static EnumAttribute referrerpolicyNoReferrerWhenDowngrade() {
    return enumAttribute("referrerpolicy", "no-referrer-when-downgrade");
  }

  public static EnumAttribute referrerpolicyOrigin() {
    return enumAttribute("referrerpolicy", "origin");
  }

  public static EnumAttribute referrerpolicyUnsafeUrl() {
    return enumAttribute("referrerpolicy", "unsafe-url");
  }

  public static EnumAttribute referrerpolicyStrictOrigin() {
    return enumAttribute("referrerpolicy", "strict-origin");
  }

  public static EnumAttribute referrerpolicyNoReferrer() {
    return enumAttribute("referrerpolicy", "no-referrer");
  }

  public static EnumAttribute referrerpolicySameOrigin() {
    return enumAttribute("referrerpolicy", "same-origin");
  }

  public static EnumAttribute referrerpolicyOriginWhenCrossOrigin() {
    return enumAttribute("referrerpolicy", "origin-when-cross-origin");
  }

  public static EnumAttribute referrerpolicy() {
    return enumAttribute("referrerpolicy", "strict-origin-when-cross-origin");
  }

  public static EnumAttribute referrerpolicy(String value) {
    return enumAttribute("referrerpolicy", value);
  }

  public static EnumAttribute relOpener() {
    return enumAttribute("rel", "opener");
  }

  public static EnumAttribute relPrefetch() {
    return enumAttribute("rel", "prefetch");
  }

  public static EnumAttribute relTag() {
    return enumAttribute("rel", "tag");
  }

  public static EnumAttribute relExternal() {
    return enumAttribute("rel", "external");
  }

  public static EnumAttribute relCanonical() {
    return enumAttribute("rel", "canonical");
  }

  public static EnumAttribute relPreconnect() {
    return enumAttribute("rel", "preconnect");
  }

  public static EnumAttribute relNoopener() {
    return enumAttribute("rel", "noopener");
  }

  public static EnumAttribute relPrerender() {
    return enumAttribute("rel", "prerender");
  }

  public static EnumAttribute relDnsPrefetch() {
    return enumAttribute("rel", "dns-prefetch");
  }

  public static EnumAttribute relManifest() {
    return enumAttribute("rel", "manifest");
  }

  public static EnumAttribute relPreload() {
    return enumAttribute("rel", "preload");
  }

  public static EnumAttribute relStylesheet() {
    return enumAttribute("rel", "stylesheet");
  }

  public static EnumAttribute relIcon() {
    return enumAttribute("rel", "icon");
  }

  public static EnumAttribute relAuthor() {
    return enumAttribute("rel", "author");
  }

  public static EnumAttribute relBookmark() {
    return enumAttribute("rel", "bookmark");
  }

  public static EnumAttribute relNofollow() {
    return enumAttribute("rel", "nofollow");
  }

  public static EnumAttribute relAlternate() {
    return enumAttribute("rel", "alternate");
  }

  public static EnumAttribute relLicense() {
    return enumAttribute("rel", "license");
  }

  public static EnumAttribute relNext() {
    return enumAttribute("rel", "next");
  }

  public static EnumAttribute relHelp() {
    return enumAttribute("rel", "help");
  }

  public static EnumAttribute relPrev() {
    return enumAttribute("rel", "prev");
  }

  public static EnumAttribute relSearch() {
    return enumAttribute("rel", "search");
  }

  public static EnumAttribute relNoreferrer() {
    return enumAttribute("rel", "noreferrer");
  }

  public static EnumAttribute rel() {
    return enumAttribute("rel", "opener");
  }

  public static EnumAttribute rel(String value) {
    return enumAttribute("rel", value);
  }

  public static HtmlAttribute sizes(String value) {
    return stringAttribute("sizes", value);
  }

  public static EnumAttribute typeApplicationRssXml() {
    return enumAttribute("type", "application/rss+xml");
  }

  public static EnumAttribute typeTextCss() {
    return enumAttribute("type", "text/css");
  }

  public static EnumAttribute typeImageXIcon() {
    return enumAttribute("type", "image/x-icon");
  }

  public static EnumAttribute typeTextJavascript() {
    return enumAttribute("type", "text/javascript");
  }

  public static ScopedEnumAttribute typeLink(String value) {
    return scopedEnumAttribute("type", value, LINK_ELEMENTS);
  }

  public static HtmlAttribute colspan(String value) {
    return stringAttribute("colspan", value);
  }

  public static HtmlAttribute rowspan(String value) {
    return stringAttribute("rowspan", value);
  }

  public static HtmlAttribute headers(String value) {
    return stringAttribute("headers", value);
  }

  public static EnumAttribute scopeCol() {
    return enumAttribute("scope", "col");
  }

  public static EnumAttribute scopeRow() {
    return enumAttribute("scope", "row");
  }

  public static EnumAttribute scopeRowgroup() {
    return enumAttribute("scope", "rowgroup");
  }

  public static EnumAttribute scopeColgroup() {
    return enumAttribute("scope", "colgroup");
  }

  public static EnumAttribute scope() {
    return enumAttribute("scope", "col");
  }

  public static EnumAttribute scope(String value) {
    return enumAttribute("scope", value);
  }

  public static HtmlAttribute span(String value) {
    return stringAttribute("span", value);
  }

  public static BooleanAttribute open() {
    return booleanAttribute("open", true);
  }

  public static BooleanAttribute open(boolean value) {
    return booleanAttribute("open", value);
  }

  public static HtmlAttribute charset(String value) {
    return stringAttribute("charset", value);
  }

  public static HtmlAttribute content(String value) {
    return stringAttribute("content", value);
  }

  public static HtmlAttribute httpEquiv(String value) {
    return stringAttribute("http-equiv", value);
  }

  public static HtmlAttribute media(String value) {
    return stringAttribute("media", value);
  }

  public static HtmlAttribute itemid(String value) {
    return stringAttribute("itemid", value);
  }

  public static HtmlAttribute itemprop(String value) {
    return stringAttribute("itemprop", value);
  }

  public static HtmlAttribute itemref(String value) {
    return stringAttribute("itemref", value);
  }

  public static BooleanAttribute itemscope() {
    return booleanAttribute("itemscope", true);
  }

  public static BooleanAttribute itemscope(boolean value) {
    return booleanAttribute("itemscope", value);
  }

  public static HtmlAttribute itemtype(String value) {
    return stringAttribute("itemtype", value);
  }

  public static HtmlAttribute coords(String value) {
    return stringAttribute("coords", value);
  }

  public static EnumAttribute shapeCircle() {
    return enumAttribute("shape", "circle");
  }

  public static EnumAttribute shapeDefault() {
    return enumAttribute("shape", "default");
  }

  public static EnumAttribute shapeRect() {
    return enumAttribute("shape", "rect");
  }

  public static EnumAttribute shapePoly() {
    return enumAttribute("shape", "poly");
  }

  public static EnumAttribute shape() {
    return enumAttribute("shape", "circle");
  }

  public static EnumAttribute shape(String value) {
    return enumAttribute("shape", value);
  }

  public static HtmlAttribute usemap(String value) {
    return stringAttribute("usemap", value);
  }

  public static EnumAttribute wrapHard() {
    return enumAttribute("wrap", "hard");
  }

  public static EnumAttribute wrapSoft() {
    return enumAttribute("wrap", "soft");
  }

  public static EnumAttribute wrap() {
    return enumAttribute("wrap", "hard");
  }

  public static EnumAttribute wrap(String value) {
    return enumAttribute("wrap", value);
  }

  public static HtmlAttribute rows(String value) {
    return stringAttribute("rows", value);
  }

  public static HtmlAttribute cols(String value) {
    return stringAttribute("cols", value);
  }

  public static HtmlAttribute start(String value) {
    return stringAttribute("start", value);
  }

  public static BooleanAttribute reversed() {
    return booleanAttribute("reversed", true);
  }

  public static BooleanAttribute reversed(boolean value) {
    return booleanAttribute("reversed", value);
  }

  public static EnumAttribute kindChapters() {
    return enumAttribute("kind", "chapters");
  }

  public static EnumAttribute kindMetadata() {
    return enumAttribute("kind", "metadata");
  }

  public static EnumAttribute kindCaptions() {
    return enumAttribute("kind", "captions");
  }

  public static EnumAttribute kindDescriptions() {
    return enumAttribute("kind", "descriptions");
  }

  public static EnumAttribute kindSubtitles() {
    return enumAttribute("kind", "subtitles");
  }

  public static EnumAttribute kind() {
    return enumAttribute("kind", "chapters");
  }

  public static EnumAttribute kind(String value) {
    return enumAttribute("kind", value);
  }

  public static HtmlAttribute srclang(String value) {
    return stringAttribute("srclang", value);
  }

  public static HtmlAttribute label(String value) {
    return stringAttribute("label", value);
  }

  public static BooleanAttribute defaultAttr() {
    return booleanAttribute("default", true);
  }

  public static BooleanAttribute defaultAttr(boolean value) {
    return booleanAttribute("default", value);
  }

  public static HtmlAttribute align(String value) {
    return stringAttribute("align", value);
  }

  public static HtmlAttribute bgcolor(String value) {
    return stringAttribute("bgcolor", value);
  }

  public static HtmlAttribute border(String value) {
    return stringAttribute("border", value);
  }

  public static HtmlAttribute cellpadding(String value) {
    return stringAttribute("cellpadding", value);
  }

  public static HtmlAttribute cellspacing(String value) {
    return stringAttribute("cellspacing", value);
  }

  public static HtmlAttribute color(String value) {
    return stringAttribute("color", value);
  }

  public static HtmlAttribute face(String value) {
    return stringAttribute("face", value);
  }

  public static HtmlAttribute data(String name, String value) {
    return stringAttribute("data-" + name, value);
  }

  public static HtmlAttribute event(String eventName, String handler) {
    return stringAttribute("on" + eventName, handler);
  }
  
  public static HtmlAttribute xmlns(String value){
      return stringAttribute("xmlns", value);
  }
}
