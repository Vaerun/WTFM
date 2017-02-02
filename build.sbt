name := """WTFM"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)

// https://mvnrepository.com/artifact/org.postgresql/postgresql
libraryDependencies += "org.postgresql" % "postgresql" % "9.4.1212.jre7"

// https://mvnrepository.com/artifact/com.typesafe.play/play-java-ebean_2.11
libraryDependencies += "com.typesafe.play" % "play-java-ebean_2.11" % "2.4-2014-08-19-5fd9847"

// https://mvnrepository.com/artifact/org.mindrot/jbcrypt
libraryDependencies += "org.mindrot" % "jbcrypt" % "0.3m"

// https://mvnrepository.com/artifact/com.typesafe.play/play-mailer_2.11
libraryDependencies += "com.typesafe.play" % "play-mailer_2.11" % "5.0.0"

// https://mvnrepository.com/artifact/org.webjars/angularjs
libraryDependencies += "org.webjars" % "angularjs" % "1.6.0"