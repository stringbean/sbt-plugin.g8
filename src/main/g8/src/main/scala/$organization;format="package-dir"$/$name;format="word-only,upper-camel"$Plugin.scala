package $organization;format="package"$

import sbt.Keys._
import sbt._

object $name;format="word-only,upper-camel"$Plugin extends AutoPlugin {
  override def trigger: PluginTrigger = allRequirements

  object autoImport {
    val $task$ = taskKey[Unit]("run $task$")
  }

  import autoImport._

  override def projectSettings: Seq[Def.Setting[_]] = Seq(
    $task$ := {
      streams.value.log.info("Hello, world!")
    }
  )
}