package com.company.service.performance.simulations

import io.gatling.core.Predef._
import io.gatling.http.Predef._

abstract class BaseSimulation extends Simulation {

  val baseUrl = sys.env.getOrElse("BASE_URL", s"https://jsonplaceholder.typicode.com")

  val username = ""
  val password = ""
  val prerequisites = s"$baseUrl"


  val hankRequest = http.baseUrl(prerequisites)
    .header("Accept", "application/json")

  val httpProtocol = http.baseUrl(baseUrl)
    .header("Accept", "application/json")
    .header("Authorization", "token")
}
