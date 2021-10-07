package one.digitalinnovation.collections

fun main(){
    val joao = Funcionario("João", 7000.0, "CLT")
    val maria = Funcionario("Maria", 1100.0, "PJ")
    val jose = Funcionario("Jose", 3050.0, "CLT")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    makeLine()

    funcionarios.add(jose)
    funcionarios.forEach { println(it) }

    makeLine()

    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    makeLine()
    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.forEach { println(it) }

    makeLine()
    funcionariosSet.add(jose)
    funcionariosSet.add(maria)
    funcionariosSet.forEach { println(it) }

    makeLine()
    funcionariosSet.remove(maria)
    funcionariosSet.forEach { println(it) }
}