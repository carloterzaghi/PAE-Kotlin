fun main() {
    println("-------------------- Início do Programa --------------------")
    print("Entre com um valor numérico inteiro maior que zero: ")
    val N = readLine()?.toIntOrNull()

    if (N == null) {
        println("Por favor, entre com um número inteiro válido.")
    }else if (N <= 0) {
        println("Valor inválido")
    } 
    else {
        for (i in 0..N) {
            println("$i")
        }
    }
    println("-------------------- Fim de Programa --------------------")
}