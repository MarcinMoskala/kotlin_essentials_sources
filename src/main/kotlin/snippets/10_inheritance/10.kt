package f_10_inheritance.s_10

interface Named {
    val name: String
    val fullName: String
}

class User(
    override val name: String,
    val surname: String,
) : Named {
    override val fullName: String
        get() = "$name $surname"
}
