package one.digitalinnovation.digionebank

class Pessoa {
    var name:String = "Gustavo"

    var cpf:String = "46220922808"
    private set

    constructor()

    fun personInfo():String{
        return "Nome: $name \nCPF: $cpf"
    }
}

fun main(){
    val gustavo = Pessoa()

    println(gustavo.personInfo())

}