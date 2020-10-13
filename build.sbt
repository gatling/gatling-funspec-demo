lazy val root = Project("gatling-funspec-demo", file("."))
  .enablePlugins(GatlingPlugin)
  .settings(buildSettings: _*)
  .settings(libraryDependencies ++= projectDependencies)

lazy val buildSettings = Seq(
  organization := "io.gatling.funspec",
  version := "3.4.1",
  scalaVersion := "2.12.12"
)

lazy val projectDependencies = Seq(
  "org.scalatest"                  %% "scalatest"                   % "3.2.2"    % "test,it",
  "io.gatling.highcharts"           % "gatling-charts-highcharts"   % "3.4.0"    % "test,it",
  "io.gatling"                      % "gatling-test-framework"      % "3.4.0"    % "test,it"
)
