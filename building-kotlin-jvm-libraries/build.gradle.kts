import org.gradle.jvm.tasks.Jar

plugins {
    `build-scan`
    `maven-publish`
    kotlin("jvm") version "1.3.21"
    id("org.jetbrains.dokka") version "0.9.17" //documentation engine
}

group = "com.genix"
version = "0.0.1"

repositories {
    jcenter() 
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("junit:junit:4.12")
}

buildScan {
    termsOfServiceUrl = "https://gradle.com/terms-of-service" 
    termsOfServiceAgree = "yes"

    publishAlways() 
}

//more options: https://github.com/Kotlin/dokka#using-dokka
tasks.dokka {    
    outputFormat = "html"
    outputDirectory = "$buildDir/javadoc"
}

val dokkaJar by tasks.creating(Jar::class) { 
    group = JavaBasePlugin.DOCUMENTATION_GROUP
    description = "Assembles Kotlin docs with Dokka"
    classifier = "javadoc"
    from(tasks.dokka) 
}

// configure Maven publication
publishing {
    publications {
        create<MavenPublication>("default") { 
            from(components["java"])
            artifact(dokkaJar)
        }
    }

    repositories {
        maven {
            url = uri("$buildDir/repository") 
        }
    }
}



