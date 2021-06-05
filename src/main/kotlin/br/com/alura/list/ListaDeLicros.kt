package br.com.alura.list

fun main() {
    val livro1 = Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    )

    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )

    val livro3 = Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    )

    val livro4 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    /*
        Agrupar os livros em uma lista - Lista trabalha com objetos
        Assim como no java no kotlin temos generics e uma caracteristica para criar objeto de tipo generico
        Diferença do List e Array
        A lista permite utilizar o metodo add pois tem tamanhos dinamicos
        Array os valores são fixos caso precise aumentar e necessário criar um novo array
        Agora listas mutaveis permite alteração
     */
    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

    livros.add(
        Livro(
            titulo = "Sagarana",
            autor = "João Guimarães Rosa",
            anoPublicacao = 1946
        )
    )

    livros.imprimeComMarcadores()

    livros.remove(livro1)

    livros.imprimeComMarcadores()



}
/*
    Criação de uma “extension function” da lista de livros - “fun Mutable“.
    “this”, que representa a nossa lista de livros
    “joinToString” vai receber uma função onde vai ter cada elemento do livro
    “(separador =)” para cada elemento de livro, eu vou ter um separador.
    foi definido o separador para pular linha
 */

fun MutableList<Livro>.imprimeComMarcadores(){
    val textoFormatado = this.joinToString(separator = "\n" ) {
        " - ${it.titulo} de ${it.autor}"
    }
    println(" ### Lista de Livros ### \n$textoFormatado")
}