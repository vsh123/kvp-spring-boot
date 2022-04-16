package kvp.van.springboot.account

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository

interface AccountHashRepository : CrudRepository<AccountHash, String>