import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {

    val kotlinVersion = "1.3.11"
    val springBootVersion = "2.1.2.RELEASE"

    repositories {
        mavenCentral()
    }

    dependencies {
        classpath(group = "org.springframework.boot", name = "spring-boot-gradle-plugin", version = springBootVersion)
        classpath(group = "org.jetbrains.kotlin", name = "kotlin-gradle-plugin", version = kotlinVersion)
        classpath(group = "org.jetbrains.kotlin", name = "kotlin-allopen", version = kotlinVersion)
    }
}

apply(plugin = "kotlin")
apply(plugin = "kotlin-spring")
apply(plugin = "org.springframework.boot")
apply(plugin = "io.spring.dependency-management")

val group = "de.thorb"
val version = "0.0.1-SNAPSHOT"
val sourceCompatibility = "1.8"

repositories {
    mavenCentral()
    jcenter()
}

val implementation by configurations
val testImplementation by configurations

dependencies {
    implementation(group = "org.springframework.boot", name = "spring-boot-starter-web")
    implementation(group = "com.fasterxml.jackson.module", name = "jackson-module-kotlin")
    implementation(group = "org.jetbrains.kotlin", name = "kotlin-stdlib-jdk8")
    implementation(group = "org.jetbrains.kotlin", name = "kotlin-reflect")

    implementation(group = "org.apache.wicket", name = "wicket-core", version = "8.2.0")
    implementation(group = "org.kwicket", name = "kwicket-wicket-core", version = "0.0.4")

    implementation(group = "org.apache.wicket", name = "wicket-extensions", version = "8.2.0")
    implementation(group = "org.kwicket", name = "kwicket-wicket-extensions", version = "0.0.4")

    implementation(group = "org.apache.wicket", name = "wicket-spring", version = "8.2.0")
    implementation(group = "org.kwicket", name = "kwicket-wicket-spring", version = "0.0.4")


    implementation(group = "org.springframework.boot", name = "spring-boot-devtools")

    testImplementation(group = "org.springframework.boot", name = "spring-boot-starter-test")
}

tasks {
    "build"{ dependsOn("processResources") }
}


val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions.jvmTarget = "1.8"