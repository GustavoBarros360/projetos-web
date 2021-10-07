package one.digitalinnovation.collections

fun main(){
    val salarios = doubleArrayOf(1004.0, 1500.0, 4000.0)

    for (salario in salarios){
        println(salario)
    }

    makeLine()

    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Média salarial: ${salarios.average()}")

    makeLine()

    val salariosMaiorQue = salarios.filter {
        it > 1100.0
    }
    salariosMaiorQue.forEach{ println(it) }

    makeLine()

    println(salarios.count{ it in 2000.0..5000.0})

    makeLine()
    println(salarios.find{ it == 4000.0})
    println(salarios.find{ it == 4040.0})

    makeLine()
    println(salarios.any{ it < 1000.0})
}