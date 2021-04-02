package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Pessoa

fun main(){
    val gustavo = Pessoa(name = "Gustavo Barros", cpf = "46220922808")

    println("Nome: ${gustavo.name} \nCPF: ${gustavo.cpf}")

}