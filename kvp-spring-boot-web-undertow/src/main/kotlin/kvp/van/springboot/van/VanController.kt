package kvp.van.springboot.van

import org.slf4j.LoggerFactory
import org.springframework.hateoas.EntityModel
import org.springframework.hateoas.Link
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
class VanController {
    private val userLogger = LoggerFactory.getLogger("kvp.van.user")

    @GetMapping("hello")
    fun hello(): String? {
        return "hello"
    }

    @GetMapping("hateoas")
    fun hateoas(): EntityModel<Hateoas> {
        val hateoas = Hateoas("prefix", "name")
        return EntityModel.of(hateoas, Link.of("hateoas"))
    }

    @PostMapping("/users/create")
    @ResponseStatus(HttpStatus.CREATED)
    fun user(@RequestBody van: Van): Van {
        userLogger.info("createUser {}", van)
        return van
    }
}