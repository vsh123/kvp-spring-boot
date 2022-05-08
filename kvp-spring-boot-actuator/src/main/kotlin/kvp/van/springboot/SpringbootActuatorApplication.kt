package kvp.van.springboot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringbootActuatorApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringbootActuatorApplication::class.java, *args)
}