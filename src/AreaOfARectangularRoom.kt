/**
 * Se solicita al usuario el largo y ancho de la habitacion, solo resibe datos numricos
 * preguntar al usurio si quiere calcular el area en metros o pies
 * mantener separados los calculos de la salida
 * **/


fun main(){

    var unidad =Pintamenu()
    VerificaUnidad(unidad)
}

fun Pintamenu():Int{

    var unidadDeMedida=0

    while (unidadDeMedida>2 || unidadDeMedida<1){
        println("Digite el numero de la opcion en que quiere calcular el area")
        println("1.- Pies")
        println("2.- metros")
        unidadDeMedida = try {
            readLine()?.toInt()!!
        }
        catch (_: NumberFormatException){
            println("*****Esta opcion es invalida, intentelo nuevamente*****")
            0
        }
    }
    return unidadDeMedida
}

fun VerificaUnidad(unidad:Int){

    var largo:Int
    var ancho:Int

    when(unidad){
        1-> print("el area es ${CalculaArea("Pies")} m^2")

        2-> print("el area es ${CalculaArea("Metros")} m^2")

    }
}

fun CalculaArea(unidadText:String):Double{
    var largo:Double
    var ancho:Double
    var area:Double
    println("Se calculara su area en ${unidadText}")
    println("Cuel es el largo del cuarto en ${unidadText}")
    largo= readLine()?.toDouble()!!

    println("Cuel es el ancho del cuarto en ${unidadText}")
    ancho= readLine()?.toDouble()!!

    area= largo*ancho

    return area
}