fun main() {
    println("-------------------- Início do Programa --------------------")
    
    val A = IntArray(10)
    println("Entre com 10 valores numéricos inteiros: ")

    for (i in 0 until 10) {
        print("Digite o valor número ${i + 1}: ")
        A[i] = readLine()?.toIntOrNull() ?: 0
    }
    
    println("\nArray em ordem inversa:")
    for (i in 9 downTo 0) {
        println("Posição $i: ${A[i]}")
    }

    println("-------------------- Fim de Programa --------------------")
}