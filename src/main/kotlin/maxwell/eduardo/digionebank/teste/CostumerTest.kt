package maxwell.eduardo.digionebank.teste

import maxwell.eduardo.digionebank.Authentication
import maxwell.eduardo.digionebank.enum.CostumerType
import maxwell.eduardo.digionebank.model.Costumer

fun main() {
    val jose = Costumer(
        "Jose",
        "123123",
        CostumerType.PF,
        "1231"
    )

    println(jose)
    Authentication().auth(jose)
}
