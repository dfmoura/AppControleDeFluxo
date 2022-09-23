/**
 * Espressão IF
 */
fun main(){

    var valorA = 10
    var valorB = 20

    var i = 23

    // Dicas para escrever IF
    //if(true){}
    if ((i == null) || (valorA <=8)) {

        processar()
    }

    if ((i != null) && (valorB > valorA)) {

        naoProcessar()
        
    }
    
    println("Fim...")
}

fun processar(){
    println("TRUE")
}



fun naoProcessar(){
    println("FALSE")
}