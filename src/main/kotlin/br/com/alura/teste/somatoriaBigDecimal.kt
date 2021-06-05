package br.com.alura.teste

import java.math.BigDecimal

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