package ExercicioTres

class Fiat(anoParametro: Int, valorParametro:Int, corParamentro:String, portaParametro: Int
): ICarros() {
    override var ano: Int = anoParametro
    override var valor: Int = valorParametro
    override var cor : String = corParamentro
    override var portas: Int = portaParametro
    override var marca: String= "Fiat"
    var velocidade: Double = 3.0

    override fun inicia(){
        velocidade = 3.0
        println("Iniciando o motor ...  minha velocidade está em $velocidade")

    }
    override fun freia(){
        velocidade -= 6.0
        println("Freando ... minha velocidade está em $velocidade")
    }
    override fun acelera(){
        velocidade += 12.0
        println("Acelerando ... minha velocidade está em $velocidade ")
    }
}
