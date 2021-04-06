package one.digitalinnovation.digionebank

class Gerente(
    name: String,
    cpf: String,
    salary: Double,
    val senha: String
) : Funcionario(name, cpf, salary), logavel {
    override fun calculoAuxilio(): Double {
        return salary*0.4
    }

    override fun login():Boolean =
        "123456" == senha

}