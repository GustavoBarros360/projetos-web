package one.digitalinnovation.collections

fun main(){
    val values = IntArray(5)

    values[0] = 1
    values[1] = 10
    values[2] = 7
    values[3] = 4
    values[4] = 6

    for (valor in values){
        println(valor)
    }

    makeLine()

    values.forEach { valor ->
        println(valor)
    }

    makeLine()

    for (index in values.indices){
        println(values[index])
    }

    makeLine()

    values.sort()
    for (valor in values){
        println(valor)
    }
}

fun makeLine() = println("-----------")

