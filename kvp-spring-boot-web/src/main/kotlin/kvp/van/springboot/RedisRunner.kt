package kvp.van.springboot

import kvp.van.springboot.account.AccountHash
import kvp.van.springboot.account.AccountHashRepository
import kvp.van.springboot.van.Van
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.data.redis.core.StringRedisTemplate
import org.springframework.stereotype.Component

@Component
class RedisRunner(
    private val redisTemplate: StringRedisTemplate,
    private val accountHashRepository: AccountHashRepository
): ApplicationRunner {

    override fun run(args: ApplicationArguments?) {
        val opsForValue = redisTemplate.opsForValue()
        opsForValue.set("1", "2")
        opsForValue.set("3", "4")
        opsForValue.set("5", "6")

        val accountHash = AccountHash("van", "test")
        accountHashRepository.save(accountHash)

        println("${accountHash.id} and ${accountHash.username} and ${accountHash.password}")
    }
}