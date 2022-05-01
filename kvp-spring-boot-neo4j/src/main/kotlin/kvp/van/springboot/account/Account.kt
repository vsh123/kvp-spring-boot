package kvp.van.springboot.account

import org.springframework.data.neo4j.core.schema.GeneratedValue
import org.springframework.data.neo4j.core.schema.Id
import org.springframework.data.neo4j.core.schema.Node
import org.springframework.data.neo4j.core.schema.Relationship

@Node
class Account(
    @Id
    @GeneratedValue
    private var id: Long? = null,
    val username: String,
    val email: String,
    @Relationship(type = "has")
    private val roles : MutableSet<Role> = HashSet()
) {

    fun addRole(role:Role) {
        roles.add(role)
    }

}