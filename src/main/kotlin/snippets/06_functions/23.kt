package f_06_functions.s_23

fun printName(
    name: String,
    surname: String, // <- trailing comma
) {
    println("$name $surname")
}

fun main() {
    printName(
        name = "Norbert",
        surname = "Moskała", // <- trailing comma
    )
}
