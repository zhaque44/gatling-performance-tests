# gatling-performance-tests

# Setup
Let’s start by creating a plugins.sbt file in our project directory. We’re going to be adding the sbt plugin there, here’s an example below:
```scala
addSbtPlugin("io.gatling" % "gatling-sbt" % "3.0.0")
```
Once you’re done doing that, you have to enable the Gatling plugin in your build.sbt file:
