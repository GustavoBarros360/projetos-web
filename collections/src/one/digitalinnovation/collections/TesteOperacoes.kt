package one.digitalinnovation.collections

fun main(){
    val salarios = doubleArrayOf(1004.0, 1500.0, 4000.0)

    for (salario in salarios){
        println(salario)
    }

    makeLine()

    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Média salario: ${salarios.average()}")

    makeLine()

    val salariosMaiorQue = salarios.filter {
        it > 1100.0
    }
    salariosMaiorQue.forEach{ println(it) }
}