package ExercicioQuatro

import kotlin.system.exitProcess

class ContaSalario : SistemaBancario(){
    private var valorSalario: Float = 1212.0f
    private var saqueDoValor: Float = 0.0f
    private var deposito: Float = 0.0f

    override fun deposito():Float{
        println("------------------------------------------------")
        println("O Depósito será feito por empregadora?")
        println("1- Sim")
        println("2- Não")
        println("3- Sair")
        println("______________________________")
        val opcao = readln().toInt()


        when (opcao) {
            1 -> {
                println("Informe a quantidade do depósito:")
                deposito= readln().toFloat()
                valorSalario += deposito

            }
            2 -> {
                println("Conta só pode receber deposito do empregador")
                deposito()

                    }
            3 -> {
                exitProcess(0)
                }
            else -> {
                println("\n Opção Inválida \n")

            }

        }
        return valorSalario

    }
    override fun saque(): Float {
        println("Informe o valor do Saque:")
        saqueDoValor = readln().toFloat()

        if(saqueDoValor > valorSalario){
            println("Saldo insuficiente para sacar")
            saque()
        } else {
            valorSalario -= saqueDoValor
        }
    return valorSalario
    }
    override fun saldo():Float{
        return valorSalario
    }
}