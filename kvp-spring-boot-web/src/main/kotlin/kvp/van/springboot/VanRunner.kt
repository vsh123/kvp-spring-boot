package kvp.van.springboot

import kvp.van.springboot.van.Van
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class VanRunner(val van: Van): ApplicationRunner {
    override fun run(args: ApplicationArguments?) {
        println("van age : ${van.age}, name : ${van.name}" )
    }
}