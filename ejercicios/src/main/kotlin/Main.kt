class EjerciciosKotlin {

    // Ejercicio 1: Notificaciones
    //creamos la funcion para ingresar datos de notf
    fun notificacion() {
        val notificacionMañana = 51
        val notificacionTarde = 135
        //imprimimos el resultado de la funcion printNotificatioSumary con los datos ingresados
        printNotificatioSumary(notificacionMañana, notificacionTarde)
    }

    // creamos la funcion para imprimir el resultado de la suma de las notificaciones
    fun printNotificatioSumary(notificacionTarde: Int, notificacionManana: Int) {
        val notificacionesTotal = notificacionTarde + notificacionManana
        println("Tienes $notificacionesTotal notificaciones, $notificacionTarde por la tarde y $notificacionManana por la mañana")
    }

    // Ejercicio 2
    // Precio entradas de cine
    fun ticketPrice(age: Int, isMonday: Boolean) {
        // creamos una variable para almacenar el precio de la entrada
        var price = 0
        println("\n------------------------------" +
                "\nTabla de precios por edad: " +
                "\nNiños menores de 12 años: $15 usd " +
                "\nAdultos entre 13 y 59 años: $30 usd " +
                "\nAdultos mayores de 60 años: $20 usd" +
                "\n------------------------------" )
        // creamos una condicion para determinar el precio de la entrada segun la edad y si es lunes o no
        if (age < 12) {
            price = 15
            println("Eres un niño, el precio de la entrada es $price usd")
        } else if (age >= 13 && age < 60) {
            price = 30
            println("Eres un adulto, el precio de la entrada es $price usd")
        } else {
            price = 20
            println("Eres un adulto mayor, el precio de la entrada es $price usd")
        }
        // si es lunes, el precio se reduce a la mitad
        if (isMonday) {
            println("Es lunes! El precio de la entrada se reduce a la mitad")
            price /= 2
            println("su entrada cuesta $price usd")
        } else {
            println("No es lunes, el precio de la entrada se mantiene en $price usd")
        }
    }

    // Ejercicio 3
    // conversor de temperaturas F, K, C
    fun convertTemperature(temp: Double, opcion: Int) {
        //bucle para determinar la opcion de conversion y mostrar el resultado
        // es como un switch pero con when en kotlin
        when (opcion) {
            1 -> println(
                "$temp grados Celsius son ${temp * 9 / 5 + 32} grados Fahrenheit"
            )
            2 -> println(
                "$temp grados Celsius son ${temp + 273.15} grados Kelvin"
            )
            3 -> println(
                "$temp grados Fahrenheit son ${(temp - 32) * 5 / 9} grados Celsius"
            )
            4 -> println(
                "$temp grados Fahrenheit son ${(temp - 32) * 5 / 9 + 273.15} grados Kelvin"
            )
            5 -> println(
                "$temp grados Kelvin son ${temp - 273.15} grados Celsius"
            )
            6 -> println(
                "$temp grados Kelvin son ${(temp - 273.15) * 9 / 5 + 32} grados Fahrenheit"
            )
            else -> println("Opción no válida")
        }
    }

    // Ejercicio 4
    // Catalogo de canciones
    // se hizo en la clase CatalogoCanciones.kt

    // Ejercicio 5
    // Mostrar datos de perfil red social
    // se hizo en la clase PerfilRedSocial.kt


}








// corremos el ejercicio en el main
fun main(args: Array<String>) {
    // creamos una instancia de la clase EjerciciosKotlin y llamamos a la funcion notificacion para ejecutar el ejercicio
    println("Ejercicio 1: Notificaciones")
    val ejercicios = EjerciciosKotlin()
    ejercicios.notificacion()
    // variables int para el ejercicio 2
    val nino = 5
    val adult = 28
    val adultMajor = 87
    // variable de tipo boolean para el ejercicio 2
    println("Ejercicio 2: Entrada Cine")
    print("Es lunes? (true/false): ")
    val isMonday = readln().toBoolean()
    // llamamos a la funcion ticketPrice para ejecutar el ejercicio 2 con los datos ingresados
    // recordar ingresar si es niño, adulto o adulto mayor para ver el precio de la entrada
    ejercicios.ticketPrice(adult, isMonday)
    // Ejercicio 3: conversor de temperaturas
    println("\nEjercicio 3: Conversor de Temperaturas")
    print("Ingrese la temperatura a convertir: ")
    val temp = readln().toDouble()
    println(
        "Seleccione la opción de conversión: \n" +
                "1. Celsius a Fahrenheit \n" +
                "2. Celsius a Kelvin \n" +
                "3. Fahrenheit a Celsius \n" +
                "4. Fahrenheit a Kelvin \n" +
                "5. Kelvin a Celsius \n" +
                "6. Kelvin a Fahrenheit"
    )
    val opcion = readln().toInt()
    // llamamos a la funcion convertTemperature para ejecutar el ejercicio 3 con los datos ingresados
    ejercicios.convertTemperature(temp, opcion)
    // Ejercicio 4: Catálogo de canciones
    // creamos tres instancias de la clase CatalogoCanciones con diferentes datos para cada canción
    val cancion1 = CatalogoCanciones("Bohemian Rhapsody", "Queen", 1975, 354, 1000000)
    val cancion2 = CatalogoCanciones("Imagine", "John Lennon", 1971, 183, 500000)
    val cancion3 = CatalogoCanciones("Smells Like Teen Spirit", "Nirvana", 1991, 301, 750000)
    val cancion4 = CatalogoCanciones("Mami te quiero", "El chapas", 2026, 233, 20)
   // mostramos la información de cada canción y calculamos su popularidad utilizando las funciones de la clase CatalogoCanciones
    println("Información de la canción 1:")
    cancion1.mostrarCancion() // este metodo nos mostrara la informacion de la cancion1
    println("Popularidad: ${cancion1.calcularPopularidad()}\n") // aqui imprimimos el calculo de popularidad de la cancion1


    println("Información de la canción 2:")
    cancion2.mostrarCancion()
    println("Popularidad: ${cancion2.calcularPopularidad()}\n")

    println("Información de la canción 3:")
    cancion3.mostrarCancion()
    println("Popularidad: ${cancion3.calcularPopularidad()}\n")

    println("Información de la canción 4:")
    cancion4.mostrarCancion()
    println("Popularidad: ${cancion4.calcularPopularidad()}\n")

    // ejercicio 5: mostrar datos de perfil red social
    println("Ejercicio 5: Perfil Red Social")
    // creamos una instancia de la clase  perfil red social con datos de ejemplo
    val referido1 = PerfilRedsocial.Person("Carlos López", 35)
    val perfil1 = PerfilRedsocial("Juan Pérez", 30, "Fotografía", referido1)
    // mostramos la información del perfil utilizando la función showProfile de la clase PerfilRedsocial
    perfil1.showProfile()
    // otra instancia de perfil red social sin hobby, pero referido por otro perfil
    val perfil2 = PerfilRedsocial("María Gómez", 25, null, referido1)
    perfil2.showProfile()
    // otra instancia de perfil red social sin hobby ni referido
    val perfil3 = PerfilRedsocial("Ana Torres", 40, null, null)
    perfil3.showProfile()
    // Ejercicio 6: Celular plegable
        println("\nEjercicio 6: Celular Plegable")
        // instancia para un celular plegable
        println("Celular plegable:")
        val foldablePhone = FoldableCellphone()
        foldablePhone.checkPhoneScreenLight() // Verificar estado inicial
        foldablePhone.fold() // Doblar el teléfono
        foldablePhone.checkPhoneScreenLight() // Verificar estado después de doblar
        foldablePhone.unfold() // Desdoblar el teléfono
        foldablePhone.checkPhoneScreenLight() // Verificar estado después de desdoblar
        // instancia para un celular normal
        println("\nCelular normal:")
        val regularPhone = Cellphone()
        regularPhone.checkPhoneScreenLight() // Verificar estado inicial
        regularPhone.switchEncendida() // Encender el teléfono
        regularPhone.checkPhoneScreenLight() // Verificar estado después de encender





}