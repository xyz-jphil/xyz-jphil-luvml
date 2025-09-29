package luvml;

import static luvml.ContentCategory.*;
import static luvml.Context.*;
import static luvml.DisplayType.*;
import static luvml.ElementType.*;

import java.lang.Iterable;
import java.lang.String;
import java.util.ArrayList;
import java.util.Collection;
import luvml.element.BlockContainerElement;
import luvml.element.BlockVoidElement;
import luvml.element.InlineContainerElement;
import luvml.element.InlineVoidElement;
import luvx.Attr_I;
import luvx.Frag_I;

public final class E {
  private E() {
    // Utility class;
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

  public static InlineContainerElement audio(Frag_I<?>... fragments) {
    return inlineContainer("audio", fragments);
  }

  public static InlineContainerElement audio(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("audio", fragments);
  }

  public static InlineContainerElement audio(String... textContent) {
    return inlineContainer("audio", textContent);
  }

  public static InlineContainerElement audio() {
    return inlineContainer("audio");
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

  public static InlineContainerElement canvas(Frag_I<?>... fragments) {
    return inlineContainer("canvas", fragments);
  }

  public static InlineContainerElement canvas(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("canvas", fragments);
  }

  public static InlineContainerElement canvas(String... textContent) {
    return inlineContainer("canvas", textContent);
  }

  public static InlineContainerElement canvas() {
    return inlineContainer("canvas");
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

  public static BlockVoidElement col(Attr_I<?>... attributes) {
    return blockVoidElement("col", attributes);
  }

  public static BlockVoidElement col() {
    return blockVoidElement("col");
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

  public static InlineContainerElement datalist(Frag_I<?>... fragments) {
    return inlineContainer("datalist", fragments);
  }

  public static InlineContainerElement datalist(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("datalist", fragments);
  }

  public static InlineContainerElement datalist(String... textContent) {
    return inlineContainer("datalist", textContent);
  }

  public static InlineContainerElement datalist() {
    return inlineContainer("datalist");
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

  public static InlineContainerElement iframe(Frag_I<?>... fragments) {
    return inlineContainer("iframe", fragments);
  }

  public static InlineContainerElement iframe(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("iframe", fragments);
  }

  public static InlineContainerElement iframe(String... textContent) {
    return inlineContainer("iframe", textContent);
  }

  public static InlineContainerElement iframe() {
    return inlineContainer("iframe");
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

  public static InlineVoidElement link(Attr_I<?>... attributes) {
    return inlineVoidElement("link", attributes);
  }

  public static InlineVoidElement link() {
    return inlineVoidElement("link");
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

  public static InlineContainerElement map(Frag_I<?>... fragments) {
    return inlineContainer("map", fragments);
  }

  public static InlineContainerElement map(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("map", fragments);
  }

  public static InlineContainerElement map(String... textContent) {
    return inlineContainer("map", textContent);
  }

  public static InlineContainerElement map() {
    return inlineContainer("map");
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

  public static InlineContainerElement math(Frag_I<?>... fragments) {
    return inlineContainer("math", fragments);
  }

  public static InlineContainerElement math(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("math", fragments);
  }

  public static InlineContainerElement math(String... textContent) {
    return inlineContainer("math", textContent);
  }

  public static InlineContainerElement math() {
    return inlineContainer("math");
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

  public static InlineContainerElement object(Frag_I<?>... fragments) {
    return inlineContainer("object", fragments);
  }

  public static InlineContainerElement object(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("object", fragments);
  }

  public static InlineContainerElement object(String... textContent) {
    return inlineContainer("object", textContent);
  }

  public static InlineContainerElement object() {
    return inlineContainer("object");
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

  public static InlineContainerElement picture(Frag_I<?>... fragments) {
    return inlineContainer("picture", fragments);
  }

  public static InlineContainerElement picture(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("picture", fragments);
  }

  public static InlineContainerElement picture(String... textContent) {
    return inlineContainer("picture", textContent);
  }

  public static InlineContainerElement picture() {
    return inlineContainer("picture");
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

  public static InlineContainerElement script(Frag_I<?>... fragments) {
    return inlineContainer("script", fragments);
  }

  public static InlineContainerElement script(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("script", fragments);
  }

  public static InlineContainerElement script(String... textContent) {
    return inlineContainer("script", textContent);
  }

  public static InlineContainerElement script() {
    return inlineContainer("script");
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

  public static InlineContainerElement select(Frag_I<?>... fragments) {
    return inlineContainer("select", fragments);
  }

  public static InlineContainerElement select(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("select", fragments);
  }

  public static InlineContainerElement select(String... textContent) {
    return inlineContainer("select", textContent);
  }

  public static InlineContainerElement select() {
    return inlineContainer("select");
  }

  public static InlineContainerElement slot(Frag_I<?>... fragments) {
    return inlineContainer("slot", fragments);
  }

  public static InlineContainerElement slot(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("slot", fragments);
  }

  public static InlineContainerElement slot(String... textContent) {
    return inlineContainer("slot", textContent);
  }

  public static InlineContainerElement slot() {
    return inlineContainer("slot");
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

  public static BlockVoidElement source(Attr_I<?>... attributes) {
    return blockVoidElement("source", attributes);
  }

  public static BlockVoidElement source() {
    return blockVoidElement("source");
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

  public static InlineContainerElement svg(Frag_I<?>... fragments) {
    return inlineContainer("svg", fragments);
  }

  public static InlineContainerElement svg(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("svg", fragments);
  }

  public static InlineContainerElement svg(String... textContent) {
    return inlineContainer("svg", textContent);
  }

  public static InlineContainerElement svg() {
    return inlineContainer("svg");
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

  public static InlineContainerElement template(Frag_I<?>... fragments) {
    return inlineContainer("template", fragments);
  }

  public static InlineContainerElement template(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("template", fragments);
  }

  public static InlineContainerElement template(String... textContent) {
    return inlineContainer("template", textContent);
  }

  public static InlineContainerElement template() {
    return inlineContainer("template");
  }

  public static InlineContainerElement textarea(Frag_I<?>... fragments) {
    return inlineContainer("textarea", fragments);
  }

  public static InlineContainerElement textarea(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("textarea", fragments);
  }

  public static InlineContainerElement textarea(String... textContent) {
    return inlineContainer("textarea", textContent);
  }

  public static InlineContainerElement textarea() {
    return inlineContainer("textarea");
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

  public static BlockVoidElement track(Attr_I<?>... attributes) {
    return blockVoidElement("track", attributes);
  }

  public static BlockVoidElement track() {
    return blockVoidElement("track");
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

  public static InlineContainerElement video(Frag_I<?>... fragments) {
    return inlineContainer("video", fragments);
  }

  public static InlineContainerElement video(Iterable<Frag_I<?>> fragments) {
    return inlineContainer("video", fragments);
  }

  public static InlineContainerElement video(String... textContent) {
    return inlineContainer("video", textContent);
  }

  public static InlineContainerElement video() {
    return inlineContainer("video");
  }

  public static InlineVoidElement wbr(Attr_I<?>... attributes) {
    return inlineVoidElement("wbr", attributes);
  }

  public static InlineVoidElement wbr() {
    return inlineVoidElement("wbr");
  }
}
