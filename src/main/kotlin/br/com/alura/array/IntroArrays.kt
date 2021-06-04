package br.com.alura.array

import br.com.alura.teste.testeMaiorEMenorIdade

/*
    Calcular 10% de aumento no salário de cada um dos funcionários
 */
fun main(){
//    testeMaiorEMenorIdade()

    //Criação de Array tipo Double
    var salarios: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)

    val aumento = 1.1
//    var indice = 0
//    //For incrementar o indice manualmente
//    for(salario in salarios){
//        salarios[indice] = salario * aumento
//        indice++
//    }
//    println("O valor dos salarios após aumentar 10% foi ${salarios.contentToString()}")

    //For sem incrementar o indice manualmente
    for(indice in salarios.indices){
        salarios[indice] = salarios[indice] * aumento
    }
    //Exibir valores dentro do array contentToString
    println("O valor dos salarios após aumentar 10% foi ${salarios.contentToString()}")

    //Função forEachIndexed para percorrer e realizar calculo de aumento

    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * aumento
    }

    println("O valor dos salarios após aumentar 10% foi ${salarios.contentToString()}")
}

