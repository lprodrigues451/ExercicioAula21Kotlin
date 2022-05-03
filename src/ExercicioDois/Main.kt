package ExercicioDois

import kotlin.system.exitProcess

fun main() {
    print("Escolha o animal: (g) gato , (c) cachorro e (p) peixe :")
    val opcao: String = readln()
    var petshop = SistemaPetshop()
    println("Informe o nome do seu bichinho :")
    val nome = readln()
    println("Informe a raça:")
    val raca = readln()
    println("Informe o nome do responsavel : ")
    val responsavel = readln()

    if(opcao == "g"){
        petshop = Gato(nome, raca, responsavel)
    } else if (opcao == "c"){
        petshop = Cachorro(nome, raca, responsavel)
    } else if (opcao == "p"){
        petshop = Peixe(nome, raca, responsavel)
    }

    val nomeInformado = petshop.cadastrarNome()
    val racaInformada = petshop.cadastrarRaca()
    val responsavelInformado = petshop.cadastrarResponsavel()

    println("O nome do seu bicinho é $nomeInformado, tem a raça $racaInformada e seu responsavél e $responsavelInformado")
    menu(petshop, nomeInformado)

}

fun menu(sistema : SistemaPetshop, nomeInformado: String) {
    println("-----------------------------")
    println("O que $nomeInformado está fazendo ?")
    println("-----------------------------")
    println("1-  Esta movimentando ")
    println("2-  Esta comendo")
    println("3-  Esta Dormindo")
    println("4- Sair")
    println("______________________________")
    val opcao = readln().toInt()


    when (opcao) {
        1 -> {
            println(sistema.movimentar())
            menu(sistema, nomeInformado)
        }
        2 -> {
            println(sistema.comer())
            menu(sistema, nomeInformado)        }
        3 -> {
           println(sistema.dormir())
            menu(sistema, nomeInformado)        }
        4 -> {
            exitProcess(0)
        }

        else -> {
            println("\n Opção Inválida \n")

        }

    }
}