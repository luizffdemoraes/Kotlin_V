package br.com.alura.list

import kotlin.collections.sortBy

data class Prateleira(
    val genero: String,
    val livros: MutableList<Livro>
) {
    //Quando usamos a função “sortBy” é isso que estamos fazendo,
    // estamos alterando a lista internamente.
    fun organizarPorAutor(): MutableList<Livro> {
        livros.sortBy { it.autor }
        return livros
    }

    fun organizarPorAnoPublicacao(): MutableList<Livro> {
        livros.sortBy { it.anoPublicacao }
        return livros
    }
}
