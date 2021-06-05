package br.com.alura.array

import br.com.alura.teste.bigDecimalArrayOf
import br.com.alura.teste.calculaAumentoRelativo
import java.math.BigDecimal

fun SalariosComBigDecimal() {
    /*
    Todo funcionario tem um aumento de 10%, e no minimo 500 caso o calculo resulte
     em um valor inferior, utilizaremos o tipo BigDecimal por questões de arredondamento
     visando garantir exatidão no calculo
     O bigDeciaml e um tipo primitivo ele não tem uma implementação de array
     criaremos um objeto e com essa classe criaremos um Array
     */

    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")

//        Array<BigDecimal>(5){ BigDecimal.ZERO }
//    salarios[0] = "1500.55".toBigDecimal() //para conversão visando o arredondamento usamos o string
//    salarios[1] = "2000.00".toBigDecimal()
    println(salarios.contentToString())

    /*
    Manteremos dois array um tera o valor iniciar e outro com valor do aumento
    utilizaremos a função map para mapear diferente o forEach a função map ela retorna outra
    lista vamos precisar fazer uma conversão para Array
     */


    //Estamos pegando salarios mapeando cada salario  * aumento
    // e convertendo para um Array de volta com aumento
    //definimos agora com o set a quantidade de valores após a vilgula e o arredondamento
    //calculo com if para o aumento minimo de R$500
    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios
        .map { salario -> calculaAumentoRelativo(salario, aumento) }
        .toTypedArray()

    println(salariosComAumento.contentToString())
    /*
    precisa calcular a somatoria dos salarios
    exemplo ao utilizar um valor primitivo Int - intArrayOf(1,2,3).sum()
    valomos criar uma função customizada para o BigDecimal
     */

    val gastoInicial = salariosComAumento.somatoria()
    println(gastoInicial)
}

/*
    Estamos fazendo uma extension function de Array de bigDecimal para chamar ela no formato
    O Reduce ele recebe uma função com parametros um acumulador e um valor
    -> o valor é o elemento do array que esta sendo enterado
    -> o acumulador é a somatoria da interação
 */
fun Array<BigDecimal>.somatoria(): BigDecimal {

    //reduz o array a um unico valor
    return this.reduce { acumulador, valor ->
        acumulador + valor
    }
}