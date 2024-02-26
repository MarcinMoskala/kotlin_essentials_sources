package f_10_inheritance.s_6

abstract class Mammal {
   val haveHairOrFur = true
   val warmBlooded = true
   var canFeed = false

   fun feedYoung() {
       if (canFeed) {
           println("Feeding young with milk")
       }
   }
}
