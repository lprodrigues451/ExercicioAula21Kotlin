package ExercicioQuatro

import kotlin.system.exitProcess

fun main() {
    var sistemaBancario = SistemaBancario()
    print("Escolha o carro: (ca) ContaSalario , (cp) Conta poupança e (cc) Conta corrente :")
    val opcao1: String = readln()
    when (opcao1) {
        "ca" -> {
            sistemaBancario = ContaSalario()
        }
        "cp" -> {
            sistemaBancario = ContaPoupanca()

        }
        "cc" -> {
            println("Informe o valor que vai está na conta corrente:")
            val valorDigitado = readln().toFloat()
            sistemaBancario = ContaCorrente(valorDigitado)
        }
    }

    menu(sistemaBancario)
}

fun menu(sistemaBancario: SistemaBancario) {
    println("1- Deposito")
    println("2- Saque")
    println("3- Saldo")
    println("4- Sair")
    val opcao = readln().toInt()

    when(opcao){
        1 -> {
            sistemaBancario.deposito()
            menu(sistemaBancario)

        }
        2 -> {
            sistemaBancario.saque()
            menu(sistemaBancario)
        }
        3-> {
           println("R$ ${sistemaBancario.saldo()}")
            menu(sistemaBancario)
        }

        4-> {
            exitProcess(0)
        }

        else -> {
            println("\n Opção Inválida \n")

        }
    }
}