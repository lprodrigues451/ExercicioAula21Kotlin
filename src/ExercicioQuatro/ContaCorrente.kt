package ExercicioQuatro

import kotlin.system.exitProcess

class ContaCorrente(var valorDigitado: Float): SistemaBancario( ){
    private var valorSalario: Float = valorDigitado
    private var saqueDoValor: Float = 0.0f
    private var deposito: Float = 0.0f

    override fun deposito():Float{
        println("Informe a quantidade do depósito:")
        deposito= readln().toFloat()
        if (deposito > 5000){
            println("Operação inválida, procure a sua agência.")
        } else {
            valorSalario += deposito
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