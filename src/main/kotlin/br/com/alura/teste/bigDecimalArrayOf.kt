package br.com.alura.teste

import java.math.BigDecimal

//Criação de Array de forma dinamica
//vararg podemos passar duas variaveis ou mais
fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    //Essa função esta pebando cada valor pelo indice i e convertendo para Big Decimal
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}
