package kvp.van.springboot.account


import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest

@DataJpaTest
class AccountRepositoryTest(
    @Autowired
    private val accountRepository: AccountRepository
) {
    @Test
    fun saveTest() {
        val account = Account(username = "van", password = "aaa")
        accountRepository.save(account)

        println(account.id)
        assertThat(account.id).isGreaterThan(0L)
    }
}