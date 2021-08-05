package org.scalajs.dom

import org.scalajs.dom

package object ext {
  @deprecated("use dom.AjaxException instead", "2.0.0")
  type AjaxException = dom.AjaxException

  @deprecated("use dom.AjaxException instead", "2.0.0")
  val AjaxException: dom.AjaxException.type = dom.AjaxException

  @deprecated("use dom.Ajax instead", "2.0.0")
  val Ajax: dom.Ajax.type = dom.Ajax

  @deprecated("use dom.KeyValue instead", "2.0.0")
  val KeyValue: dom.KeyValue.type = dom.KeyValue

  @deprecated("use dom.KeyCode instead", "2.0.0")
  val KeyCode: dom.KeyCode.type = dom.KeyCode

  @deprecated("use dom.KeyLocation instead", "2.0.0")
  val KeyLocation: dom.KeyLocation.type = dom.KeyLocation
}
