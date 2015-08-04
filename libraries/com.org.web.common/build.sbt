name :="webcommon"

version := "1.2"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaWs,
  "com.typesafe.play.modules" %% "play-modules-redis" % "2.4.1",
  "com.google.inject.extensions" % "guice-servlet" % "4.0"
)

resolvers += "google-sedis-fix" at "http://pk11-scratch.googlecode.com/svn/trunk"

javaSource in Compile := baseDirectory.value


unmanagedSourceDirectories in Compile := (javaSource in Compile).value :: Nil