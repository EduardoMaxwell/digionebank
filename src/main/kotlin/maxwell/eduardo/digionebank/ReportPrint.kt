package maxwell.eduardo.digionebank

import maxwell.eduardo.digionebank.model.Employee

class ReportPrint {
    companion object {
        fun report(employee: Employee) {
            println(employee.toString())
        }
    }
}