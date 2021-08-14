package one.digitalinovattion.testes

import one.digitalinovattion.Gerente


fun main() {

    val sabrina = Gerente("Sabrina de Sousa", "123.123.123-21", 5000.0, "Sabrina1998")
    ImprimeRelatorioFuncionario.imprime(sabrina)

    TesteAutenticacao().autentica(sabrina)

}


