package f_10_inheritance.s_6

class User(val id: Int, val name: String)

interface UserRepository {
    fun findUser(id: Int): User?
    fun addUser(user: User)
}

class FakeUserRepository : UserRepository {
    private var users = mapOf<Int, User>()

    override fun findUser(id: Int): User? = users[id]

    override fun addUser(user: User) {
        users += user.id to user
    }
}

fun main() {
    val repo: UserRepository = FakeUserRepository()
    repo.addUser(User(123, "Zed"))
    val user = repo.findUser(123)
    println(user?.name) // Zed
}
