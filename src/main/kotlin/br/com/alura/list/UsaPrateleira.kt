package br.com.alura.list

fun main() {
    val prateleira = Prateleira(genero = "literatura", livros = listaDeLivros)

    val porAutor = prateleira.organizarPorAutor()
    val porAnoPublicacao =prateleira.organizarPorAnoPublicacao()

    porAutor.imprimeComMarcadores()
    porAnoPublicacao.imprimeComMarcadores()
}