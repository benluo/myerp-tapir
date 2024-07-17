val tapirVersion = "1.10.13"
val zioVersion   = "2.1.6"

lazy val rootProject = (project in file(".")).settings(
  Seq(
    name         := "myerp-tapir",
    version      := "0.1.0-SNAPSHOT",
    organization := "cc.benluo",
    scalaVersion := "3.3.3",
    libraryDependencies ++= Seq(
      "com.softwaremill.sttp.tapir"   %% "tapir-zio-http-server"   % tapirVersion,
      "com.softwaremill.sttp.tapir"   %% "tapir-swagger-ui-bundle" % tapirVersion,
      "com.softwaremill.sttp.tapir"   %% "tapir-json-zio"          % tapirVersion,
      "ch.qos.logback"                 % "logback-classic"         % "1.5.6",
      "dev.zio"                       %% "zio-logging"             % "2.1.15",
      "dev.zio"                       %% "zio-logging-slf4j"       % "2.1.15",
      "com.softwaremill.sttp.tapir"   %% "tapir-sttp-stub-server"  % tapirVersion % Test,
      "dev.zio"                       %% "zio-test"                % zioVersion   % Test,
      "dev.zio"                       %% "zio-test-sbt"            % zioVersion   % Test,
      "com.softwaremill.sttp.client3" %% "zio-json"                % "3.9.7"      % Test
    )
  )
)
