package f_11_data_classes.s_18

data class FullName(
   val firstName: String,
   val lastName: String
)

fun String.parseName(): FullName? {
   val indexOfLastSpace = this.trim().lastIndexOf(' ')
   if (indexOfLastSpace < 0) return null
   val firstName = this.take(indexOfLastSpace)
   val lastName = this.drop(indexOfLastSpace)
   return FullName(firstName, lastName)
}

// Usage
fun main() {
  val fullName = "Marcin Moskała"
  val (firstName, lastName) = fullName.parseName() ?: return
  print("His name is $firstName $lastName") 
  // His name is Marcin Moskała
}
