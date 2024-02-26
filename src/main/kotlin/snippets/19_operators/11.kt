package f_19_operators.s_11

fun main() {
    val mutableList = mutableListOf("A", "B", "C")
    println(mutableList[1]) // B
    mutableList[2] = "D"
    println(mutableList) // [A, B, D]

    val animalFood = mutableMapOf(
        "Dog" to "Meat",
        "Goat" to "Grass"
    )
    println(animalFood["Dog"]) // Meat
    animalFood["Cat"] = "Meat"
    println(animalFood["Cat"]) // Meat
}
