package kvp.van.springboot.van

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class VanConfiguration {
    @Bean
    @ConfigurationProperties("van")
    @ConditionalOnMissingBean
    fun van(): Van {
        return Van()
    }
}