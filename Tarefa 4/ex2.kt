fun main() {
    println("---------------- Início do Programa ----------------")
    val array = FloatArray(10)
    println("Entre com 10 valores numéricos decimais: ")

    for (i in 0 until 10) {
        print("Fale a nota do aluno ${i + 1}: ")
        array[i] = readLine()?.toFloatOrNull() ?: 0f // Usamos o operador elvis para tratar valores nulos como 0
    }

    var soma = 0f
    for (i in 0 until 10) {
        soma += array[i]
    }
    val media = soma / 10
    var acima = 0
    
    for (i in 0 until 10) {
        if (array[i] > media) acima += 1
    }
    println("Média da Turma: $media, N° de Alunos acima da média: $acima")
    println("---------------- Fim de Programa ----------------")
}