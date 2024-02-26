package f_11_data_classes.s_8

data class Player(
   val id: Int,
   val name: String,
   val points: Int
)

fun main() {
   println(Player(0, "Gecko", 9999).hashCode()) // 2129010918
   println(Player(0, "Gecko", 9999).hashCode()) // 2129010918
   println(Player(0, "Ross", 9999).hashCode())  // 79159602
}
