fun main() {
    println("---------- Início do Programa ----------")
    print("Informe a 1° nota do aluno: ")
    val nota1 = readLine()?.toDoubleOrNull()

    print("Informe a 2° nota do aluno: ")
    val nota2 = readLine()?.toDoubleOrNull()

    print("Informe a 3° nota do aluno: ")
    val nota3 = readLine()?.toDoubleOrNull()

    if (nota1 != null || nota2 != null || nota3 != null) {
        println("Valores informados: $nota1 , $nota2 , $nota3")
        
        val media = ((nota1 ?: 0.0) + (nota2 ?: 0.0) + (nota3 ?: 0.0)) / 3
        
        println("Media aritmetica: $media")

        if (media >= 6F){
            println("Aprovado")
        }
        else{
            println("Reprovado")
        }
        
    } else {
        println("Entrada inválida. Por favor, digite um número inteiro.")
    }

    println("---------- Fim de programa ----------")
    println("Pressione enter para sair...")
    readLine()
}
