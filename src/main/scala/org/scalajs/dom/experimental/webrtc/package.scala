package org.scalajs.dom.experimental

import org.scalajs.dom.experimental.mediastream._
import org.scalajs.dom.DOMException

import scala.scalajs.js
import scala.language.implicitConversions

package object webrtc {
  implicit def toWebRTC(n: org.scalajs.dom.Navigator): NavigatorMediaStream =
    n.asInstanceOf[NavigatorMediaStream]

  @js.native
  trait NavigatorMediaStream extends js.Object {

    /**
     * The Navigator.mediaDevices read-only property returns a MediaDevices object, which provides access to connected
     * media input devices like cameras and microphones, as well as screen sharing.
     *
     * MDN
     *
     * @see [[https://developer.mozilla.org/en-US/docs/Web/API/Navigator/mediaDevices]]
     */
    def mediaDevices: MediaDevices = js.native
  }
}
