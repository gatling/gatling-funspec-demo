# Gatling functional tests example project

This is an example project showing how to setup and write functional tests using Gatling

The [GatlingFunSpecExample](src/test/scala/io/gatling/funspec/example/GatlingFunSpecExample.scala) contains an example test you can use to get started writing functional tests with Gatling.

Use `sbt test` to run the example


# Running the example.

All you need to do to run the example is clone this repository and then `sbt test` in the project root.

However since this project is based on future functionality you will need to clone and build some snapshots to get it to work until this feature is officially released

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
