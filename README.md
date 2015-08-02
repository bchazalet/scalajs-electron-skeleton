Scala.js & Electron Skeleton
============================

This is an example of how to use Scala.js together with Electron to build native applications.

## Getting started
Get started, enter the scalajs subfolder, start sbt and launch the fastOptJS task
``` bash
cd scalajs
sbt
sbt> ~electronMain
```

Then you will need to get Electron [downloaded](https://github.com/atom/electron/releases)  on your machine.

Once you do, call the Electron executable with the electron-app subfolder as a argument:
``` bash
/your/path/to/Electron electron-app
# e.g. on my MacOS machine
~/development/tools/electron-v0.29.1-darwin-x64/Electron.app/Contents/MacOS/Electron electron-app/
```

You should see a new window opening with the following text:
> Hello World!
>
>We are using io.js v2.3.1 and Electron 0.29.1.
>
>Hello World from Scala.js

## Main process
Sbt task `electronMain` aggregates the content of `fastOptJS` and of the launcher to form the `main.js` file that will be provided to Electron's main process. This is why the repo does not contain a `main.js` under the `electron-app` folder (unlike electron's quick start example): it is generated from the Scala.js code.

Electron's [main process]((http://electron.atom.io/docs/latest/tutorial/quick-start/)) is implemented by `com.example.electronapp.Main.scala`. It extends `js.App` and that's what the generated Scala.js launcher launches. You should not extend `js.App` elsewhere in your code or that will generate a conflict: instead use `JSExport`.

## Renderer process
The javascript code loaded from within the rendered process (i.e. `index.html`) is implemented in `com.example.electronapp.Renderer.scala` and uses the `JSExport` annotation to be callable from javascript and its main method is explicitly called from within `index.html`.