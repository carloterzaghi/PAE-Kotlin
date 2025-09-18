fun main() {
    println("-------------------- Início do Programa --------------------")
    print("Entre com um valor numérico inteiro maior que zero: ")
    val N = readLine()?.toIntOrNull()

    if (N == null) {
        println("Por favor, entre com um número inteiro válido.")
    }else if (N < 10) {
        println("Valor inválido")
    } 
    else {
        for (i in 1..N) {
            println("USCS")
        }
    }
    println("-------------------- Fim de Programa --------------------")
}