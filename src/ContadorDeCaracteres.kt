
open class CuentaCaracteres( var cadena:String){

    open fun numCaracteres():Int {
        return cadena.length
    }
}

class Receptor():CuentaCaracteres(" "){


    override fun numCaracteres(): Int {
        this.cadena = readLine()!!.toString()//se actualiza el valor de cadena y se evita que tomo el " " que se paso al principio
        while (cadena.isBlank()){
            print("introduce una palabra:")
            this.cadena = readLine()!!.toString()
        }
        return super.numCaracteres()
    }

    fun imprimeResultado(){

        print("introduce una palabra:")
        var caracteres:Int = numCaracteres()

        print("la palabra es '${cadena}' y tiene ${caracteres} caracteres")
    }
}

fun main(){

   val recep:Receptor = Receptor()
    recep.imprimeResultado()
}