class Pessoa {

    var nome:String = "Francisco Stanley"
    var idade:Int = 25
    var identidade:String = "1.123.123"
    var cpf:String = "123.123.123-11"
        private set

    var nTelefone:String = "(61)91234-1234"
    var profissao:String = "Software Developer"



    inner class endereco {

        var rua:String = "Rua programando em Kotlin"
        var nCasa:Int = 404
        var bairro:String = "Not Found"

    }

}

fun main(){

    val franciscoStanley = Pessoa()

    println("Nome: ${franciscoStanley.nome}.")
    println("Idade: ${franciscoStanley.idade} Anos.")
    println("Identidade: ${franciscoStanley.identidade}.")
    println("CPF: ${franciscoStanley.cpf}.")
    println("N°Telefone: ${franciscoStanley.nTelefone}.")

    println("Endereço: ${franciscoStanley.endereco().rua}, " +
            "casa ${franciscoStanley.endereco().nCasa}, " +
            "bairro ${franciscoStanley.endereco().bairro}.")

    println("Profissão: ${franciscoStanley.profissao}.")

}