package maxwell.eduardo.digionebank

class Authentication {
    fun auth(loginService: LoginService) = println(loginService.login())
}