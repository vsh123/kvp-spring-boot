package kvp.van.springboot.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.lang.Thread.sleep

@RestController
class SpringRestController {

    @GetMapping("/hello")
    fun hello(): String {
        sleep(5000L)
        return "hello"
    }

    @GetMapping("/hi")
    fun hi(): String {
        sleep(3000L)
        return "hi"
    }
}