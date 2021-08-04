package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

import org.scalajs.dom

@deprecated("All the members of webworkers.* have been moved to dom.*",
    "2.0.0")
object webworkers {
  type AbstractWorker = dom.AbstractWorker
  type DedicatedWorkerGlobalScope = dom.DedicatedWorkerGlobalScope
  type Worker = dom.Worker
  type WorkerGlobalScope = dom.WorkerGlobalScope
  type WorkerLocation = dom.WorkerLocation
  type WorkerNavigator = dom.WorkerNavigator

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
