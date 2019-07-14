rootProject.name = "strikt"

include(
  "strikt-bom",
  "strikt-core",
  "strikt-gradle",
  "strikt-jackson",
  "strikt-java-time",
  "strikt-protobuf",
  "strikt-spring",
  "site"
)

rootProject.children.forEach {
  it.buildFileName = "${it.name}.gradle.kts"
}
