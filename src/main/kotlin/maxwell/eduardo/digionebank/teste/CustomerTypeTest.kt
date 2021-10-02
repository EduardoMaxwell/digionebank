package maxwell.eduardo.digionebank.teste

import maxwell.eduardo.digionebank.enum.CustomerType

fun main() {
    CustomerType.values().forEach {
        println("${it.name} - ${it.description}")
    }

    val pf = CustomerType.PF
    println("${pf.name} - ${pf.description}")
}