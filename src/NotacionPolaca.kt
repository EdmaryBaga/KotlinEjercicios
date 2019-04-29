fun main(){

    var expresion: MutableList <Char> = RecibirNotacionPolaca()
    CalculaExpresion(expresion)


}

fun RecibirNotacionPolaca():MutableList<Char>{

    var exprecion:String
    println("escribe la exprecion a calcular en notacion polaca")
    exprecion= readLine()!!.toString()

    return  exprecion.toMutableList()
}

fun CalculaExpresion(expresionR:MutableList<Char>){

    val operadores:List<String> = listOf("+","*","/","-","^")

    var operadoresExp:MutableList<String> = mutableListOf()
    var operandos : MutableList<Int> = mutableListOf()


    //aqui se pueden hacer las operaciones
    for (i in expresionR){
        var elemento:String = i.toString()
        if (operadores.contains(elemento)){
            operadoresExp.add(elemento)
        }
        else{
            operandos.add(elemento.toInt())
        }
    }

    var resultado:Int = operandos.last()
    operandos.removeAt(operandos.size-1)

    for (operador in operadoresExp)

     when(operador){
            "+"->{
                var op2=operandos.get(operandos.size-1)
                println("first es ${resultado} y ${op2}")
                resultado+=op2
                operandos.removeAt(operandos.size-1)
            }
            "-"->{
                var op1:Int= operandos.last()
                println("first es ${resultado} y ${op1}")
                resultado-=op1
                operandos.removeAt(operandos.size-1)
            }
            "*"->{
                var op1:Int= operandos.last()
                println("first es ${resultado} y ${op1}")
                resultado*=op1
                operandos.removeAt(operandos.size-1)
            }
            "/"->{
                var op1:Int= operandos.last()
                println("first es ${resultado} y ${op1} con ${operador}")
                resultado/=op1
                operandos.removeAt(operandos.size-1)
            }
           else->{
               println("ese operador es invalido")
               resultado=resultado
           }
        }

    print("El resultado es ${resultado}")
}

