import play.PlayScala

name := """AngularPlay"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  "org.webjars" % "bootstrap" % "3.3.0",
  "org.webjars" % "jquery" % "2.1.1",
  "org.webjars" % "angularjs" % "1.3.0" exclude("org.webjars", "jquery")
)
