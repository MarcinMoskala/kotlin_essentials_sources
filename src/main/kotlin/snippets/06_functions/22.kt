package f_06_functions.s_22

fun makeUser(
    name: String,
    surname: String,
): User = User(
    name = name,
    surname = surname,
)

class User(
    val name: String,
    val surname: String,
)

fun main() {
    val user = makeUser(
        name = "Norbert",
        surname = "Moskała",
    )

    val characters = listOf(
        "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
        "K", "L", "M", "N", "O", "P", "R", "S", "T", "U",
        "W", "X", "Y", "Z",
    )
}
