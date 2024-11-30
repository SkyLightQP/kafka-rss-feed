rootProject.name = "kafka-rss-feed"

listOf(
    "consumer",
    "rss-producer",
).forEach {
    include(it)
    project(":$it").projectDir = File("$rootDir/modules/$it")
}