package kvp.van.springboot.config

import org.springframework.boot.web.reactive.function.client.WebClientCustomizer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class WebClientConfiguration {

    @Bean
    fun webClientCustomizer(): WebClientCustomizer {
        return WebClientCustomizer { it.baseUrl("http://localhost:8080") }
    }
}