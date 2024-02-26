package f_10_inheritance.s_7

class User(val id: Int, val name: String)

interface UserRepository {
    fun findUser(id: Int): User? =
        getUsers().find { it.id == id }

    fun getUsers(): List<User>
}

class FakeUserRepository : UserRepository {
    private var users = listOf<User>()

    override fun getUsers(): List<User> = users

    fun addUser(user: User) {
        users += user
    }
}

fun main() {
    val repo = FakeUserRepository()
    repo.addUser(User(123, "Zed"))
    val user = repo.findUser(123)
    println(user?.name) // Zed
}
