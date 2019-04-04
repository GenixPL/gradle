import com.genix.Greeting

// apply<org.example.greeting.GreetingPlugin>() //it can be changed to "id" in plugins after creation of META-INF
plugins {
  id("com.genix")
}

tasks.getByName<Greeting>("hello") { 
    message = "Hi"
    recipient = "Gradle"
}
