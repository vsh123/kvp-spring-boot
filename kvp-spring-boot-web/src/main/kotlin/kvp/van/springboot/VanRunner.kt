package kvp.van.springboot

import kvp.van.springboot.van.Van
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class VanRunner(val van: Van): ApplicationRunner {
    private val logger: Logger = LoggerFactory.getLogger("kvp.van")

    override fun run(args: ApplicationArguments?) {
        logger.debug("hello!! debug!")
        logger.info("hello!! info!")
        println("van age : ${van.age}, name : ${van.name}" )
    }
}