package kvp.van.springboot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringbootNeo4jApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringbootNeo4jApplication::class.java, *args)
}