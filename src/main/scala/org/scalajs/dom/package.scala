package org.scalajs

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation._
import scala.scalajs.js.typedarray.ArrayBuffer

package object dom {

  /**
   * The Transferable interface represents an object that can be transfered
   * between different execution contexts, like the main thread and Web workers.
   *
   * This is an abstract interface and there isn't any object of this type.
   * It also doesn't define any method or property:
   * it is merely a tag indicating objects that can be used in specific
   * conditions, like to be transfered to a Worker using the
   * Worker.postMessage() method.
   *
   * MDN
   */
  type Transferable = ArrayBuffer | MessagePort

  @js.native
  @JSGlobal("window")
  val window: Window = js.native

  @js.native
  @JSGlobal("document")
  val document: html.Document = js.native

  @js.native
  @JSGlobal("console")
  val console: Console = js.native

  @deprecated("use DOMRect instead", "2.0.0")
  type ClientRect = DOMRect

  @deprecated("use DOMRectList instead", "2.0.0")
  type ClientRectList = DOMRectList

  @deprecated("use NodeList[T] instead", "2.0.0")
  type NodeListOf[+T <: Node] = NodeList[T]
}
