package br.com.alura.array

import br.com.alura.teste.testaAumentoSalario
import br.com.alura.teste.testaOperacoesAgregadoras
import br.com.alura.teste.testeMaiorEMenorIdade
import br.com.alura.teste.testeRange
import java.math.BigDecimal
import java.math.RoundingMode


fun main() {
//    testeMaiorEMenorIdade()
//    testaAumentoSalario()
//    testeRange()
//    testaOperacoesAgregadoras()

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
        .map { salario ->
            if (salario < "5000".toBigDecimal()) {
                salario + "500.00".toBigDecimal()
            } else {
                (salario * aumento).setScale(2, RoundingMode.UP)
            }
        }
        .toTypedArray()

    println(salariosComAumento.contentToString())

}

//Criação de Array de forma dinamica
//vararg podemos passar duas variaveis ou mais
fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    //Essa função esta pebando cada valor pelo indice i e convertendo para Big Decimal
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}
