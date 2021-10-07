package one.digitalinnovation.collections

fun main(){
    val joao = Funcionario("João", 7000.0, "CLT")
    val maria = Funcionario("Maria", 1100.0, "PJ")
    val jose = Funcionario("Jose", 3050.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(jose.nome, jose)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(joao.nome))

    makeLine()

    repositorio.findAll().forEach { println(it) }

    makeLine()

    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }
}