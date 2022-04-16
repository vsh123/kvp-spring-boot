package kvp.van.springboot.account

import org.springframework.data.annotation.Id
import org.springframework.data.redis.core.RedisHash

@RedisHash("accounts")
class AccountHash(
    val username: String,
    val password: String
){
    @Id
    var id: String? = null
}