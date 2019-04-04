import org.asciidoctor.gradle.AsciidoctorTask

plugins {
    id("org.asciidoctor.convert")       
}

tasks.asciidoctor {
    sources(delegateClosureOf<PatternSet> {
        include("greeter.adoc")         
    })
}

tasks.build { dependsOn(tasks.asciidoctor) }