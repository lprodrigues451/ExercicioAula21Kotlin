package ExercicioTres

open class ICarros {
    open var ano: Int= 0
    open var valor: Int= 0
    open var cor : String= ""
    open var portas: Int = 0
    open var marca: String = ""


    open fun inicia()= println()
    open fun freia()= println()
    open fun acelera()= println()

}