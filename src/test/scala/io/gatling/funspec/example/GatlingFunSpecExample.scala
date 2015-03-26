package io.gatling.funspec.example

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.http.funspec.GatlingHttpFunSpec
import io.gatling.funspec.example.GatlingFunSpecExample._

class GatlingFunSpecExample extends GatlingHttpFunSpec {

  val baseURL = "http://example.com"
  override def httpConf = super.httpConf.header("MyHeader", "MyValue")

  spec {
    http("Example index.html test")
      .get("/index.html")
      .check(h1.exists)
  }

}

object GatlingFunSpecExample {

  def h1 = css("h1")

}
