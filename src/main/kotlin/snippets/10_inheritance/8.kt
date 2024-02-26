package f_10_inheritance.s_8

abstract class CoffeeMachine {
    abstract fun prepareEspresso()
    abstract fun addMilk()

    fun prepareLatte() {
        prepareEspresso()
        addMilk()
    }
    fun prepareDoppio() {
        prepareEspresso()
        prepareEspresso()
    }
}
