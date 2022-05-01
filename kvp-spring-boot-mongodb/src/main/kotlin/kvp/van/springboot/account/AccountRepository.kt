package kvp.van.springboot.account

import org.springframework.data.mongodb.repository.MongoRepository

interface AccountRepository: MongoRepository<Account, String> {
    fun findByEmail(email: String) : Account?
}