package maxwell.eduardo.digionebank.teste

import maxwell.eduardo.digionebank.ReportPrint
import maxwell.eduardo.digionebank.model.Manager

fun main() {
    val maxwell = Manager(name = "Eduardo Maxwell", idNumeber = "012.123.123-01", salary = 3500.0)
    ReportPrint.report(maxwell)
}
