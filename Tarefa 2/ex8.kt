fun main() {
    println("---------- Início do Programa ----------")
    print("Informe a sua idade: ")
    val idade = readLine()?.toIntOrNull()

    if (idade != null && idade >= 18 && idade <= 67){
        println("Pode doar sangue")
    } else if (idade != null) {
        println("Não pode doar sangue")
    } else {
        println("Entrada inválida. Por favor, informe um número inteiro.")
    }
    
    println("---------- Fim de programa ----------")
    println("Pressione enter para sair...")
    readLine()
}