package br.com.alura.array

import br.com.alura.teste.testaAumentoSalario
import br.com.alura.teste.testeMaiorEMenorIdade

/*
    Range representa uma serie serve para iterar uma sequencia ou progressão
 */
fun main() {
//    testeMaiorEMenorIdade()
//    testaAumentoSalario()

    val serie: IntRange = 1.rangeTo(10)
    for (s in serie) {
        print("$s ")
    }
    println()

    //sintaxe shugar .. faz a mesma coisa que o metodo rangeTo ele inclui o ultimo numero da serie
    var numerosPares = 0..100  step 2
    for(numerosPar in numerosPares) {
        print("$numerosPar ")
    }

    println()

    //outra forma para não incluir o 100 e utilizar o until ou colocar um numero abaixo no range
    numerosPares = 2.until(100)  step 2
    for(numerosPar in numerosPares) {
        print("$numerosPar ")
    }

    println()
    //terceira função para criar series de valores reversos
    val numerosParesReversos = 100 downTo 0 step 2
    numerosParesReversos.forEach { print("$it ") } //it representa cada um dos numeros em serie

    println()
    val intervalo = 1500.0..5000.0
    val salario = 4000.0
    //in função de verificar se esta dentro ele atua diferente conforme o contexto
    if(salario in intervalo){
        println("Está dentro do intervalo")
    }else {
        println("Não está dentro do intervalo")
    }

    val alfabeto = 'a'..'z'
    val letra = 'k'
    println(letra in alfabeto)
}