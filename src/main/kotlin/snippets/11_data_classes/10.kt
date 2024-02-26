package f_11_data_classes.s_10

data class StudentGrades(
   val studentId: String,
   // Code smell: Avoid using mutable objects in data classes
   val grades: MutableList<Int>
)

fun main() {
   val grades1 = StudentGrades("1", mutableListOf())
   val grades2 = grades1.copy(studentId = "2")
   println(grades1) // Grades(studentId=1, grades=[])
   println(grades2) // Grades(studentId=2, grades=[])
   grades1.grades.add(5)
   println(grades1) // Grades(studentId=1, grades=[5])
   println(grades2) // Grades(studentId=2, grades=[5])
   grades2.grades.add(1)
   println(grades1) // Grades(studentId=1, grades=[5, 1])
   println(grades2) // Grades(studentId=2, grades=[5, 1])
}
