fun main() {
    println("---------- Início do Programa ----------")
    print("Informe um valor inteiro: ")
    val v1 = readLine()?.toIntOrNull()

    print("Informe outro valor inteiro: ")
    val v2 = readLine()?.toIntOrNull()

    if (v1 == null || v2 == null) {
        println("Entrada inválida! Por favor, digite valores inteiros válidos.")
    } else if (v1 == v2) {
        println("Valores entrados iguais")
    } else if (v1 > v2) {
        println("Maior valor: $v1")
    } else {
        println("Maior valor: $v2")
    }

    println("---------- Fim de programa ----------")
    println("Pressione enter para sair...")
    readLine()
}