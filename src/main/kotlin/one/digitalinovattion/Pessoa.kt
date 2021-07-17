package one.digitalinovattion

class Pessoa {

    var nome:String = "Francisco Stanley"
    var idade:Int = 25
    var identidade:String = "1.123.123"
    var cpf:String = "123.123.123-11"
        private set
    var nTelefone:String = "(61)91234-1234"
    var profissao:String = "Software Developer"


    //Criando um inner class para retorna endereço
    inner class endereco {

        var rua:String = "Rua programando em Kotlin"
        var nCasa:Int = 404
        var bairro:String = "Not Found"

    }

    //Criando um construtor e função para retorna nome e cpf
    constructor()

    fun pessoaInfo() = "Nome: $nome | CPF: $cpf"



}

fun main(){

    //Intanciando objeto pessoa

    val franciscoStanley = Pessoa()

//Imprimindo as informações da classe pessoa

    println("Nome: ${franciscoStanley.nome}.")
    println("Idade: ${franciscoStanley.idade} Anos.")
    println("Identidade: ${franciscoStanley.identidade}.")
    println("CPF: ${franciscoStanley.cpf}.")
    println("N°Telefone: ${franciscoStanley.nTelefone}.")

    println("Endereço: ${franciscoStanley.endereco().rua}, " +
            "casa ${franciscoStanley.endereco().nCasa}, " +
            "bairro ${franciscoStanley.endereco().bairro}.")

    println("Profissão: ${franciscoStanley.profissao}.")

    //Imprimindo o construtor da função pessoaInfo
    println(franciscoStanley.pessoaInfo())

}