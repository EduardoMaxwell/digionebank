package maxwell.eduardo.digionebank.model

abstract class Employee(
    name: String,
    idNumeber: String,
    val salary: Double
) : Person(name, idNumeber) {

    protected abstract fun calculate(): Double

    override fun toString(): String = """
        Name: $name
        Id Number: $idNumeber
        Salary: $salary
        Auxily: ${calculate()}
    """.trimIndent()
}