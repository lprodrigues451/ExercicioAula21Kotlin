package ExercicioUm

import kotlin.system.exitProcess

fun main() {
    val sistema: SistemaLivro = SistemaLivro()
    val acao : Acao = Acao()
    val terror : Terror = Terror()
    val comedia : Comedia = Comedia()
    menu(sistema, acao, terror, comedia)
}

fun menu(sistema : SistemaLivro, acao: Acao, terror: Terror, comedia: Comedia) {
    println("-----------------------------")
    println("1- Casdastra livro")
    println("2- Exibir livro")
    println("3- Sair")
    println("______________________________")
    val opcao = readln().toInt()


    when (opcao) {
        1 -> {
        menuLivro(sistema, acao, terror, comedia)

        }
        2 -> {
            menuExibirLivro(sistema,acao, terror, comedia)
        }
        3 -> {
           exitProcess(0)
        }

        else -> {
            println("\n Opção Inválida \n")

        }

    }
}

fun menuLivro(sistema: SistemaLivro, acao: Acao, terror: Terror, comedia: Comedia) {
    println(" Informe o genero?")
    println("-----------------------------")
    println("1- Ação")
    println("2- Terror")
    println("3- comedia")
    println("4- Sair")
    println("______________________________")
    val opcao = readln().toInt()


    when (opcao) {
        1 -> {
            acao.digitarLivro()
            menu(sistema, acao,terror, comedia)
        }
        2 -> {
            terror.digitarLivro()
            menu(sistema, acao,terror, comedia)

        }
        3 -> {
            comedia.digitarLivro()
            menu(sistema, acao,terror, comedia)
        }
        4 -> {
            exitProcess(0)
        }

        else -> {
            println("\n Opção Inválida \n")

        }

    }}

fun menuExibirLivro(sistema: SistemaLivro, acao: Acao, terror: Terror, comedia: Comedia) {
    println(" O que você quer exibir")
    println("-----------------------------")
    println("1- ibsm")
    println("2- ibsm e nome")
    println("3- ibsm e nome e genero")
    println("4- Sair")
    println("______________________________")
    val opcao = readln().toInt()

    when (opcao) {
        1 -> {
            if (acao.isbnParametro > 0){
                acao.exibirIsbm()
            }  else if (terror.isbnParametro > 0){
                terror.exibirIsbm()
            } else if(comedia.isbnParametro > 0){
                comedia.exibirIsbm()
            }
            menu(sistema, acao, terror, comedia)
        }
        2 -> {
            if (acao.isbnParametro > 0){
                acao.exibirIsbmNome()
            }  else if (terror.isbnParametro > 0){
                terror.exibirIsbnNome()
            } else if(comedia.isbnParametro > 0){
                comedia.exibirIsbmNome()
            }
            menu(sistema, acao, terror, comedia)

        }
        3 -> {
            if (acao.isbnParametro > 0){
                acao.exibirIsbmNomeGenero()
            }  else if (terror.isbnParametro > 0){
                terror.exibirIsbmNomeGenero()
            } else if(comedia.isbnParametro > 0){
                comedia.exibirIsbmNomeGenero()
            }
            menu(sistema, acao, terror, comedia)
        }
        4 -> {
            exitProcess(0)
        }
    }
}

