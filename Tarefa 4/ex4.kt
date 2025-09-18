fun main() {
    println("-------------------- Início do Programa --------------------")
    
    val tamanho = 10
    val Q = FloatArray(tamanho)
    
    println("Digite $tamanho números positivos:")
    
    for (i in 0 until tamanho) {
        var numero: Float
        do {
            print("Valor ${i+1}: ")
            numero = readLine()?.toFloatOrNull() ?: -1f
            if (numero < 0) {
                println("Por favor, digite apenas números positivos!")
            }
        } while (numero < 0)
        
        Q[i] = numero
    }

    var menor = Q[0]
    var posicao = 0
    
    for (i in 1 until tamanho) {
        if (Q[i] < menor) {
            menor = Q[i]
            posicao = i
        }
    }
    
    println("O menor elemento do array Q é: $menor")
    println("Ele está na posição: $posicao (índice do array)")
    println("Que corresponde ao ${posicao + 1}º número digitado")
    
    println("-------------------- Fim de Programa --------------------")
}