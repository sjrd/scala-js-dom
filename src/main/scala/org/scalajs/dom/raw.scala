/**
 * Documentation marked "MDN" is thanks to Mozilla Contributors
 * at https://developer.mozilla.org/en-US/docs/Web/API and available
 * under the Creative Commons Attribution-ShareAlike v2.5 or later.
 * http://creativecommons.org/licenses/by-sa/2.5/
 *
 * Everything else is under the MIT License
 * http://opensource.org/licenses/MIT
 */
package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

import org.scalajs.dom

@deprecated("All the members of raw.* have been moved to dom.*", "2.0.0")
object raw {

  type AbstractWorker = dom.AbstractWorker
  type AnalyserNode = dom.AnalyserNode
  type AnimationEvent = dom.AnimationEvent
  type ApplicationCache = dom.ApplicationCache
  lazy val ApplicationCache: dom.ApplicationCache.type = dom.ApplicationCache
  type Attr = dom.Attr
  type AudioBuffer = dom.AudioBuffer
  type AudioBufferSourceNode = dom.AudioBufferSourceNode
  type AudioContext = dom.AudioContext
  type AudioDestinationNode = dom.AudioDestinationNode
  type AudioListener = dom.AudioListener
  type AudioNode = dom.AudioNode
  type AudioParam = dom.AudioParam
  type AudioTrack = dom.AudioTrack
  type AudioTrackList = dom.AudioTrackList

  type BeforeUnloadEvent = dom.BeforeUnloadEvent
  type BiquadFilterNode = dom.BiquadFilterNode
  type Blob = dom.Blob
  lazy val Blob: dom.Blob.type = dom.Blob
  lazy val BlobPropertyBag: dom.BlobPropertyBag.type = dom.BlobPropertyBag
  type BlobPropertyBag = dom.BlobPropertyBag

  type CanvasGradient = dom.CanvasGradient
  type CanvasPattern = dom.CanvasPattern
  type CanvasRenderingContext2D = dom.CanvasRenderingContext2D
  type CDATASection = dom.CDATASection
  type ChannelMergerNode = dom.ChannelMergerNode
  type ChannelSplitterNode = dom.ChannelSplitterNode
  type CharacterData = dom.CharacterData
  type ClientRect = dom.ClientRect
  type ClientRectList = dom.ClientRectList
  type ClipboardEvent = dom.ClipboardEvent
  type ClipboardEventInit = dom.ClipboardEventInit
  type CloseEvent = dom.CloseEvent
  type CompositionEvent = dom.CompositionEvent
  type Comment = dom.Comment
  type Coordinates = dom.Coordinates
  type Console = dom.Console
  type ConvolverNode = dom.ConvolverNode
  type CSSFontFaceRule = dom.CSSFontFaceRule
  type CSSImportRule = dom.CSSImportRule
  type CSSKeyframeRule = dom.CSSKeyframeRule
  type CSSMediaRule = dom.CSSMediaRule
  type CSSNamespaceRule = dom.CSSNamespaceRule
  type CSSPageRule = dom.CSSPageRule
  type CSSRule = dom.CSSRule
  @inline def CSSRule = dom.CSSRule
  type CSSRuleList = dom.CSSRuleList
  type CSSStyleDeclaration = dom.CSSStyleDeclaration
  type CSSStyleSheet = dom.CSSStyleSheet
  type CSSStyleRule = dom.CSSStyleRule
  type CustomEvent = dom.CustomEvent

  type DataTransfer = dom.DataTransfer
  type DedicatedWorkerGlobalScope = dom.DedicatedWorkerGlobalScope
  type DelayNode = dom.DelayNode
  type DocumentType = dom.DocumentType
  type DocumentEvent = dom.DocumentEvent
  type Document = dom.Document
  type DocumentFragment = dom.DocumentFragment
  type DOMException = dom.DOMException
  type DOMImplementation = dom.DOMImplementation
  lazy val DOMException: dom.DOMException.type = dom.DOMException
  type DOMList[T] = dom.DOMList[T]
  type DOMParser = dom.DOMParser
  type DOMSettableTokenList = dom.DOMSettableTokenList
  type DOMStringList = dom.DOMStringList
  type DOMTokenList = dom.DOMTokenList
  type DragEvent = dom.DragEvent
  type DynamicsCompressorNode = dom.DynamicsCompressorNode

  type Element = dom.Element
  type ErrorEvent = dom.ErrorEvent
  type Event = dom.Event
  lazy val Event: dom.Event.type = dom.Event
  type EventException = dom.EventException
  lazy val EventException: dom.EventException.type = dom.EventException
  type EventInit = dom.EventInit
  type EventSource = dom.EventSource
  lazy val EventSource: dom.EventSource.type = dom.EventSource
  type EventTarget = dom.EventTarget
  type External = dom.External

  type FocusEvent = dom.FocusEvent
  type File = dom.File
  type FileList = dom.FileList
  type FileReader = dom.FileReader
  lazy val FileReader: dom.FileReader.type = dom.FileReader
  type FormData = dom.FormData
  lazy val FormData: dom.FormData.type = dom.FormData

  type GainNode = dom.GainNode
  type Geolocation = dom.Geolocation

  type HashChangeEvent = dom.HashChangeEvent
  type History = dom.History
  type HTMLAnchorElement = dom.HTMLAnchorElement
  type HTMLAudioElement = dom.HTMLAudioElement
  type HTMLAreaElement = dom.HTMLAreaElement
  type HTMLBaseElement = dom.HTMLBaseElement
  type HTMLBodyElement = dom.HTMLBodyElement
  type HTMLButtonElement = dom.HTMLButtonElement
  type HTMLBRElement = dom.HTMLBRElement
  type HTMLCanvasElement = dom.HTMLCanvasElement
  type HTMLCollectionElement = dom.HTMLCollection
  type HTMLDataListElement = dom.HTMLDataListElement
  type HTMLDivElement = dom.HTMLDivElement
  type HTMLDListElement = dom.HTMLDListElement
  type HTMLDocument = dom.HTMLDocument
  type HTMLElement = dom.HTMLElement
  type HTMLEmbedElement = dom.HTMLEmbedElement
  type HTMLFieldSetElement = dom.HTMLFieldSetElement
  type HTMLFormElement = dom.HTMLFormElement
  type HTMLHeadElement = dom.HTMLHeadElement
  type HTMLHeadingElement = dom.HTMLHeadingElement
  type HTMLHtmlElement = dom.HTMLHtmlElement
  type HTMLHRElement = dom.HTMLHRElement
  type HTMLIFrameElement = dom.HTMLIFrameElement
  type HTMLImageElement = dom.HTMLImageElement
  type HTMLInputElement = dom.HTMLInputElement
  type HTMLLabelElement = dom.HTMLLabelElement
  type HTMLLegendElement = dom.HTMLLegendElement
  type HTMLLIElement = dom.HTMLLIElement
  type HTMLLinkElement = dom.HTMLLinkElement
  type HTMLMapElement = dom.HTMLMapElement
  type HTMLMediaElement = dom.HTMLMediaElement
  @inline def HTMLMediaElement = dom.HTMLMediaElement
  type HTMLMenuElement = dom.HTMLMenuElement
  type HTMLMetaElement = dom.HTMLMetaElement
  type HTMLModElement = dom.HTMLModElement
  type HTMLObjectElement = dom.HTMLObjectElement
  type HTMLOListElement = dom.HTMLOListElement
  type HTMLOptGroupElement = dom.HTMLOptGroupElement
  type HTMLOptionElement = dom.HTMLOptionElement
  type HTMLParagraphElement = dom.HTMLParagraphElement
  type HTMLParamElement = dom.HTMLParamElement
  type HTMLPreElement = dom.HTMLPreElement
  type HTMLProgressElement = dom.HTMLProgressElement
  type HTMLQuoteElement = dom.HTMLQuoteElement
  type HTMLScriptElement = dom.HTMLScriptElement
  type HTMLSelectElement = dom.HTMLSelectElement
  type HTMLSourceElement = dom.HTMLSourceElement
  type HTMLSpanElement = dom.HTMLSpanElement
  type HTMLStyleElement = dom.HTMLStyleElement
  type HTMLTableElement = dom.HTMLTableElement
  type HTMLTableAlignment = dom.HTMLTableAlignment
  type HTMLTableCaptionElement = dom.HTMLTableCaptionElement
  type HTMLTableCellElement = dom.HTMLTableCellElement
  type HTMLTableColElement = dom.HTMLTableColElement
  type HTMLTableRowElement = dom.HTMLTableRowElement
  type HTMLTableSectionElement = dom.HTMLTableSectionElement
  type HTMLTitleElement = dom.HTMLTitleElement
  type HTMLTextAreaElement = dom.HTMLTextAreaElement
  type HTMLTrackElement = dom.HTMLTrackElement
  type HTMLUListElement = dom.HTMLUListElement
  type HTMLUnknownElement = dom.HTMLUnknownElement
  type HTMLVideoElement = dom.HTMLVideoElement

  type IDBCursor = dom.IDBCursor
  @inline def IDBCursor = dom.IDBCursor
  type IDBCursorWithValue = dom.IDBCursorWithValue
  type IDBDatabase = dom.IDBDatabase
  type IDBEnvironment = dom.IDBEnvironment
  type IDBFactory = dom.IDBFactory
  type IDBIndex = dom.IDBIndex
  type IDBKeyRange = dom.IDBKeyRange
  @inline def IDBKeyRange = dom.IDBKeyRange
  type IDBObjectStore = dom.IDBObjectStore
  type IDBOpenDBRequest = dom.IDBOpenDBRequest
  type IDBRequest = dom.IDBRequest
  type IDBTransaction = dom.IDBTransaction
  @inline def IDBTransaction = dom.IDBTransaction
  type IDBVersionChangeEvent = dom.IDBVersionChangeEvent
  type ImageData = dom.ImageData

  type KeyboardEvent = dom.KeyboardEvent
  lazy val KeyboardEvent: dom.KeyboardEvent.type = dom.KeyboardEvent

  type KeyboardEventInit = dom.KeyboardEventInit

  type LinkStyle = dom.LinkStyle
  type Location = dom.Location

  type MediaError = dom.MediaError
  lazy val MediaError: dom.MediaError.type = dom.MediaError
  type MediaElementAudioSourceNode = dom.MediaElementAudioSourceNode
  type MediaList = dom.MediaList
  type MediaQueryList = dom.MediaQueryList
  type MediaQueryListListener = dom.MediaQueryListListener
  type MediaStreamAudioDestinationNode = dom.MediaStreamAudioDestinationNode
  type MediaStreamAudioSourceNode = dom.MediaStreamAudioSourceNode
  type MessageChannel = dom.MessageChannel
  type MessageEvent = dom.MessageEvent
  type MessagePort = dom.MessagePort
  type ModifierKeyEvent = dom.ModifierKeyEvent
  type MouseEvent = dom.MouseEvent
  type PointerEvent = dom.PointerEvent
  type PointerEventInit = dom.PointerEventInit
  type MutationObserver = dom.MutationObserver
  type MutationObserverInit = dom.MutationObserverInit
  lazy val MutationObserverInit: dom.MutationObserverInit.type =
    dom.MutationObserverInit
  type MutationRecord = dom.MutationRecord

  type NamedNodeMap = dom.NamedNodeMap
  type NavigatorID = dom.NavigatorID
  type Navigator = dom.Navigator
  type NavigatorContentUtils = dom.NavigatorContentUtils
  type NavigatorGeolocation = dom.NavigatorGeolocation
  type NavigatorLanguage = dom.NavigatorLanguage
  type NavigatorOnLine = dom.NavigatorOnLine
  type NavigatorStorageUtils = dom.NavigatorStorageUtils
  type NodeSelector = dom.NodeSelector
  type Node = dom.Node
  lazy val Node: dom.Node.type = dom.Node
  type NodeFilter = dom.NodeFilter
  lazy val NodeFilter: dom.NodeFilter.type = dom.NodeFilter
  type NodeIterator = dom.NodeIterator
  type NodeList = dom.NodeList
  type NodeListOf[TNode <: Node] = dom.NodeListOf[TNode]

  type OfflineAudioContext = dom.OfflineAudioContext
  type OscillatorNode = dom.OscillatorNode

  type PannerNode = dom.PannerNode
  type ParentNode = dom.ParentNode
  type Performance = dom.Performance
  type PerformanceEntry = dom.PerformanceEntry
  type PerformanceTiming = dom.PerformanceTiming
  type PerformanceMark = dom.PerformanceMark
  type PerformanceMeasure = dom.PerformanceMeasure
  type PerformanceNavigation = dom.PerformanceNavigation
  lazy val PerformanceNavigation: dom.PerformanceNavigation.type =
    dom.PerformanceNavigation
  type PerformanceResourceTiming = dom.PerformanceResourceTiming
  type PeriodicWave = dom.PeriodicWave
  type Position = dom.Position
  type PositionOptions = dom.PositionOptions
  type PositionError = dom.PositionError
  lazy val PositionError: dom.PositionError.type = dom.PositionError
  type ProcessingInstruction = dom.ProcessingInstruction
  type ProgressEvent = dom.ProgressEvent
  type PopStateEvent = dom.PopStateEvent

  type Range = dom.Range
  lazy val Range: dom.Range.type = dom.Range

  type Screen = dom.Screen
  type Selection = dom.Selection
  type StereoPannerNode = dom.StereoPannerNode
  type Storage = dom.Storage
  type StorageEvent = dom.StorageEvent
  type StyleMedia = dom.StyleMedia
  type StyleSheetList = dom.StyleSheetList
  type StyleSheet = dom.StyleSheet

  type Text = dom.Text
  type TextEvent = dom.TextEvent
  lazy val TextEvent: dom.TextEvent.type = dom.TextEvent
  type TextMetrics = dom.TextMetrics
  type TextTrack = dom.TextTrack
  lazy val TextTrack: dom.TextTrack.type = dom.TextTrack
  type TextTrackCue = dom.TextTrackCue
  type TextTrackCueList = dom.TextTrackCueList
  type TextTrackList = dom.TextTrackList
  type TimeRanges = dom.TimeRanges
  type Touch = dom.Touch
  type TouchEvent = dom.TouchEvent
  type TouchList = dom.TouchList
  type TrackEvent = dom.TrackEvent
  type Transferable = dom.Transferable
  type TransitionEvent = dom.TransitionEvent
  type TreeWalker = dom.TreeWalker

  type UIEvent = dom.UIEvent
  lazy val URL: dom.URL.type = dom.URL

  type ValidityState = dom.ValidityState
  type VisibilityState = dom.VisibilityState
  lazy val VisibilityState: dom.VisibilityState.type = dom.VisibilityState

  type WaveShaperNode = dom.WaveShaperNode
  type WebGLActiveInfo = dom.WebGLActiveInfo
  type WebGLBuffer = dom.WebGLBuffer
  type WebGLContextAttributes = dom.WebGLContextAttributes
  type WebGLFramebuffer = dom.WebGLFramebuffer
  type WebGLProgram = dom.WebGLProgram
  type WebGLRenderbuffer = dom.WebGLRenderbuffer
  type WebGLRenderingContext = dom.WebGLRenderingContext
  type WebGLShader = dom.WebGLShader
  type WebGLShaderPrecisionFormat = dom.WebGLShaderPrecisionFormat
  type WebGLTexture = dom.WebGLTexture
  type WebGLUniformLocation = dom.WebGLUniformLocation
  @inline def WebGLRenderingContext = dom.WebGLRenderingContext
  type WebSocket = dom.WebSocket
  lazy val WebSocket: dom.WebSocket.type = dom.WebSocket
  type WheelEvent = dom.WheelEvent
  lazy val WheelEvent: dom.WheelEvent.type = dom.WheelEvent
  type Window = dom.Window
  type WindowConsole = dom.WindowConsole
  type WindowLocalStorage = dom.WindowLocalStorage
  type WindowSessionStorage = dom.WindowSessionStorage
  type WindowTimers = dom.WindowTimers
  type WindowBase64 = dom.WindowBase64
  type Worker = dom.Worker
  type WorkerGlobalScope = dom.WorkerGlobalScope
  type WorkerLocation = dom.WorkerLocation
  type WorkerNavigator = dom.WorkerNavigator

  type XMLHttpRequest = dom.XMLHttpRequest
  lazy val XMLHttpRequest: dom.XMLHttpRequest.type = dom.XMLHttpRequest
  type XMLHttpRequestEventTarget = dom.XMLHttpRequestEventTarget
  type XMLSerializer = dom.XMLSerializer
  type XPathResult = dom.XPathResult
  lazy val XPathResult: dom.XPathResult.type = dom.XPathResult
  type XPathNSResolver = dom.XPathNSResolver

  @js.native
  @JSGlobalScope
  object DedicatedWorkerGlobalScope extends js.Object {

    /**
     * Returns an object reference to the DedicatedWorkerGlobalScope object itself.
     *
     * MDN
     */
    def self: DedicatedWorkerGlobalScope = js.native
  }
}
