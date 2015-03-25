import com.typesafe.sbt.packager.archetypes.ServerLoader
import com.typesafe.sbt.SbtNativePackager._
import NativePackagerKeys._

packageArchetype.java_server

serverLoading in Debian := ServerLoader.SystemV

name := "hello"

version := "1.0"

maintainer := "Max Smith <max.smith@yourcompany.io>"

packageSummary := "Hello World Debian Package"

packageDescription := "descr"
