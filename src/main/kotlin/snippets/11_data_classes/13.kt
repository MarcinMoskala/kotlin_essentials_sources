package f_11_data_classes.s_13

data class Player(
   val id: Int,
   val name: String,
   val points: Int
)

fun main() {
   val player = Player(0, "Gecko", 9999)
   val (id, name, pts) = player
   println(id) // 0
   println(name) // Gecko
   println(pts) // 9999
}
