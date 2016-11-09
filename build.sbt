lazy val root = Project("gatling-funspec-example", file("."))
  .enablePlugins(GatlingPlugin)
  .settings(buildSettings: _*)
  .settings(libraryDependencies ++= projectDependencies)
  .settings(scalariformSettings: _*)

lazy val buildSettings = Seq(
  organization := "io.gatling.funspec",
  version := "1.0.0",
  scalaVersion := "2.11.8"
)

lazy val projectDependencies = Seq(
  "org.scalatest"                   %% "scalatest"                  % "3.0.0"          % "test,it",
  "io.gatling.highcharts"           % "gatling-charts-highcharts"   % "2.2.3"          % "test,it",
  "io.gatling"                      % "gatling-test-framework"      % "2.2.3"          % "test,it"
)
