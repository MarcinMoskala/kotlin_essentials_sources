package f_11_data_classes.s_5

data class Player(
   val id: Int,
   val name: String,
   val points: Int
)

fun main() {
   val player = Player(0, "Gecko", 9999)
   println(player) 
   // Player(id=0, name=Gecko, points=9999)
   println("Player: $player")
   // Player: Player(id=0, name=Gecko, points=9999)
}
