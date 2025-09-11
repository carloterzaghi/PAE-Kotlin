fun main() {
    println("---------- Início do Programa ----------")
    print("Informe um valor inteiro: ")
    val v1 = readLine()?.toDoubleOrNull()

    print("Informe outro valor inteiro: ")
    val v2 = readLine()?.toDoubleOrNull()
    
    if (v1 == v2){
        println("Valores entrados iguais")
    }else{
        println("Valores entrados são diferentes")
    }
    
    println("---------- Fim de programa ----------")
    println("Pressione enter para sair...")
    readLine()
}
