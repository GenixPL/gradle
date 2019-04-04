plugins {
    java
    application
}

application {
    mainClassName = "Main"
}

repositories { //specify repos
    jcenter()
}

dependencies {
    implementation("com.github.lalyos:jfiglet:0.0.8")
}