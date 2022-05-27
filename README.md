# gatling-performance-tests

## Why Gatling?
Gatling is an open-source load testing framework, written in Scala. This tool works great and is efficient in terms of measuring the performance of an API. One great thing about Gatling is that you can write your performance test scenarios just like you would write your integration tests. Keep in mind that Gatling Simulations can be integrated with Continuous Delivery tools like Jenkins. The benefit for us there is that we can get constant feedback from the tests while we continuously make changes to our API before we actually promote it to production.

## Setup
Let’s start by creating a plugins.sbt file in our project directory. We’re going to be adding the sbt plugin there, here’s an example below:
```scala
addSbtPlugin("io.gatling" % "gatling-sbt" % "3.0.0")
```
Once you’re done doing that, you have to enable the Gatling plugin in your build.sbt file:
```scala
lazy val projectName = (project in file("."))
  .enablePlugins(GatlingPlugin)
    )
  )
```
