package luvml;

import static luvml.AttributeCategory.*;
import static luvml.AttributeScope.*;
import static luvml.AttributeType.*;

import java.lang.CharSequence;
import java.lang.String;

public final class A {
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

  public static HtmlAttribute accesskey(String value) {
    return stringAttribute("accesskey", value);
  }

  public static HtmlAttribute classAttr(String value) {
    return stringAttribute("class", value);
  }

  public static HtmlAttribute class_(String value) {
    return stringAttribute("class", value);
  }

  public static EnumAttribute contenteditablePlaintextOnly() {
    return enumAttribute("contenteditable", "plaintext-only");
  }

  public static EnumAttribute contenteditableTrue() {
    return enumAttribute("contenteditable", "true");
  }

  public static EnumAttribute contenteditableFalse() {
    return enumAttribute("contenteditable", "false");
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

  public static EnumAttribute ariaExpandedUndefined() {
    return enumAttribute("aria-expanded", "undefined");
  }

  public static EnumAttribute ariaExpandedTrue() {
    return enumAttribute("aria-expanded", "true");
  }

  public static EnumAttribute ariaExpandedFalse() {
    return enumAttribute("aria-expanded", "false");
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

  public static EnumAttribute autocompleteName() {
    return enumAttribute("autocomplete", "name");
  }

  public static EnumAttribute autocompleteEmail() {
    return enumAttribute("autocomplete", "email");
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

  public static EnumAttribute enctypeTextPlain() {
    return enumAttribute("enctype", "text/plain");
  }

  public static EnumAttribute enctypeApplicationXWwwFormUrlencoded() {
    return enumAttribute("enctype", "application/x-www-form-urlencoded");
  }

  public static EnumAttribute enctypeMultipartFormData() {
    return enumAttribute("enctype", "multipart/form-data");
  }

  public static EnumAttribute enctype() {
    return enumAttribute("enctype", "text/plain");
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

  public static EnumAttribute formenctypeTextPlain() {
    return enumAttribute("formenctype", "text/plain");
  }

  public static EnumAttribute formenctypeApplicationXWwwFormUrlencoded() {
    return enumAttribute("formenctype", "application/x-www-form-urlencoded");
  }

  public static EnumAttribute formenctypeMultipartFormData() {
    return enumAttribute("formenctype", "multipart/form-data");
  }

  public static EnumAttribute formenctype() {
    return enumAttribute("formenctype", "text/plain");
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

  public static EnumAttribute targetSelf() {
    return enumAttribute("target", "_self");
  }

  public static EnumAttribute targetBlank() {
    return enumAttribute("target", "_blank");
  }

  public static EnumAttribute targetTop() {
    return enumAttribute("target", "_top");
  }

  public static EnumAttribute targetParent() {
    return enumAttribute("target", "_parent");
  }

  public static EnumAttribute target() {
    return enumAttribute("target", "_self");
  }

  public static EnumAttribute target(String value) {
    return enumAttribute("target", value);
  }

  public static EnumAttribute typeTextJavascript() {
    return enumAttribute("type", "text/javascript");
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

  public static ScopedEnumAttribute typeLink(String value) {
    return scopedEnumAttribute("type", value, LINK_ELEMENTS);
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

  public static EnumAttribute preloadAuto() {
    return enumAttribute("preload", "auto");
  }

  public static EnumAttribute preloadMetadata() {
    return enumAttribute("preload", "metadata");
  }

  public static EnumAttribute preloadNone() {
    return enumAttribute("preload", "none");
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

  public static EnumAttribute referrerpolicyStrictOriginWhenCrossOrigin() {
    return enumAttribute("referrerpolicy", "strict-origin-when-cross-origin");
  }

  public static EnumAttribute referrerpolicyNoReferrerWhenDowngrade() {
    return enumAttribute("referrerpolicy", "no-referrer-when-downgrade");
  }

  public static EnumAttribute referrerpolicy() {
    return enumAttribute("referrerpolicy", "origin");
  }

  public static EnumAttribute referrerpolicy(String value) {
    return enumAttribute("referrerpolicy", value);
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

  public static EnumAttribute rel() {
    return enumAttribute("rel", "canonical");
  }

  public static EnumAttribute rel(String value) {
    return enumAttribute("rel", value);
  }

  public static HtmlAttribute sizes(String value) {
    return stringAttribute("sizes", value);
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

  public static EnumAttribute scopeRowgroup() {
    return enumAttribute("scope", "rowgroup");
  }

  public static EnumAttribute scopeColgroup() {
    return enumAttribute("scope", "colgroup");
  }

  public static EnumAttribute scopeCol() {
    return enumAttribute("scope", "col");
  }

  public static EnumAttribute scopeRow() {
    return enumAttribute("scope", "row");
  }

  public static EnumAttribute scope() {
    return enumAttribute("scope", "rowgroup");
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

  public static EnumAttribute shapeRect() {
    return enumAttribute("shape", "rect");
  }

  public static EnumAttribute shapePoly() {
    return enumAttribute("shape", "poly");
  }

  public static EnumAttribute shapeCircle() {
    return enumAttribute("shape", "circle");
  }

  public static EnumAttribute shapeDefault() {
    return enumAttribute("shape", "default");
  }

  public static EnumAttribute shape() {
    return enumAttribute("shape", "rect");
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

  public static EnumAttribute kindChapters() {
    return enumAttribute("kind", "chapters");
  }

  public static EnumAttribute kind() {
    return enumAttribute("kind", "metadata");
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

  public static HtmlAttribute class_(CharSequence... classNames) {
    return C.class_(classNames);
  }

  public static HtmlAttribute classAttr(CharSequence... classNames) {
    return C.classAttr(classNames);
  }

  public static HtmlAttribute style(CharSequence... cssDeclarations) {
    return C.styleAttr(cssDeclarations);
  }

  public static HtmlAttribute styleAttr(CharSequence... cssDeclarations) {
    return C.styleAttr(cssDeclarations);
  }

  public static HtmlAttribute data(String name, String value) {
    return stringAttribute("data-" + name, value);
  }

  public static HtmlAttribute event(String eventName, String handler) {
    return stringAttribute("on" + eventName, handler);
  }

  public static HtmlAttribute xmlns(String value) {
    return stringAttribute("xmlns", value);
  }
}
