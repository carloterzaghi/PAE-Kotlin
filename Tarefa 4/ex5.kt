fun main() {
    println("-------------------- Início do Programa --------------------")
    
    val A = IntArray(10)
    println("Entre com 10 valores numéricos inteiros na variável A: ")

    for (i in 0 until 10) {
        print("Digite o valor número ${i + 1}: ")
        A[i] = readLine()?.toIntOrNull() ?: 0
    }

    val X = IntArray(10)
    println("\nEntre com 10 valores numéricos inteiros na variável X: ")

    for (i in 0 until 10) {
        print("Digite o valor número ${i + 1}: ")
        X[i] = readLine()?.toIntOrNull() ?: 0
    }

    val M = IntArray(10)
    for (i in 0 until 10) {
        M[i] = A[i] * X[i]
    }

    println("\nElementos do array M:")
    println("Index - M[i]")
    for (i in 0 until 10) {
        println("$i° - ${M[i]}")
    }
    
    println("-------------------- Fim de Programa --------------------")
}