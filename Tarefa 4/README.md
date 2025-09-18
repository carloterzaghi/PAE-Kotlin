# Tarefa 4

1. O código do programa abaixo efetua leitura de 10 valores inteiros. Em seguida o usuário envia um outro número X qualquer. O programa deverá enviar a mensagem “Valor X encontrado no array” se o valor X estiver presente em alguma posição do Array.  Caso contrário, o programa deverá enviar a mensagem “Valor X não encontrado no array”. Implementar o programa na plataforma VSCode ou em alguma outra IDE, podendo ser on-line, que suporte a Linguagem Kotlin. 
```
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
            println("Valor $valor existente no array!")
            println("---------------- Fim de Programa ----------------")
            return
        }
    }

    println("Valor $valor NÃO existente no array!")
    println("---------------- Fim de Programa ----------------")
}
```
2. Escrever um programa na Linguagem Kotlin que permita a leitura das notas de uma turma de 10 alunos. Calcular a média da turma e contar quantos alunos obtiveram nota acima desta média calculada. Escrever a média da turma e o resultado da contagem.
 

3. Escrever um programa com a Linguagem Kotlin para ler um array Q de 10 posições (aceitar somente números positivos). Em seguida, exibir em console o valor do maior elemento de Q e a respectiva posição por ele ocupada no array.
 

4. Escrever um programa com a Linguagem Kotlin para ler um array Q de 10 posições (aceitar somente números positivos). Em seguida, exibir em console o valor do menor elemento de Q e a respectiva posição por ele ocupada no array.
 

5. Escrever um programa com a Linguagem Kotlin para Ler um array A de 10 números. Em seguida, ler mais um número e armazená-lo em uma variável X. Armazenar em um array M o resultado de cada elemento de A multiplicado pelo valor X. Logo após, exibir em console todos os elementos do array M.
 

6. Escrever um programa com a Linguagem Kotlin para ler 10 números e armazená-los em um array. Após a leitura total destes 10 números, o programa deverá exibir em console esses 10 números em ordem inversa.