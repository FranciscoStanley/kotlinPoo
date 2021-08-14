package one.digitalinovattion

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
) : Funcionario(nome, cpf, salario), Login {
    override fun calculoAuxilio(): Double = salario * 0.4

    override fun login(): Boolean = "Sabrina1998" == senha
}