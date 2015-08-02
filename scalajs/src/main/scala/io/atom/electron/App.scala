package io.atom.electron

import scala.scalajs.js
import js.annotation.JSName
import js.Dynamic.{global => g}

/**
 * See http://electron.atom.io/docs/v0.30.0/api/app/
 */
trait App extends js.Object with EventEmitter {

  def quit(): Unit = js.native

  def getAppPath(): Unit = js.native

  def getPath(name: String): String = js.native

  def setPath(name: String, path: String): Unit = js.native

  def getVersion(): String = js.native

  def getName(): String = js.native

  // TODO app.resolveProxy(url, callback)

  def addRecentDocument(path: String): Unit = js.native

  def clearRecentDocuments(): Unit = js.native

  // TODO
  // app.setUserTasks(tasks)
  // app.commandLine.appendSwitch(switch, [value])
  // app.commandLine.appendArgument(value)
  // app.dock.bounce([type])
  // app.dock.cancelBounce(id)
  // app.dock.setBadge(text)
  // app.dock.getBadge()
  // app.dock.hide()
  // app.dock.show()
  // app.dock.setMenu(menu)

}
