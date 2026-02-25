class FoldableCellphone(var isFolded: Boolean = false) : Cellphone() {

    fun fold() {
        isFolded = true // Actualizamos el estado
        switchApagada()    // Usamos la función de la clase padre
        println("El teléfono está doblado.")
    }

    fun unfold() {
        isFolded = false // Actualizamos el estado
        switchEncendida()      // Usamos la función de la clase padre
        println("El teléfono está desdoblado.")
    }

}