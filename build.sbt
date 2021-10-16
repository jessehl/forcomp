course := "progfun1"
assignment := "forcomp"

scalaVersion := "3.0.0"

scalacOptions ++= Seq("-language:implicitConversions", "-deprecation")

libraryDependencies += "org.scalameta" %% "munit" % "0.7.26" % Test

mainClass in (Compile, run) := Some("Anagrams")