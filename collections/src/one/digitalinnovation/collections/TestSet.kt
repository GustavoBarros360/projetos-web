package one.digitalinnovation.collections

fun main(){
    val joao = Funcionario("João", 7000.0, "CLT")
    val maria = Funcionario("Maria", 1100.0, "PJ")
    val jose = Funcionario("Jose", 3050.0, "CLT")

    val funcionarios1 = setOf(joao, jose)
    val funcionarios2 = setOf(maria)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    makeLine()
    val funcionarios3 = setOf(joao, maria, jose)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    makeLine()
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }
}