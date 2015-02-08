name := "VizuryExperiments"

version := "1.0"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  "com.twitter" %% "finatra" % "1.6.0",
  "com.twitter" %% "twitter-server" % "1.7.3"
)


resolvers +=
  "Twitter" at "http://maven.twttr.com"