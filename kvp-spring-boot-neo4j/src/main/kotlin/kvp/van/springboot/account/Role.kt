package kvp.van.springboot.account

import org.springframework.data.neo4j.core.schema.GeneratedValue
import org.springframework.data.neo4j.core.schema.Id
import org.springframework.data.neo4j.core.schema.Node

@Node
class Role(
    @Id
    @GeneratedValue
    private var id: Long? = null,
    val name : String
) {
}