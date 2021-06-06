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

    /*
        Função “sorted” - vai trazer a nossa lista ordenada a partir de algum critério.
        Para usala o tipo “Livro” precisa ser um subtipo de “Comparable”.
        temos que ir na nossa classe “Livro” e implementarmos/estendermos o tipo “Comparable”


     */
    val ordenadoAnoPublicacao: List<Livro> = livros.sorted()
    ordenadoAnoPublicacao.imprimeComMarcadores()

    //reotrna a mesma coisa da função sorted porem aqui definimos o parametro de ordenação
    val ordenadoPorTitulo = livros.sortedBy { it.titulo }
    ordenadoPorTitulo.imprimeComMarcadores()

    livros.sortedBy { it.autor }.imprimeComMarcadores()

    /*
        Filtrar lista de livros
        “.filter{}” ele vai esperar uma função com um método de filtro
         A função “startsWith” vai esperar um parâmetro do tipo string
         ela vai verificar se é string, se autor começa com determinada string.
     */
    val titulos: List<String> = listaDeLivros
        .filter {it.autor.startsWith( "J")}
        .sortedBy { it.anoPublicacao }
        .map { it.titulo }

    println(titulos)
}
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
 */

fun List<Livro>.imprimeComMarcadores(){
    val textoFormatado = this.joinToString(separator = "\n" ) {
        " - ${it.titulo} de ${it.autor}"
    }
    println(" ### Lista de Livros ### \n$textoFormatado")
}