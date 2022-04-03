package kvp.van.springboot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringbootApplication

fun main(args: Array<String>) {
    val springBootApplication = SpringApplication(SpringbootApplication::class.java)
    springBootApplication.run(*args)
}

