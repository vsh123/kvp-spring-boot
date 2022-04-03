package kvp.van.springboot.van

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Van2Controller {

    @GetMapping("van2")
    fun van2(): Unit = throw RuntimeException("van2 에러입니다.")
}