package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main(){
    val joao = Analista(name = "João", cpf = "123456"
    , salary = 2000.0)

    printInfo(joao)
}

fun printInfo(funcionario: Funcionario) = println(funcionario.toString())