package kvp.van.springboot.van

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.test.web.reactive.server.WebTestClient

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class VanControllerTest(
    @Autowired private val restTemplate: TestRestTemplate,
    @Autowired private val webClient: WebTestClient
){


    @Test
    internal fun restTemplateTest() {
        val result = restTemplate.getForObject("/van", String::class.java)

        assertThat(result).isEqualTo("van")
    }


    @Test
    internal fun webClientTest() {
        webClient.get().uri("/van")
            .exchange()
            .expectStatus().isOk
            .expectBody(String::class.java)
            .isEqualTo("van")
    }
}