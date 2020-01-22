name := "$name;format="normalize"$"
organization := "$organization;format="package"$"

version := "0.1.0-SNAPSHOT"

enablePlugins(SbtPlugin)

// target sbt 1.2.8 to allow 1.0+ compatibility
pluginCrossBuild / sbtVersion := "1.2.8"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "$scalatest_version$" % Test
)

scriptedLaunchOpts := { scriptedLaunchOpts.value ++
  Seq("-Xmx1024M", "-Dplugin.version=" + version.value)
}