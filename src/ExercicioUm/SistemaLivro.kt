package ExercicioUm

open class SistemaLivro(isbnParametro: Int= 0, nomeLivroParametro: String="", generoParametro: String= "", autoraLivroParametro:String = "") {
    var ibsn : Int = isbnParametro
    var nomeLivro : String = nomeLivroParametro
    var genero: String = generoParametro
    var autoraLivro: String = autoraLivroParametro

    fun registrarLivro(isbn: Int){
        println("O livro foi registrado com o isbn $isbn")

    }
    fun registrarLivro(isbn: Int,nomeLivro: String ){
        println("O livro foi registrado com o isbn $isbn e o nome $nomeLivro")

    }
    fun registrarLivro(isbn: Int,nomeLivro: String,genero: String){
        println("O livro foi registrado com o isbn $isbn o nome $nomeLivro e o gênero $genero ")

    }
}