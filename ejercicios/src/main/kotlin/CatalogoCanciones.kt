class CatalogoCanciones(
    var titulo: String,
    var artista: String,
    var ano: Int,
    var duracion: Int,
    var reproducciones: Int
) {

    fun calcularPopularidad(): String {
        return when (reproducciones) {
            in 0..1000 -> "Poco popular"
            in 1001..10000 -> "Popular"
            in 10001..100000 -> "Muy popular"
            else -> "Extremadamente popular"
        }
    }

    fun mostrarCancion() {
        println("---------------------")
        println("Título: $titulo")
        println("Artista: $artista")
        println("Año: $ano")
        println("Duración: $duracion segundos")
        println("Reproducciones: $reproducciones")
    }
}