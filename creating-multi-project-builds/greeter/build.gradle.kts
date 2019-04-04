//commented code was moved to root-project build.gradle

plugins {
    // groovy     
    application 
}

application {
    mainClassName = "greeter.Greeter" 
}

dependencies {
    compile(project(":greeting-library")) 

    // testCompile("org.spockframework:spock-core:1.0-groovy-2.4") {
    //     exclude(module = "groovy-all")
    // }
}

tasks.distZip {
    from(project(":docs").tasks["asciidoctor"]) { 
        into("${project.name}-$version")
    }
}

tasks.distTar {
    from(project(":docs").tasks["asciidoctor"]) {
        into("${project.name}-$version")
    }
}