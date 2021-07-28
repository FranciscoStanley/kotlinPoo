package one.digitalinovattion.testes

import one.digitalinovattion.Funcionario

class ImprimeRelatorioFuncionario {

    companion object{
        fun imprime(funcionario: Funcionario){
            println(
                funcionario.toString()
            )
        }
    }
}