package f_11_data_classes.s_6

data class Player(
   val id: Int,
   val name: String,
   val points: Int
)

fun main() {
   val player = Player(0, "Gecko", 9999)
   println(player == Player(0, "Gecko", 9999)) // true
   println(player == Player(0, "Ross", 9999)) // false
}
