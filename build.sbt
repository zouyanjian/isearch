import net.litola.SassPlugin

name := "isearch"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "org.webjars" % "webjars-play_2.10" % "2.2.0",
  "org.webjars" % "foundation" % "4.3.1",
  "org.webjars" % "jquery" % "1.9.1",
  jdbc,
  anorm,
  cache
)     

play.Project.playScalaSettings ++ SassPlugin.sassSettings ++ Seq(SassPlugin.sassOptions := Seq("--compass", "-r", "zurb-foundation"))
