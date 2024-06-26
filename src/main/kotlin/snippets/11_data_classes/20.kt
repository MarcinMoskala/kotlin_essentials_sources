package f_11_data_classes.s_20

fun String.parseName(): Pair<String, String>? {
   val indexOfLastSpace = this.trim().lastIndexOf(' ')
   if (indexOfLastSpace < 0) return null
   val firstName = this.take(indexOfLastSpace)
   val lastName = this.drop(indexOfLastSpace)
   return Pair(firstName, lastName)
}

fun main() {
  val fullName = "Marcin Moskała"
  val (firstName, lastName) = fullName.parseName() ?: return
}
