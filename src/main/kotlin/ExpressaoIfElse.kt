/**
 * Expressão IF ELSE
 */
fun main(){

    var valorA = 10
    var valorB = 20

    var i = 23

    if (i == null) {

        excProcessamento()
    } else{
        naoExecProcessamento()
    }

    println("FIM....")
}

fun excProcessamento(){

    println("Processando...")
}

fun naoExecProcessamento(){

    println("Sem processamento...")
}