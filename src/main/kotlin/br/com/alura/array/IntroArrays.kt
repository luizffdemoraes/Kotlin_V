package br.com.alura.array

import br.com.alura.teste.testaAumentoSalario
import br.com.alura.teste.testeMaiorEMenorIdade
import br.com.alura.teste.testeRange


fun main() {
//    testeMaiorEMenorIdade()
//    testaAumentoSalario()
//    testeRange()

    val idades: IntArray = intArrayOf(10,12,18,33,40,67)
    val maiorIdade = idades.maxOrNull()
    println("Maior idade: $maiorIdade")

    val menorIdade = idades.minOrNull()
    println("Menor idade: $menorIdade")

    //saber a media das idades
    val media: Double = idades.average()
    println("Média: $media")

    //verificar se todos são maior de idade
    val todosMaiores = idades.all { it > 18 }
    println("Todos maiores? $todosMaiores")

    //verificar se pelo menos um e maior de idade

    val existeMaior = idades.any {it >= 18 }
    println("Algum aluno é maior de idade? $existeMaior")

    //filtrar os valores menores de 18 e trazer os maiores ou iguais
    val maiores = idades.filter { it >= 18 }
    println("Maiores: $maiores")

    //retornar um valor especifico retorna o primeiro valor que satisfizer a condição
    val busca = idades.find { it == 18}
    println("Busca: $busca")
}