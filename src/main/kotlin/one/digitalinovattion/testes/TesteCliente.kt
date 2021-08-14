package one.digitalinovattion.testes

import one.digitalinovattion.Cliente
import one.digitalinovattion.ClienteTipo

fun main() {
    val francisco = Cliente(
        nome = "Francisco Stanley",
        cpf = "123.321.123-01",
        ClienteTipo = ClienteTipo.PF,
        senha = "Senha123"
    )

    println(francisco)

    TesteAutenticacao().autentica(francisco)

}