package br.com.alura.list

fun main() {

    /*
        O “groupBy” vai nos retornar um mapa.
        O “.forEach{}” para definirmos e navegarmos nesse nosso mapa.
        os parâmetros que a nossa função “forEach” recebe
        - são “(editora,” e os “, livros)”.
        Vamos jogar um valor padrão quando o valor da editora for null
     */

    listaDeLivros
        .groupBy { it.editora ?: "Editora desconhecida" }
        .forEach { (editora: String?, livros: List<Livro>) ->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }
}