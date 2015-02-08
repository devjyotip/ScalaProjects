package com.vizury.experiment.config

/**
 * Created by devjyoti on 2/2/15.
 */
import com.twitter.app.Flags


object port extends Flags[String](":7070", "Http Port")
object adminPort extends Flags[String](":9990", "Admin/Stats Port")
object sslPort extends Flags[String](":7443", "Https Port")
object env extends Flags[String]("development", "Environment")
object pidEnabled extends Flags[Boolean](false, "whether to write pid file")
object pidPath extends Flags[String]("", "path to pid file")
object logPath extends Flags[String]("logs/finatra.log", "path to log")
object logLevel extends Flags[String]("INFO", "log level")
object logNode extends Flags[String]("finatra", "Logging node")
object templatePath extends Flags[String]("/", "path to templates")
object assetPath extends Flags[String]("/public", "path to assets")
object docRoot extends Flags[String]("src/main/resources", "path to docroot")
object maxRequestSize extends Flags[Int](5, "maximum request size (in megabytes)")
object certificatePath extends Flags[String]("", "path to SSL certificate")
object keyPath extends Flags[String]("", "path to SSL key")
object showDirectories extends Flags[Boolean](false, "allow directory view in asset path")