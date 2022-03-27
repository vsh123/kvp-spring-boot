package kvp.van.springboot.van

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class VanController {

    @GetMapping("van")
    fun van(): String = "van"
}