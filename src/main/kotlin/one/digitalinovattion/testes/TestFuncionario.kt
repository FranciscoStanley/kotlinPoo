package one.digitalinovattion.testes

import one.digitalinovattion.Funcionario
import one.digitalinovattion.Pessoa
import java.math.BigDecimal

fun main() {
    val francisco = Pessoa(nome = "Francisco Stanley", cpf = "123.123.123-21")
    println(francisco.nome)
    println(francisco.cpf)

    val joao = Funcionario("Francisco Stanley", "123.123.123-21", BigDecimal.valueOf(3000.0))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}