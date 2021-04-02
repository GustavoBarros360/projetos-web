package one.digitalinnovation.digionebank

class Gerente(
    name: String,
    cpf: String,
    salary: Double
) : Funcionario(name, cpf, salary) {
    override fun calculoAuxilio(): Double {
        return salary*0.4
    }

}