package kvp.van.springboot

import kvp.van.springboot.account.Account
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.data.mongodb.core.MongoTemplate

@SpringBootApplication
class SpringbootMongodbApplication(
    val mongoTemplate: MongoTemplate
) {
    @Bean
    fun runner() : ApplicationRunner {
        return ApplicationRunner {
            run {
                val account = Account(username = "van", email = "van@van.com")
                mongoTemplate.insert(account)
                println("finished")
            }
        }
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(SpringbootMongodbApplication::class.java, *args)
}