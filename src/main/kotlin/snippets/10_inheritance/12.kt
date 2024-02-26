package f_10_inheritance.s_12

interface Drinkable {
    fun drink()
}

interface Spillable {
    fun spill()
}

class Mug : Drinkable, Spillable {
    override fun drink() {
        println("Ummm")
    }
    override fun spill() {
        println("Ow, ow, OWWW")
    }
}
