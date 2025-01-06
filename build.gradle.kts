plugins {
    kotlin("jvm") version "2.0.21"
}

group = "com.y2gcoder"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter", "junit-jupiter", "5.11.4")
    testImplementation("org.assertj", "assertj-core", "3.27.0")
    testImplementation("io.kotest", "kotest-runner-junit5", "5.9.1")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}