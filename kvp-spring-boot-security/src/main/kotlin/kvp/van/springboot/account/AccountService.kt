package kvp.van.springboot.account

import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service

@Service
class AccountService(
    val accountRepository: AccountRepository,
    val passwordEncoder: PasswordEncoder
) : UserDetailsService {
    fun create(username: String, password: String) {
        val account = Account(username = username, password = passwordEncoder.encode(password))
        accountRepository.save(account)
    }

    override fun loadUserByUsername(username: String?): UserDetails {
        val account = username?.let {
            accountRepository.findByUsername(it)
        } ?: throw UsernameNotFoundException("error")

        return User(account.username, account.password, authorities())
    }

    private fun authorities(): List<SimpleGrantedAuthority> = listOf(SimpleGrantedAuthority("ROLE_USER"))
}