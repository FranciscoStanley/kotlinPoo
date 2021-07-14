class Pessoa {

    var nome:String = "Francisco Stanley"
    var idade:Int = 25
    var cpf:String = "123.123.123-11"
    var nTelefone:String = "(61)91234-1234"
    var profissao:String = "Software Developer"

}

fun main(){

    val franciscoStanley = Pessoa()

    println("Nome: ${franciscoStanley.nome}.")
    println("Idade: ${franciscoStanley.idade} Anos.")
    println("CPF: ${franciscoStanley.cpf}.")
    println("N°Telefone: ${franciscoStanley.nTelefone}.")
    println("Profissão: ${franciscoStanley.profissao}.")

}