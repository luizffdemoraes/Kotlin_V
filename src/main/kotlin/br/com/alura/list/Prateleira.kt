package br.com.alura.list

data class Prateleira(
    val genero: String,
    val livros: List<Livro>
) {
    /*
        Quando usamos a função “sortBy” é isso que estamos fazendo,
        estamos alterando a lista internamente.
        A função “sortedBy”, ao invés de alterar a própria lista, ela nos retorna uma lista nova.
     */
    fun organizarPorAutor(): List<Livro> {
        return livros.sortedBy { it.autor }
    }

    fun organizarPorAnoPublicacao(): List<Livro> {
        return livros.sortedBy { it.anoPublicacao }

    }
}
