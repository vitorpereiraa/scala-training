ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "3.7.1"

lazy val root = (project in file("."))
  .settings(
    name := "scala-training",
    libraryDependencies ++= Seq(
        "org.scalactic" %% "scalactic" % "3.2.19",
        "org.scalatest" %% "scalatest" % "3.2.19" % Test
    ),
    wartremoverErrors ++= Warts.allBut(
        Wart.Any, Wart.Equals, Wart.Nothing,
        Wart.Overloading, Wart.Recursion, Wart.StringPlusAny,
        Wart.ToString, Wart.TripleQuestionMark
    )
)
