package kvp.van.springboot.van

class Van(
    val username: String,
    val password: String
) {

    override fun toString(): String {
        return "Van(username='$username', password='$password')"
    }
}