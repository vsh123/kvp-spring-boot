package kvp.van.springboot.configure

import kvp.van.springboot.account.AccountService
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class AccountRunner(
    private val accountService: AccountService
) : ApplicationRunner {
    override fun run(args: ApplicationArguments?) {
        accountService.create("van", "van")
    }
}