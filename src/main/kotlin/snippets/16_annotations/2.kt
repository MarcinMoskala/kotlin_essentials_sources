package f_16_annotations.s_2

annotation class Factory
annotation class FactoryFunction(val name: String)

@Factory
class CarFactory {

    @FactoryFunction(name = "toyota")
    fun makeToyota(): Car = Toyota()

    @FactoryFunction(name = "skoda")
    fun makeSkoda(): Car = Skoda()
}

abstract class Car
class Toyota : Car()
class Skoda : Car()
