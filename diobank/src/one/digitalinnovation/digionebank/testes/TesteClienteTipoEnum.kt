package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main(){
    ClienteTipo.values().forEach { elemento ->
        println(elemento.name + " " + elemento.descricao)
    }

    val clientePF = ClienteTipo.PF

    println("${clientePF.name} - ${clientePF.descricao}")
}