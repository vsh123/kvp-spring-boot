package kvp.van.springboot

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.stereotype.Component
import org.springframework.util.StopWatch

@Component
class RestTemplateRunner(
    private val restTemplateBuilder: RestTemplateBuilder
) : ApplicationRunner {

    override fun run(args: ApplicationArguments?) {
        val restTemplate = restTemplateBuilder.build()
        val stopWatch = StopWatch()
        stopWatch.start()

        val result = restTemplate.getForObject("http://localhost:8080/hello", String::class.java)
        println(result)
        val hi = restTemplate.getForObject("http://localhost:8080/hi", String::class.java)
        println(hi)

        stopWatch.stop()
        println(stopWatch.prettyPrint())
    }
}