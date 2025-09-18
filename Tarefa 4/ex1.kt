fun main() {
    println("---------------- Início do Programa ----------------")
    val array = IntArray(10)
    println("Entre com 10 valores numéricos inteiros: ")

    for (i in 0 until 10) {
        print("Digite o valor número ${i + 1}: ")
        array[i] = readLine()?.toIntOrNull() ?: 0 // Usamos o operador elvis para tratar valores nulos como 0
    }

    println("---------------- Elementos armazenados no array: ----------------")
    for (i in 0 until 10) {
        println(array[i])
    }

    println("---------------- Consulta no array ----------------")
    print("Entre com o valor a ser consultado no array: ")
    val valor = readLine()?.toIntOrNull() ?: return

    for (i in 0 until 10) {
        if (array[i] == valor) {
            println("Valor $valor existente no array na posição $i!")
            println("---------------- Fim de Programa ----------------")
            return
        }
    }

    println("Valor $valor NÃO existente no array!")
    println("---------------- Fim de Programa ----------------")
}