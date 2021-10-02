package maxwell.eduardo.digionebank.teste

import maxwell.eduardo.digionebank.ReportPrint
import maxwell.eduardo.digionebank.model.Analyst
import maxwell.eduardo.digionebank.model.Employee

fun main() {
    val eduardo = Analyst(name = "Eduardo Maxwell", idNumeber = "012.123.123-01", salary = 4180.0)
    ReportPrint.report(eduardo)
}
