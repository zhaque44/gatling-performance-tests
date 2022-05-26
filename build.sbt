name := "gatling-performance-tests"

version := "0.1"

scalaVersion := "2.12.8"

val json4s = "3.6.1"

lazy val recommendationsTests = (project in file("."))
  .enablePlugins(GatlingPlugin)
  .settings(
    scalacOptions += "-feature",
    libraryDependencies ++= Seq(
      "ch.qos.logback" % "logback-classic" % "1.2.3",
      "com.typesafe" % "config" % "1.3.4",
      "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2",
      "org.json4s" %% "json4s-native" % json4s,
      "org.json4s" %% "json4s-jackson" % json4s,
      "io.rest-assured" % "scala-support" % "4.0.0",
      "io.rest-assured" % "json-schema-validator" % "3.0.3",
      "org.json4s" %% "json4s-ext" % json4s,
      "io.gatling.highcharts" % "gatling-charts-highcharts" % "3.1.3",
      "io.gatling" % "gatling-test-framework" % "3.1.3",
      "org.scalatest" %% "scalatest" % "3.0.5"
    )
  )
