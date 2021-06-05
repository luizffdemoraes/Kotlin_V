package br.com.alura.array

import br.com.alura.teste.bigDecimalArrayOf
import br.com.alura.teste.calculaAumentoRelativo
import br.com.alura.teste.somatoria
import java.math.BigDecimal
import java.math.RoundingMode

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


    /*
    Somatoria de todos os gastos com funcionários em um periodo de 6 meses
     */
    //fold ele recebe um valor inicial e torna em um valor unico semelhante ao reduce
    val meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)

    }
    println(gastoTotal)


    /*
    média dos três maiores salários dos funcionários
    -> sorted retorna uma lista ordenada do menor para o maior
    -> take ela pega os primeiros valores
    -> takeLast ela pega os ultimos valores ele não devolve um array sim um List
    - precisamos converter com toTypedArray()

    criaremos uma função de media
     */

//    val salariosOrdenados = salariosComAumento.sorted()
//    val tresUltimosSalarios: Array<BigDecimal> = salariosOrdenados.takeLast(3).toTypedArray()
//    val media = tresUltimosSalarios.media()

    //Refatoração do codigo acima 
    val media = salariosComAumento
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .media()

    println(media)

    // Pegar a média dos menores salários
    val mediaMenoresSalarios = salariosComAumento.sorted().take(3).toTypedArray().media()
    println(mediaMenoresSalarios)
}

fun Array<BigDecimal>.media(): BigDecimal {
    return if(this.isEmpty()){
        BigDecimal.ZERO
    } else {
        this.somatoria() / this.size.toBigDecimal()
    }
}