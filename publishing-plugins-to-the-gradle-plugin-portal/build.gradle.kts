
version = "0.1"

plugins {
    `java-gradle-plugin` 
    id("com.gradle.plugin-publish") version "0.10.1"  
}

// pluginBundle {
//     website = "<substitute your project website>" 
//     vcsUrl = "<uri to project source repository>" 
//     tags = listOf("tags", "for", "your", "plugins") 
// }

// gradlePlugin {
//     plugins { 
//         create("greetingsPlugin") { 
//             id = "<your plugin identifier>" 
//             displayName = "<short displayable name for plugin>" 
//             description = "<Good human-readable description of what your plugin is about>" 
//             implementationClass = "<your plugin class>"
//         }
//     }
// }

pluginBundle {
    // please change these URLs to point to your own website/repository
    website = "http://www.gradle.org/"
    vcsUrl = "https://github.com/GenixPL/gradle"
    tags = listOf("example", "template")
}

gradlePlugin {
    plugins {
        create("greetingsPlugin") {
            id = "com.genix"
            displayName = "Greeting Plugin"
            description = "Template for people to start their own plugin adventure"
            implementationClass = "com.genix.GreetingPlugin"
        }
    }
}