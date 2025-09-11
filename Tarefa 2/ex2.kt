fun main() {
    println("---------- Início do Programa ----------")
    print("Entre com um valor numérico inteiro: ")

    val valor = readLine()?.toIntOrNull()

    if (valor != null) {
        println("Valor entrado: $valor")

        if (valor % 2 == 0) {
            println("Valor par!")
        } else {
            println("Valor impar!")
        }
    } else {
        println("Entrada inválida. Por favor, digite um número inteiro.")
    }

    println("---------- Fim de programa ----------")
    println("Pressione enter para sair...")
    readLine()
}
