fun main(){

    var pisos = 3
    var estrellas= 1;
    var espacios=pisos-estrellas

    for (x in 1..pisos){
        for (x in 1..estrellas+espacios){
            if(x< espacios+1){
                print(" ")
            }
            else{
                print("*")
            }
        }
        println()
        estrellas+=2
        espacios-=1
    }
}

fun pintaPiramide(pisos: Int){
    var estrellas= 1;
    var espacios=pisos-estrellas
    for (x in 1..pisos){
        for (m in 1..espacios){
            print(" ")
        }
        for (x in 1..estrellas){
            print("*")
        }
        println()
        estrellas+=2
        espacios-=1
    }
}
