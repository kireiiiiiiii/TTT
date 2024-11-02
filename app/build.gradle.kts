///////////////////
// VARIABLES ///
///////////////////

var main_class = "kireiiiiiiii.ttt.App"

///////////////////
// BUILD SCRIPT ///
///////////////////

plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    // Use JUnit Jupiter for testing.
    testImplementation(libs.junit.jupiter)
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    // This dependency is used by the application.
    implementation(libs.guava)
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

application {
    mainClass = main_class
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
