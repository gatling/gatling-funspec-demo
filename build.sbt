lazy val root = Project("gatling-funspec-demo", file("."))
  .enablePlugins(GatlingPlugin)
  .settings(buildSettings: _*)
  .settings(libraryDependencies ++= projectDependencies)

val gatlingVersion = "3.10.4"

lazy val buildSettings = Seq(
  organization := "io.gatling.funspec",
  version := gatlingVersion,
  scalaVersion := "2.13.13"
)

lazy val projectDependencies = Seq(
  "org.scalatest"                  %% "scalatest"                   % "3.2.18"          % "test,it",
  "io.gatling.highcharts"           % "gatling-charts-highcharts"   % gatlingVersion    % "test,it",
  "io.gatling"                      % "gatling-test-framework"      % gatlingVersion    % "test,it"
)
