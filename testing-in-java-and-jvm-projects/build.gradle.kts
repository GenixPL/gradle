plugins {
    id("com.gradle.build-scan").version("2.2.1")
    id("org.jetbrains.kotlin.jvm").version("1.3.20")

    application
}

repositories {
    jcenter()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

application {
    mainClassName = "com.genix.AppKt"
}

buildScan {
    termsOfServiceUrl = "https://gradle.com/terms-of-service"
    termsOfServiceAgree = "yes"

    // publishAlways()
}

tasks.test {
    useJUnit()

    maxHeapSize = "1G" //change maximum heap size to 1G
}

reporting.baseDir = file("my-reports") //set new dir for generated test reports (report - easy to read html with test results)
project.setProperty("testResultsDirName", "$buildDir/my-test-results") //set new dir for test results (results - files with test results used by CI tools)
