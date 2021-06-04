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
     -
     */

    val idades = IntArray(4)
    idades[0] = 25
    idades[1] = 19
    idades[2] = 33
    idades[3] = 20


}