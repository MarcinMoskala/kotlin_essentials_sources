package f_11_data_classes.s_14

fun main() {
   val visited = listOf("Spain", "Morocco", "India")
   val (first, second, third) = visited
   println("$first $second $third")
   // Spain Morocco India

   val trip = mapOf(
       "Spain" to "Gran Canaria",
       "Morocco" to "Taghazout",
       "India" to "Rishikesh"
   )
   for ((country, city) in trip) {
       println("We loved $city in $country")
       // We loved Gran Canaria in Spain
       // We loved Taghazout in Morocco
       // We loved Rishikesh in India
   }
}
