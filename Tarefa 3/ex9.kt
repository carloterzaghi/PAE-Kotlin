fun main() {
    println("-------------------- Início do Programa --------------------")
    var soma = 0
    for (i in 1..10) {
        print("$i° - Entre com um valor numérico inteiro: ")
        val input = readLine()
        val numero = input?.toIntOrNull() ?: 0
        soma += numero
    }
    println("Resultado da soma: $soma")
    println("-------------------- Fim de Programa --------------------")
}