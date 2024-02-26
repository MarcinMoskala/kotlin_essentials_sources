package f_11_data_classes.s_3

data class Player(
   val id: Int,
   val name: String,
   val points: Int
)

val player = Player(0, "Gecko", 9999)
