package ExercicioTres

import kotlin.system.exitProcess

fun main() {
    print("Escolha o carro: (f) Fiat , (h) Hyundai e (r) Renault :")
    val opcao: String = readln()
    var iCarros : ICarros = ICarros()
    println("Informe o ano do carro")
    val ano = readln().toInt()
    println("Informe o valor do carro")
    val valor = readln().toInt()
    println("Informe a cor do carro")
    val cor = readln()
    println("Informe quantas porta tem o carro")
    val portas = readln().toInt()

    when (opcao) {
        "f" -> {
            iCarros = Fiat(ano,valor, cor, portas)
        }
        "h" -> {
            iCarros = Hyundai(ano,valor, cor, portas)
        }
        "r" -> {
            iCarros = Renault(ano,valor, cor, portas)
        }
    }

    val anoInformado = iCarros.ano
    val valorInformado = iCarros.valor
    val corInformado = iCarros.cor
    val portaInformado = iCarros.portas
    val marcaInformada = iCarros.marca

    println("O veiculo informado foi $marcaInformada do ano $anoInformado da cor $corInformado que tem $portaInformado portas, seu valor foi comprado por R$ $valorInformado  ")

    menu(iCarros)
}
fun menu(iCarros: ICarros) {
    println("-----------------------------")
    println("O que seu carro está fazendo ?")
    println("-----------------------------")
    println("1-  Esta iniciando o motor ")
    println("2-  Esta acelerando ")
    println("3-  Esta freando")
    println("4- Sair")
    println("______________________________")

    when (readln().toInt()) {
        1 -> {

            iCarros.inicia()
            menu(iCarros)
        }
        2 -> {
            iCarros.acelera()
            menu(iCarros)
         }
        3 -> {
            iCarros.freia()
            menu(iCarros)
        }
        4 -> {
            exitProcess(0)
        }

        else -> {
            println("\n Opção Inválida \n")
            menu(iCarros)

        }

    }
}