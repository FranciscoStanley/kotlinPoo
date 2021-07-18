package one.digitalinovattion.testes

import one.digitalinovattion.ClienteTipo

fun main(){
    ClienteTipo.values().forEach {
        println("${it.name} - $it")
    }
}