package br.com.alura.array

/*
 Saber qual é o funcionario mais velho de uma equipe
 */
fun main(){
    val idade1 = 25
    val idade2 = 19
    val idade3 = 33
    val idade4 = 20

    val maiorIdade = if(idade1 > idade2 && idade1 > idade3 && idade1 > idade4) {
        idade1
    }else if(idade2 > idade3 && idade2 > idade4){
        idade2
    }else if(idade3 > idade4) {
        idade3
    }else{
        idade4
    }

    println(maiorIdade)

    /*
     Utilizando estrutura de dados - Array de Inteiros
     - e preciso informar o tamanho do array no momento da criação
     - o indice de Array começa na posição 0
     - Função para otimizar a criação de Array intArrayOf
     */

//    Metodo Tradicional
//    val idades = IntArray(5)
//    idades[0] = 25
//    idades[1] = 19
//    idades[2] = 33
//    idades[3] = 20
//    idades[4] = 55

    var idades: IntArray = intArrayOf(25, 19, 33, 20, 55, 40)

    //Utilização de um for para iteração

    var maiorIdadeArray = Int.MIN_VALUE
    for (idade in idades){
        if(idade > maiorIdadeArray){
            maiorIdadeArray = idade
        }
    }
    println("A maior idade do Array é $maiorIdadeArray")

    /*
    Outro metodo de iteração para descobrir a maior idade ao percorrer o Array
    - Int.MAX_VALUE é uma contante garanque que começa com o maior valor
     */

    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if(idade < menorIdade){
            menorIdade = idade
        }
    }

    println("A menor idade do Array é $menorIdade")

}