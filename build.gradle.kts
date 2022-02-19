import java.nio.file.Path

plugins {
    id("org.ajoberstar.grgit")
    id("com.bmuschko.docker-spring-boot-application")
    id("org.springframework.boot")
    id("io.spring.dependency-management")

    idea
    application
    checkstyle
    pmd
}

group = "au.com.rainmore"
version = "1.0.0"
description = "A demo for the usage spring, mongo and graphql"

allprojects {
    repositories {
        mavenLocal()
        mavenCentral()
    }
}

tasks.named<Wrapper>("wrapper") {
    distributionType = Wrapper.DistributionType.ALL
    gradleVersion = project.properties["gradleVersion"] as String
}

application {
    mainClass.set(listOf(project.group.toString(), project.name, "Application").joinToString("."))
}

val configDir: Path by extra(projectDir.toPath().resolve("project"))

apply(from = configDir.resolve("assemble.gradle").toString())
apply(from = configDir.resolve("logging.gradle").toString())
apply(from = configDir.resolve("misc.gradle").toString())
apply(from = configDir.resolve("json.gradle").toString())
apply(from = configDir.resolve("spring.gradle").toString())
