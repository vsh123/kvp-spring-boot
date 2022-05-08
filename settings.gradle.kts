pluginManagement {
    val kotlinPluginVersion: String by settings
    plugins {
        kotlin("jvm") version kotlinPluginVersion
        kotlin("plugin.allopen") version kotlinPluginVersion
        kotlin("plugin.noarg") version kotlinPluginVersion
        kotlin("kapt") version kotlinPluginVersion

        kotlin("plugin.jpa") version kotlinPluginVersion
        kotlin("plugin.spring") version kotlinPluginVersion
    }
}


rootProject.name = "springboot"

include("kvp-spring-boot-starter")
include("kvp-spring-boot-web")
include("kvp-spring-boot-web-undertow")
include("kvp-spring-boot-mongodb")
include("kvp-spring-boot-neo4j")
include("kvp-spring-boot-security")
include("kvp-spring-boot-rest")
