package f_19_operators.s_16

fun main() {
    val names = mutableListOf("Jake", "Ben")
    names += "Jon"
    names -= "Ben"
    println(names) // [Jake, Jon]

    val tools = mutableMapOf(
        "Grass" to "Lawnmower",
        "Nail" to "Hammer"
    )
    tools += "Screw" to "Screwdriver"
    tools -= "Grass"
    println(tools) // {Nail=Hammer, Screw=Screwdriver}
}
