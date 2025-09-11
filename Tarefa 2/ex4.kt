fun main() {
    val p1 = 2
    val p2 = 3
    val p3 = 4

    println("---------- Início do Programa ----------")
    print("Informe a 1° nota do aluno: ")
    val nota1 = readLine()?.toDoubleOrNull()

    print("Informe a 2° nota do aluno: ")
    val nota2 = readLine()?.toDoubleOrNull()

    print("Informe a 3° nota do aluno: ")
    val nota3 = readLine()?.toDoubleOrNull()

    if (nota1 != null || nota2 != null || nota3 != null) {
        println("Valores informados: $nota1 , $nota2 , $nota3")
        
        val media = ((nota1 ?: 0.0)*p1 + (nota2 ?: 0.0)*p2 + (nota3 ?: 0.0)*p3) / (p1+p2+p3)
        
        println("Media ponderada: $media")

        if (media >= 5F){
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
