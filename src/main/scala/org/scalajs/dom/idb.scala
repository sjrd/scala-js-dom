package org.scalajs.dom

/**
 * Short aliases of all the dom.IDBThing classes
 */
object idb {
  type Cursor = IDBCursor
  @inline def Cursor = IDBCursor
  type CursorWithValue = IDBCursorWithValue
  type Database = IDBDatabase
  type Environment = IDBEnvironment
  type Factory = IDBFactory
  type Index = IDBIndex
  type KeyRange = IDBKeyRange
  @inline def KeyRange = IDBKeyRange
  type ObjectStore = IDBObjectStore
  type OpenDBRequest = IDBOpenDBRequest
  type Request = IDBRequest
  type Transaction = IDBTransaction
  @inline def Transaction = IDBTransaction
  type VersionChangeEvent = IDBVersionChangeEvent
}
