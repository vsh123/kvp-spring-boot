package kvp.van.springboot.account

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "accounts")
class Account(
    val username: String,
    val email: String
) {
    @Id
    var id: String? = null
}