package kvp.van.springboot

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.stereotype.Component
import org.springframework.util.StopWatch
import org.springframework.web.reactive.function.client.WebClient

@Component
class WebClientRunner(
    private val webclientBuilder: WebClient.Builder
) : ApplicationRunner {

    override fun run(args: ApplicationArguments?) {
        val webClient = webclientBuilder.build()
        val stopWatch = StopWatch()
        stopWatch.start()

        val helloResult = webClient.get().uri("/hello")
            .retrieve()
            .bodyToMono(String::class.java)
        helloResult.subscribe {
             println(it)

            if (stopWatch.isRunning) {
                stopWatch.stop()
            }
            println(stopWatch.prettyPrint())
            stopWatch.start()
        }

        val hiResult = webClient.get().uri("/hi")
            .retrieve()
            .bodyToMono(String::class.java)
        hiResult.subscribe {
             println(it)

            if (stopWatch.isRunning) {
                stopWatch.stop()
            }
            println(stopWatch.prettyPrint())
            stopWatch.start()
        }

        stopWatch.stop()
        println(stopWatch.prettyPrint())
    }
}