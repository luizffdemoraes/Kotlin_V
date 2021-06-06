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
