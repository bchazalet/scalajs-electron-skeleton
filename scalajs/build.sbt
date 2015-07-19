enablePlugins(ScalaJSPlugin)

name := "Scala.js Electron Skeleton"

scalaVersion := "2.11.7"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.8.1"
libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.8.0"

jsDependencies += RuntimeDOM

skip in packageJSDependencies := false

persistLauncher in Compile := true
persistLauncher in Test := false
