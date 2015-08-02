package io.atom.electron

import scala.scalajs.js
import js.annotation.JSName
import js.Dynamic.{global => g}

/**
 * See http://electron.atom.io/docs/v0.30.0/api/browser-window/
 */
class BrowserWindow extends js.Object { //(options: BrowserWindowOptions) extends js.Object {

  def loadUrl(url: String): Unit = js.native

  def openDevTools(): Unit = js.native

  def on(event: String, listener: js.Function0[Unit]): BrowserWindow = js.native

}

object BrowserWindow {

  val browserWindow = g.require("browser-window").asInstanceOf[js.Dynamic]

  def apply(width: Int = 800, height: Int = 600, show: Boolean = true): BrowserWindow = {
    js.Dynamic.newInstance(browserWindow)(
      js.Dynamic.literal(width = width, height = height, show = show)
    ).asInstanceOf[BrowserWindow]
  }

}
