import kotlin.math.sqrt


open class Figuras(var name: String, var area: Double, var perimetro: Double){
    open fun calculaArea(){
        println("el area del ${name} es ${area} y su perimetro es ${perimetro}")
    }
    open fun calculaPerimetro(){
        println(" y su perimetro es ${perimetro}")
    }
}

class Circulo (var radio: Double) : Figuras("Circulo", 0.0, 0.0){

    override fun calculaArea() {
        this.area = 3.1416F * radio * radio
        super.calculaArea()
    }

    override fun calculaPerimetro() {
        this.perimetro = 3.1416F * 2 * radio
        super.calculaPerimetro()
    }
}

class Triangulo(var lado1: Float, var lado2: Double, var lado3: Double) : Figuras("Circulo", 0.0, 0.0) {
    override fun calculaArea() {
        val s = (lado1 + lado2 + lado3) / 2
        this.area = sqrt(s * (s - lado1) * (s - lado2) * (s - lado3))
        super.calculaArea()
    }

    override fun calculaPerimetro() {
        this.perimetro = lado1 + lado2 + lado3
        super.calculaPerimetro()
    }
}


fun main(){
    val cirulo: Circulo=Circulo(2.2)
    cirulo.calculaArea()

}