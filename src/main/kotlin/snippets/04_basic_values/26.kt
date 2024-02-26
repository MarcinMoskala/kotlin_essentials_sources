package f_04_basic_values.s_26

fun main() {
    val name = "Cookie"
    val surname = "DePies"
    val age = 6

    val fullName = "$name $surname ($age)"
    println(fullName) // Cookie DePies (6)

    val fullNameUpper =
        "${name.uppercase()} ${surname.uppercase()} ($age)"
    println(fullNameUpper) // COOKIE DEPIES (6)

    val description = """
       Name: $name
       Surname: $surname
       Age: $age
   """.trimIndent()
    println(description)
    // Name: Cookie
    // Surname: DePies
    // Age: 6
}
