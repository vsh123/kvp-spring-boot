package kvp.van.springboot.account

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest

@DataMongoTest
class AccountRepositoryTest(
    @Autowired
    val accountRepository: AccountRepository
) {

    @Test
    fun test() {
        val account = Account("van", "email")
        accountRepository.save(account)

        accountRepository.findById(account.id!!)
        val result = accountRepository.findByEmail(account.email)

        assertThat(result?.id).isNotNull
        assertThat(result?.email).isEqualTo("email")
    }
}