package kvp.van.springboot

import de.codecentric.boot.admin.server.config.EnableAdminServer
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
@EnableAdminServer
class SpringbootAdminApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringbootAdminApplication::class.java, *args)
}