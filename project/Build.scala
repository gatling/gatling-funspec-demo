import com.typesafe.sbt.SbtScalariform._
import io.gatling.sbt.GatlingPlugin
import sbt.Keys._
import sbt._

object Build extends Build {

  lazy val buildSettings = Seq(
    organization := "io.gatling.funspec",
    version := "1.0.0",
    scalaVersion := "2.11.6"
  )

  lazy val projectDependencies = Seq(
    "org.scalatest"                   %% "scalatest"                  % "2.2.3"          % "test,it",
    "io.gatling.highcharts"           % "gatling-charts-highcharts"   % "2.2.0"          % "test,it",
    "io.gatling"                      % "gatling-test-framework"      % "2.2.0"          % "test,it"
  )

  lazy val root = Project("dhl-parcel-api", file("."))
    .enablePlugins(GatlingPlugin)
    .settings(buildSettings: _*)
    .settings(libraryDependencies ++= projectDependencies)
    .settings(scalariformSettings: _*)
}
