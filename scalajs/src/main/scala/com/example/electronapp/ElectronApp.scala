package com.example.electronapp

import scala.scalajs.js
import org.scalajs.jquery.jQuery
import js.Dynamic.{global => g}

object ElectronApp extends js.JSApp {

  val fs = g.require("fs")

  def main(): Unit = {
    jQuery("body").append("<p>Hello World from Scala.js</p>")
    val filenames = listFiles(".")
    display(filenames)
  }

  def display(filenames: Seq[String]) = {
    jQuery("body").append("<p>Listing the files in the '.' using io.js API:")
    jQuery("body").append("<ul>")
    filenames.foreach { filename =>
      jQuery("body").append(s"<li>$filename</li>")
    }
    jQuery("body").append("</ul></p>")
  }

  def listFiles(path: String): Seq[String] = {
    fs.readdirSync(path).asInstanceOf[js.Array[String]]
  }
}
