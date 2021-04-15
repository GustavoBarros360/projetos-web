package one.digitalinnovation.collections

fun main(){
    val names = Array(3){""}
    names[0] = "Maria"
    names[1] = "Zé"
    names[2] = "José"

    for (name in names){
        println(name)
    }

    makeLine()

    names.sort()
    names.forEach { println(it) }

    makeLine()

    val names2 = arrayOf("Maria", "Pedro", "Ana")

    names2.sort()
    names2.forEach { println(it) }
}