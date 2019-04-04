// tasks.register("hello") { 
//     group = "Welcome"
//     description = "Produces a greeting"
    
//     dependsOn("printLine")
//     doLast {
//         println("Hello, World!")
//     }
// }

tasks.register("printLine") {
    group = "Printing"
    description = "Prints empty line"

    doLast {
        println();
    }
}

//creates new task type
open class Greeting: DefaultTask() {  
    // we specify fields
    lateinit var message: String   
    lateinit var recipient: String
    lateinit var mine: String

    @TaskAction 
    fun sayGreeting() {
        println("$message, $recipient!\t$mine") 
    }
}

//"<Greeting>" specifies task type
tasks.register<Greeting>("hello") { 
    group = "Welcome"
    description = "Produces a world greeting"

    //we init fields
    message = "Hello" 
    recipient = "World"
    mine = "hi"
}

tasks.register<Greeting>("gutenTag") {
    group = "Welcome"
    description = "Produces a German greeting"
    message = "Guten Tag"
    recipient = "Welt"
    mine = "Hallo"
}
