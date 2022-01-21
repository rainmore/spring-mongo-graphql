rootProject.name = "centus"

pluginManagement {
    plugins {
        id("org.ajoberstar.grgit") version settings.extra["plugin.git.version"]!!.toString()
        id("com.bmuschko.docker-spring-boot-application") version settings.extra["plugin.docker.version"]!!.toString()
        id("org.springframework.boot") version settings.extra["plugin.spring-boot.version"]!!.toString()!!
        id("io.spring.dependency-management") version settings.extra["plugin.spring-dependency-management.version"]!!.toString()
    }

    repositories {
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
    }
}