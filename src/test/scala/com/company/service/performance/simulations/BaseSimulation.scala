package com.company.service.performance.simulations

import io.gatling.core.Predef._
import io.gatling.http.Predef._

abstract class BaseSimulation extends Simulation {

  val baseUrl = sys.env.getOrElse("BASE_URL", s"https://jsonplaceholder.typicode.com/todos/1")

  val username = ""
  val password = ""
  val endpoint = s"$baseUrl"


  val getRequest = http.baseUrl(endpoint)
    .header("Accept", "application/json")

  val httpProtocol = http.baseUrl(baseUrl)
    .header("Accept", "application/json")
    .header("Authorization", "token")
}
