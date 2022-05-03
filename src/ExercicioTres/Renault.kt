package ExercicioTres

class Renault (anoParametro: Int, valorParametro:Int, corParamentro:String, portaParametro: Int
): ICarros() {
    override var ano: Int = anoParametro
    override var valor: Int = valorParametro
    override var cor : String = corParamentro
    override var portas: Int = portaParametro
    override var marca: String= "Renault"
    var velocidade: Double = 0.0

    override fun inicia(){
        velocidade = 0.0
        println("Iniciando o motor ...  minha velocidade está em $velocidade")

    }
    override fun freia(){
        velocidade -= 5.0
        println("Freando ... minha velocidade está em $velocidade")
    }
    override fun acelera(){
        velocidade += 10.0
        println("Acelerando ... minha velocidade está em $velocidade ")
    }
}