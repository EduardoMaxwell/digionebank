package maxwell.eduardo.digionebank.teste

import maxwell.eduardo.digionebank.enum.CostumerType

fun main() {
    CostumerType.values().forEach {
        println("${it.name} - ${it.description}")
    }

    val pf = CostumerType.PF
    println("${pf.name} - ${pf.description}")
}