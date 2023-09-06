pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://repo.papermc.io/repository/maven-public/")
    }
}

rootProject.name = "clashpaper"

include("plugin", "core", "api", "importer")
include("slimeworldmanager-api", "slimeworldmanager-server")
