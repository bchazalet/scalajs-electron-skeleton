package io.atom.electron

import scala.scalajs.js
import js.annotation.JSName
import js.Dynamic.{global => g}

/**
 * See http://electron.atom.io/docs/v0.30.0/api/browser-window/
 */
@js.native
trait BrowserWindow extends js.Object with EventEmitter {

  def webContents(): js.Dynamic = js.native

  def devToolsWebContents(): js.Dynamic = js.native

  def id(): Int = js.native

  def destroy(): Unit = js.native

  def close(): Unit = js.native

  def focus(): Unit = js.native

  def isFocused(): Boolean = js.native

  def show(): Unit = js.native

  def showInactive(): Unit = js.native

  def hide(): Unit = js.native

  def isVisible(): Boolean = js.native

  def maximize(): Unit = js.native

  def unmaximize(): Unit = js.native

  def isMaximized(): Boolean = js.native

  def minimize(): Unit = js.native

  def restore(): Unit = js.native

  def isMinimized(): Boolean = js.native

  def setFullScreen(flag: Boolean): Unit = js.native

  def isFullScreen(): Boolean = js.native

  // BrowserWindow.setBounds(options)
  // BrowserWindow.getBounds()

  def setSize(width: Int, height: Int): Unit = js.native

  def getSize(): js.Array[Int] = js.native

  def setContentSize(width: Int, height: Int): Unit = js.native

  def getContentSize(): js.Array[Int] = js.native

  def setMinimumSize(width: Int, height: Int): Unit = js.native

  def getMinimumSize(): js.Array[Int] = js.native

  def setMaximumSize(width: Int, height: Int): Unit = js.native

  def getMaximumSize(): js.Array[Int] = js.native

  def setResizable(resizable: Boolean): Unit = js.native

  def isResizable(): Boolean = js.native

  def setAlwaysOnTop(flag: Boolean): Unit = js.native

  def isAlwaysOnTop(): Boolean = js.native

  def center(): Unit = js.native

  def setPosition(x: Int, y: Int): Unit = js.native

  def getPosition(): js.Array[Int] = js.native

  def setTitle(title: String): Unit = js.native

  def getTitle(): String = js.native

  def flashFrame(flag: Boolean): Unit = js.native

  def setSkipTaskbar(skip: Boolean): Unit = js.native

  def setKiosk(flag: Boolean): Unit = js.native

  def isKiosk(): Boolean = js.native

  def setRepresentedFilename(filename: String): Unit = js.native

  def getRepresentedFilename(): String = js.native

  def setDocumentEdited(edited: Boolean): Unit = js.native

  def IsDocumentEdited(): Boolean = js.native

  // TODO def BrowserWindow.openDevTools([options])
  def openDevTools(): Unit = js.native

  def closeDevTools(): Unit = js.native

  def isDevToolsOpened(): Boolean = js.native

  def toggleDevTools(): Unit = js.native

  // TODO
  // BrowserWindow.inspectElement(x, y)
  // BrowserWindow.inspectServiceWorker()
  // BrowserWindow.focusOnWebView()
  // BrowserWindow.blurWebView()
  // BrowserWindow.capturePage([rect, ]callback)
  // BrowserWindow.print([options])
  // BrowserWindow.printToPDF(options, callback)

  // TODO def BrowserWindow.loadUrl(url, [options])

  def loadURL(url: String): Unit = js.native

  def reload(): Unit = js.native

  // TODO BrowserWindow.setMenu(menu)

  def setProgressBar(progress: Double): Unit = js.native

  // BrowserWindow.setOverlayIcon(overlay, description)
  // BrowserWindow.showDefinitionForSelection()

  def setAutoHideMenuBar(hide: Boolean): Unit = js.native

  def send(channel: String, arg: js.Dynamic*): Unit = js.native

  def isMenuBarAutoHide(): Boolean = js.native

  def setMenuBarVisibility(visible: Boolean): Unit = js.native

  def isMenuBarVisible(): Boolean = js.native

  def setVisibleOnAllWorkspaces(visible: Boolean): Unit = js.native

  def isVisibleOnAllWorkspaces(): Boolean = js.native

}

object BrowserWindow {

  val browserWindow = g.require("browser-window").asInstanceOf[js.Dynamic]

  def apply(width: Int = 800, height: Int = 600, show: Boolean = true, icon: String = null): BrowserWindow = {
    js.Dynamic.newInstance(browserWindow)(
      js.Dynamic.literal(width = width, height = height, show = show, icon = icon)
    ).asInstanceOf[BrowserWindow]
  }

}
