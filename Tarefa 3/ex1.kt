fun main() {
    println("-------------------- Início do Programa --------------------")
    print("Entre com um valor numérico inteiro: ")
    val N = readLine()?.toIntOrNull()

    if (N == null) {
        println("Por favor, entre com um número inteiro válido.")
    } else {
        println("Valor N entrado: $N")
        if (N < 10) {
            println("Valor Inválido")
        } else {
            for (i in 1..N) {
                println("MAUÁ")
            }
        }
    }
    println("-------------------- Fim de Programa --------------------")
}