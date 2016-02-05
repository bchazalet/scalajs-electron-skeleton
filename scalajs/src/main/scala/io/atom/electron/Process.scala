package io.atom.electron

import scala.scalajs.js
import js.annotation.JSName

/**
 * See http://electron.atom.io/docs/v0.30.0/api/process/
 */
 @JSName("process")
 @js.native
object Process extends js.Object {

  def platform: String = js.native

}
