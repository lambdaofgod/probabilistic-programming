name := "probabilistic-programming"

version := "0.1"

scalaVersion := "2.11.7"

libraryDependencies += "com.cra.figaro" % "figaro_2.11" % "4.1.0.0"

target in assembly := file("lib/")
