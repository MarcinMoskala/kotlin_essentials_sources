package f_10_inheritance.s_9

interface Boat {
   fun start() {
       println("Ready to swim")
   }
}

interface Car {
   fun start() {
       println("Ready to drive")
   }
}

class Amphibian: Car, Boat {
   override fun start() {
       super<Car>.start()
       super<Boat>.start()
   }
}

fun main() {
   val vehicle = Amphibian()
   vehicle.start()
   // Ready to drive
   // Ready to swim
}
