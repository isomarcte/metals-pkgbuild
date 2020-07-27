// Constants //

// Scala Versions

lazy val scala213 = "2.13.3"

// Misc

lazy val projectName = "metals-aur-test-project"

// This Build //

ThisBuild / scalaVersion := scala213

// Root Project //

lazy val root = (project in file(".")).settings(
  name := s"${projectName}-root"
).aggregate(core)

// Projects //

lazy val core = project
