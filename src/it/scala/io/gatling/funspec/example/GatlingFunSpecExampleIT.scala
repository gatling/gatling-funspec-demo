package io.gatling.funspec.example

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.http.funspec.GatlingHttpFunSpec
import io.gatling.funspec.example.GatlingFunSpecExampleIT._

class GatlingFunSpecExampleIT extends GatlingHttpFunSpec {

  val baseUrl = "http://example.com"
  override def httpProtocol = super.httpProtocol.header("MyHeader", "MyValue")

  spec {
    http("Example index.html test")
      .get("/index.html")
      .check(h1.exists)
  }
}

object GatlingFunSpecExampleIT {

  def h1 = css("h1")
}
