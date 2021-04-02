package one.digitalinnovation.digionebank

import java.math.BigDecimal

class Analista(name: String, cpf:String, salary: Double) :
    Funcionario(name, cpf, salary) {
    override fun calculoAuxilio(): Double {
        return salary*0.1
    }


}

