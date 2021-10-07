package one.digitalinnovation.digionebank

import java.math.BigDecimal

abstract class Funcionario(
    name: String,
    cpf: String,
    val salary: Double
) : Pessoa(name, cpf) {
    protected abstract fun calculoAuxilio():Double

    override fun toString(): String {
        return """
            Nome: ${name}
            CPF: ${cpf}
            Salário: ${salary}
            Auxílio: ${calculoAuxilio()}
        """.trimIndent()

    }
}