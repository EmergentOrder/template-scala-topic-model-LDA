import AssemblyKeys._

assemblySettings

name := "template-scala-topic-model-LDA"

organization := "io.prediction"

scalaVersion := "2.10.5"

excludeFilter in Runtime in unmanagedResources := "*.html"

resolvers += Resolver.sonatypeRepo("snapshots")   

libraryDependencies ++= {
   Seq(
  "io.prediction"    %% "core"          % "0.9.4" % "provided",
  "org.apache.spark" %% "spark-core"    % "1.5.1" % "provided",
  "org.apache.spark" %% "spark-mllib"   % "1.5.1" % "provided",
     "org.xerial.snappy" % "snappy-java" % "1.1.1.7")
}
