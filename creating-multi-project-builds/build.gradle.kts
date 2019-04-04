plugins {
    id("org.jetbrains.kotlin.jvm").version("1.3.20")

    application

     id("org.asciidoctor.convert") version "1.5.6" apply false //The use of apply false adds the plugin to the overall project, but does not add it to the root project.

}

subprojects {
    version = "1.0"
}

allprojects {
    repositories {
        jcenter()
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

application {
    mainClassName = "com.genix.AppKt"
}

configure(subprojects.filter { it.name == "greeter" || it.name == "greeting-library" }) { //moving sub-project's build.gradle here

    apply(plugin = "groovy")

    dependencies {
        "testCompile"("org.spockframework:spock-core:1.0-groovy-2.4") {
            exclude(module = "groovy-all")
        }
    }
}