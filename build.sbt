lazy val root = Project("gatling-funspec-example", file("."))
  .enablePlugins(GatlingPlugin)
  .settings(buildSettings: _*)
  .settings(libraryDependencies ++= projectDependencies)

lazy val buildSettings = Seq(
  organization := "io.gatling.funspec",
  version := "3.0.1.1",
  scalaVersion := "2.12.7"
)

lazy val projectDependencies = Seq(
  "org.scalatest"                   %% "scalatest"                  % "3.0.5"      % "test,it",
  "io.gatling.highcharts"           % "gatling-charts-highcharts"   % "3.0.1.1"      % "test,it",
  "io.gatling"                      % "gatling-test-framework"      % "3.0.1.1"      % "test,it"
)
