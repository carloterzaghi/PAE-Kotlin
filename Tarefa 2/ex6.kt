fun main() {
    println("---------- Início do Programa ----------")
    print("Informe o Preço: ")
    val preco = readLine()?.toDoubleOrNull()

    print("Informe a Quantidade: ")
    val quantidade = readLine()?.toIntOrNull()

    if (preco != null || quantidade != null) {
        println("Preço e Quantidade informada: $preco , $quantidade")
        
        val result: Double
        val qtd = quantidade ?: 0
        val prc = preco ?: 0.0

        if (qtd >= 10){
            result = prc*qtd*0.9F
        }
        else{
            result = prc*qtd
        }
        
        println("Preço final: $result")
        
    } else {
        println("Entrada inválida. Por favor, digite um número inteiro.")
    }

    println("---------- Fim de programa ----------")
    println("Pressione enter para sair...")
    readLine()
}
