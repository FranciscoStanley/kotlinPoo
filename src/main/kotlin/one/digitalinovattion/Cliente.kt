package one.digitalinovattion

class Cliente(
    nome: String,
    cpf: String,
    val ClienteTipo: ClienteTipo,
    val senha: String
) :Pessoa(nome, cpf), Login {
    override fun login(): Boolean = "Senha123" == senha

    override fun toString(): String = """
        Nome:$nome
        Cpf:$cpf
        Tipo:${ClienteTipo.descricao}
    """.trimIndent()
}