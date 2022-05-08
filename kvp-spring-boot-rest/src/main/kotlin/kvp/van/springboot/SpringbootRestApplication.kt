package kvp.van.springboot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringbootRestApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringbootRestApplication::class.java, *args)
}