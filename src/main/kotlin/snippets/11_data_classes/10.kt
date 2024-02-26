package f_11_data_classes.s_10

data class StudentGrades(
   val studentId: String,
   val grades: List<Int>
)

fun main() {
   var grades1 = StudentGrades("1", listOf())
   var grades2 = grades1.copy(studentId = "2")
   println(grades1) // Grades(studentId=1, grades=[])
   println(grades2) // Grades(studentId=2, grades=[])
   grades1 = grades1.copy(grades = grades1.grades + 5)
   println(grades1) // Grades(studentId=1, grades=[5])
   println(grades2) // Grades(studentId=2, grades=[])
   grades2 = grades2.copy(grades = grades2.grades + 1)
   println(grades1) // Grades(studentId=1, grades=[5])
   println(grades2) // Grades(studentId=2, grades=[1])
}
