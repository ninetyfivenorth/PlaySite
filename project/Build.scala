import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "MyFirstProject"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
		//"postgresql" % "postgresql" % "9.1-901.jdbc4",
            "mysql" % "mysql-connector-java" % "5.1.21",
		"javax.mail" % "mail" % "1.4.5"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Add your own project settings here      
    )

}
