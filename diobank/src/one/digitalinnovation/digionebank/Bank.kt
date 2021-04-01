package one.digitalinnovation.digionebank

data class Bank(
    val name:String,
    val num:Int
) {
    fun info() = "Nome: $name \nNúmero: $num"
}
