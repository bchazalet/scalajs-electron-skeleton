package com.example.electronapp

import scala.scalajs.js.JSApp

import org.scalajs.jquery.jQuery

object TutorialApp extends JSApp {

  def main(): Unit = {
    jQuery("body").append("<p>Hello World from Scala.js</p>")
  }

}
