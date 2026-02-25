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


}








// corremos el ejercicio en el main
fun main(args: Array<String>) {
    // creamos una instancia de la clase EjerciciosKotlin y llamamos a la funcion notificacion para ejecutar el ejercicio
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
    // variables para el ejercicio 3
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
}