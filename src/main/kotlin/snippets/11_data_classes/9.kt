package f_11_data_classes.s_9

data class Player(
   val id: Int,
   val name: String,
   val points: Int
)

fun main() {
   val p = Player(0, "Gecko", 9999)

   println(p.copy()) // Player(id=0, name=Gecko, points=9999)

   println(p.copy(id = 1, name = "New name"))
   // Player(id=1, name=New name, points=9999)

   println(p.copy(points = p.points + 1))
   // Player(id=0, name=Gecko, points=10000)
}
