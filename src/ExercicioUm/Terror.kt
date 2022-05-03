package ExercicioUm

class Terror(var isbnParametro : Int= 0,
             var nomeLivroParametro : String = "",
             var generoParametro: String = "",
             var autoraLivroParametro: String= "") : SistemaLivro(isbnParametro, nomeLivroParametro, generoParametro, autoraLivroParametro){

    fun digitarLivro(){
        println("Informe o ibsn do livro: ")
        isbnParametro = readln().toInt()
        println("Informe o nome do livro")
        nomeLivroParametro = readln()
        generoParametro = "Terror"
        println("Informe o nome do Autor do livro")
        autoraLivroParametro= readln()
    }

    fun exibirIsbm(){
        registrarLivro(isbnParametro)
    }

    fun exibirIsbnNome(){
        registrarLivro(isbnParametro, nomeLivroParametro)
    }

    fun exibirIsbmNomeGenero(){
        registrarLivro(isbnParametro,nomeLivroParametro,generoParametro)

    }
}