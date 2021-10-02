package maxwell.eduardo.digionebank.model

import maxwell.eduardo.digionebank.LoginService

class Manager(
    name: String,
    idNumeber: String,
    salary: Double,
    val password: String
) : Employee(name, idNumeber, salary), LoginService {
    override fun calculate(): Double = salary * 0.4

    override fun login(): Boolean = "pass123" == password
}