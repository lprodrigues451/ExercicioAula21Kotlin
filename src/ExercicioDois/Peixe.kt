package ExercicioDois

class Peixe (var nome: String, var raca: String, var responsavel: String): SistemaPetshop() {
    override fun cadastrarNome(): String {
        return nome
    }

    override fun cadastrarRaca(): String{
        return raca
    }
    override fun cadastrarResponsavel(): String {
        return responsavel
    }
    override fun movimentar(): String {
        return "Nadando"
    }

    override fun comer():String{
        return "Comendo ração molhada"
    }

    override fun dormir():String{
        return "Dormindo de olho aberto"
    }
}