# Tarefa 3

1. O código do programa abaixo efetua leitura de um valor numérico inteiro N (maior que zero) informado pelo usuário.  Caso o valor entrado N seja menor que 10 o programa deverá exibir a mensagem “Valor inválido” e encerrar. Caso o valor N entrado seja maior ou igual a 10, o programa deverá imprimir N vezes a mensagem “MAUÁ”. Implementar o programa na plataforma VSCode ou alguma outra IDE, podendo ser on-line, que suporte a Linguagem Kotlin. 
```
fun main() {
    println("-------------------- Início do Programa --------------------")
    print("Entre com um valor numérico inteiro: ")
    val N = readLine()?.toIntOrNull()

    if (N == null) {
        println("Por favor, entre com um número inteiro válido.")
    } else {
        println("Valor N entrado: $N")
        if (N < 10) {
            println("Valor Inválido")
        } else {
            for (i in 1..N) {
                println("$i. USCS")
            }
        }
    }
    println("-------------------- Fim de Programa --------------------")
}
```
2. Escrever um programa na Linguagem Kotlin que exiba na console os números de 1 (inclusive) até 20 (inclusive) em ordem crescente. O programa deve ser implementado com o       comando while.

3. Escrever um programa na Linguagem Kotlin que exiba na console os números de 1 (inclusive) até 20 (inclusive) em ordem decrescente. O programa deve ser implementado com o comando while.

4. Escrever um programa na Linguagem Kotlin que efetua leitura de um valor numérico inteiro N (maior que zero) informado pelo usuário. Caso o valor entrado N seja 0 ou menor que 0 o programa deverá exibir a mensagem “Valor inválido” e encerrar. Caso o valor N entrado seja maior que 0, o programa deverá imprimir na console os números de 0 a N. O programa deve ser implementado com o comando while.

5. Escrever um programa na Linguagem Kotlin que efetua leitura de um valor numérico inteiro N (maior que zero) informado pelo usuário. Caso o valor entrado N seja menor que 10 o programa deverá exibir a mensagem “Valor inválido” e encerrar. Caso o valor N entrado seja maior ou igual a 10, o programa deverá imprimir N vezes a mensagem “USCS”. O programa deverá ser implementado com o comando for.

6. Escrever um programa na Linguagem Kotlin que exiba na console os números de 1 (inclusive) até 20 (inclusive) em ordem crescente. O programa deve ser implementado com o comando for.

7. Escrever um programa na Linguagem Kotlin que exiba na console os números de 1 (inclusive) até 20 (inclusive) em ordem decrescente. O programa deve ser implementado com o comando for.

8. Escrever um programa na Linguagem Kotlin que efetua leitura de um valor numérico inteiro N (maior que zero) informado pelo usuário. Caso o valor entrado N seja 0 ou menor que 0 o programa deverá exibir a mensagem “Valor inválido” e encerrar. Caso o valor N entrado seja maior que 0, o programa deverá imprimir na console os números de 0 a N. O programa deve ser implementado com o comando for.

9. Escrever um programa na Linguagem Kotlin que efetua leitura de 10 (dez) valores numéricos inteiros. Ao final da leitura o programa deverá exibir a soma total dos 10 valores entrados no programa.  Empregar os comandos for ou while.

Escrever um programa na Linguagem Kotlin que efetua leitura de 10 (dez) valores numéricos inteiros. Ao final da leitura o programa deverá exibir a soma total dos valores entrados que forem pares. Empregar os comandos for ou while.