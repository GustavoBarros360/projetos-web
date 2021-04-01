package one.digitalinnovation.digionebank

class Pessoa {
    var name:String = "Gustavo"

    var cpf:String = "46220922808"
    private set

}

fun main(){
    val gustavo = Pessoa()
    //gustavo.cpf = "456"
    println(gustavo.name)
    println(gustavo.cpf)


}