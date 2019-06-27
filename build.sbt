lazy val root = Project("gatling-funspec-demo", file("."))
  .enablePlugins(GatlingPlugin)
  .settings(buildSettings: _*)
  .settings(libraryDependencies ++= projectDependencies)

lazy val buildSettings = Seq(
  organization := "io.gatling.funspec",
  version := "3.1.3",
  scalaVersion := "2.12.8"
)

lazy val projectDependencies = Seq(
  "org.scalatest"                   %% "scalatest"                  % "3.0.7"    % "test,it",
  "io.gatling.highcharts"           % "gatling-charts-highcharts"   % "3.1.3"    % "test,it",
  "io.gatling"                      % "gatling-test-framework"      % "3.1.3"    % "test,it"
)
