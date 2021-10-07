package one.digitalinnovation.collections

fun main(){
    val values = intArrayOf(2, 4, 6, 10, 7, 5)

    for (value in values) {
        println(value)
    }

    makeLine()

    values.sort()
    values.forEach {
        println(it)
    }
}