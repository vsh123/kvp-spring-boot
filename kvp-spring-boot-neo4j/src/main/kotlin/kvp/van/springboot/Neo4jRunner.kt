package kvp.van.springboot

import kvp.van.springboot.account.Account
import kvp.van.springboot.account.AccountRepository
import kvp.van.springboot.account.Role
import org.neo4j.driver.Driver
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class Neo4jRunner(val accountRepository: AccountRepository) : ApplicationRunner {
    override fun run(args: ApplicationArguments?) {
        val account = Account(username ="van", email = "email")
        val role = Role(name = "role")
        account.addRole(role)

        accountRepository.save(account)
    }
}