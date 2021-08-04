package org.scalajs.dom

/**
 * Short aliases of all the dom.CSSThing classes
 */
object css {
  type FontFaceRule = CSSFontFaceRule
  type ImportRule = CSSImportRule
  type KeyframeRule = CSSKeyframeRule
  type MediaRule = CSSMediaRule
  type NamespaceRule = CSSNamespaceRule
  type PageRule = CSSPageRule
  type Rule = CSSRule
  @inline def Rule = CSSRule
  type RuleList = CSSRuleList
  type StyleDeclaration = CSSStyleDeclaration
  type StyleSheet = CSSStyleSheet
  type StyleRule = CSSStyleRule
}
