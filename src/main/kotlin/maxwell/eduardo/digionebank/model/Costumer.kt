package maxwell.eduardo.digionebank.model

import maxwell.eduardo.digionebank.LoginService
import maxwell.eduardo.digionebank.enum.CostumerType

class Costumer(
    name: String,
    idNumeber: String,
    val costumerType: CostumerType,
    val password: String
) : Person(name, idNumeber), LoginService {

    override fun login(): Boolean = "123" == password

    override fun toString(): String = """
        Name: $name
        Id Number: $idNumeber
        Costumer Type: ${costumerType.description}
   
    """.trimIndent()
}