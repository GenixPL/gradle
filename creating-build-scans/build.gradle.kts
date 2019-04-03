plugins {
    //it should always be placed as first plugin
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
    mainClassName = "com.genix.gradle.AppKt"
}

//other buildScan properties: https://docs.gradle.com/build-scan-plugin/
buildScan {
    //it automagically accepts agreement
    termsOfServiceUrl = "https://gradle.com/terms-of-service"
    termsOfServiceAgree = "yes"

    //it automagically add '--scan' to all gradle tasks
    publishAlways()
}
