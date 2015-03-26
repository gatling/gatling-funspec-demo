# Gatling functional tests example project

New functionality coming in Gatling 2.2.0 will make writing functional tests in Gatling even nicer then before.

Use `sbt test` to run the example

# Example code

From [GatlingFunSpecExample](src/test/scala/io/gatling/funspec/example/GatlingFunSpecExample.scala)


```scala
class GatlingFunSpecExample extends GatlingHttpFunSpec {
  val baseURL = "http://example.com"

  spec {
    http("Example index.html test")
      .get("/index.html")
      .check(h1.exists)
  }

}

object GatlingFunSpecExample {
  def h1 = css("h1")
}
```

# Running the example.

All you need to do to run the example is clone this repository and then `sbt test` in the project root.

However since this project is based on future functionality you will need to clone and build some snapshots to get it to work until Gatling 2.2.0 is officially released

    # from the gatling-funspec-example directory
    cd ..
    git clone git@github.com:constantijn/gatling.git
    cd gatling
    sbt publish-local
    cd ..
    git clone git@github.com:gatling/gatling-sbt.git
    cd gatling-sbt
    sbt publish-local

This project wll be updated once Gatling 2.2.0 is officially released
