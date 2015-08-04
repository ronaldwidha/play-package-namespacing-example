name := "com.org.web"
version := "1.2"

lazy val commonSettings: Seq[Setting[_]] = Seq(
  libraryDependencies ++= Seq(
    "com.google.inject.extensions" % "guice-servlet" % "4.0" // dependency injection
  )
)

// common utility for web and microservices
lazy val com_org_web_common = (project in file("libraries/com.org.web.common"))
  .settings(commonSettings: _*)
  .enablePlugins(PlayJava)

// web project
lazy val org_web = (project in file("."))
  .aggregate(com_org_web_common)
  .dependsOn(com_org_web_common)
  .enablePlugins(PlayJava)
  .settings(commonSettings: _*)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "com.typesafe.play" % "twirl-api_2.11" % "1.1.1" // for intellij
)

// for enabling sedis, redis scala client
resolvers += "google-sedis-fix" at "http://pk11-scratch.googlecode.com/svn/trunk"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

fork in run := true