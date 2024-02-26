package f_11_data_classes.s_12

data class User(
   val name: String,
   val surname: String,
) {
   init {
       require(name.isNotBlank())
       // throws exception if name is blank
       require(surname.isNotBlank())
       // throws exception if surname is blank
   }
}
