package one.digitalinnovation.collections

fun main(){
    val salarios = DoubleArray(3)

    salarios[0] = 1000.0
    salarios[1] = 7000.0
    salarios[2] = 5500.5

    for (salario in salarios) {
        println(salario)
    }

    makeLine()

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }

    salarios.sort()
    salarios.forEach { println(it) }

    makeLine()

    val salarios2 = doubleArrayOf(1500.0, 1250.0, 5000.0)

    salarios2.sort()
    salarios2.forEach { println(it) }

}