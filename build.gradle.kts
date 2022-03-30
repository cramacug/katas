plugins {
    kotlin("jvm") version "1.6.10"
}

group = "cramacug.katas"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    // https://mvnrepository.com/artifact/org.jetbrains.kotlin/kotlin-test-junit5
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5:1.6.10")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
