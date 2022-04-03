package kvp.van.springboot.van

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
class VanController {

    @GetMapping("van")
    fun van(): String = "van"

    @GetMapping("van/error")
    fun vanError(): Unit = throw RuntimeException("에러입니다.")

    @CrossOrigin(origins = ["http://localhost:8080"])
    @GetMapping("cors")
    fun cors(): String = "cors"

    @ExceptionHandler(Exception::class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    fun vanControllerErrorHandling(e: Exception): String = "van 에러 핸들링 ${e.message}"
}