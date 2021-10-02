package maxwell.eduardo.digionebank.model

class Manager(name: String, idNumeber: String, salary: Double) : Employee(name, idNumeber, salary) {
    override fun calculate(): Double = salary * 0.4
}