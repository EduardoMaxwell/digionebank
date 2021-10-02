package maxwell.eduardo.digionebank.model

import java.math.BigDecimal

class Analyst(
    name: String,
    idNumeber: String,
    salary: Double
) : Employee(name, idNumeber, salary) {
    override fun calculate() = salary * 0.1
}