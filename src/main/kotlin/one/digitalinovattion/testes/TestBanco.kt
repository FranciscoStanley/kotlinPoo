package one.digitalinovattion.testes

import one.digitalinovattion.Banco

fun main(){

    //Depois de instaciar uma data class não pode ser mutada!
    val digiOneBank = Banco (nome = "DigiOne", numero = 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    //Criando um exemplo de como mutar o nome apenas criando uma copia.
    val banco2 = digiOneBank.copy (nome = "DigiTwo", numero = 13)

    println(banco2.info())



}