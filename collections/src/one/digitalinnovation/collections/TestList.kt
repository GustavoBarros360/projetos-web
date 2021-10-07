package one.digitalinnovation.collections

fun main(){
    val joao = Funcionario("João", 7000.0, "CLT")
    val maria = Funcionario("Maria", 1100.0, "PJ")
    val jose = Funcionario("Jose", 3050.0, "CLT")

    val funcionarios = listOf(joao, maria, jose)

    funcionarios.forEach{ println(it) }

    makeLine()

    println(funcionarios.find { it.nome == "Maria" })

    makeLine()
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    makeLine()
    funcionarios
        .groupBy { it.tipoContrato }
        .forEach { println(it) }
}



