Scala.js & Electron Skeleton
============================

This is an example of how to use Scala.js together with Electron to build native applications.

## Getting started
Get started, enter the scalajs subfolder, start sbt and launch the fastOptJS task
``` bash
cd scalajs
sbt
sbt> ~fastOptJS
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
