package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main(){
    val gustavo = Pessoa(name = "Gustavo Barros", cpf = "46220922808")

    println("Nome: ${gustavo.name} \nCPF: ${gustavo.cpf}")

    val joao = Funcionario(name = "João", cpf = "123456", BigDecimal.valueOf(2020))
    println("${joao.name} ${joao.cpf} ${joao.salary}")
}