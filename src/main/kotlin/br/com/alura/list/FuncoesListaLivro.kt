package br.com.alura.list

/*
    Criação de uma “extension function” da lista de livros - “fun Mutable“.
    “this”, que representa a nossa lista de livros
    “joinToString” vai receber uma função onde vai ter cada elemento do livro
    “(separador =)” para cada elemento de livro, eu vou ter um separador.
    foi definido o separador para pular linha
    -> A função “map”, é uma função que me diz como vou transformar a minha lista de livros.
    Eu quero transformar a minha lista de livros em uma lista de títulos.
    Então é só eu pegar o meu livro, “.titulo” e agora, ao invés de ter uma lista de livros,
    eu vou ter uma lista de string com os títulos dos livros.
    -> “filterNotNull” é exatamente a mesma coisa que fizemos antes, o “.filter { it != null}”,
    mas ela tem uma vantagem, que é o fato de o compilador conhecer essa função.
 */

fun List<Livro?>.imprimeComMarcadores(){
    val textoFormatado = this
        .filterNotNull()
        .joinToString(separator = "\n" ) {
        " - ${it.titulo} de ${it.autor}"
    }
    println(" ### Lista de Livros ### \n$textoFormatado")
}