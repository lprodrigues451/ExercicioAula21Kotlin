package ExercicioDois

class Cachorro (var nome: String, var raca: String, var responsavel: String): SistemaPetshop(){

    override fun cadastrarNome(): String {
        return nome
    }

    override fun cadastrarRaca(): String{
        return raca
    }
    override fun cadastrarResponsavel(): String {
        return responsavel
    }

    override fun movimentar():String{
        return "Andando em 4 patas"
    }

    override fun comer(): String{
        return "Comendo bife"
    }

    override fun dormir():String{
        return "Dormindo na cama da jéssica"
    }

}

