
class PerfilRedsocial (val name: String, val age: Int, val hobby: String?, val referrer: Person?)
{
class Person(val name: String, val age: Int)
    fun showProfile() {
        println("Nombre: $name")
        println("Edad: $age")
        if (hobby != null) {
            println("Hobby: $hobby")
        } else {
            println("Hobby: No especificado")
        }
        if (referrer != null) {
            println("Referido por: ${referrer.name}, edad ${referrer.age}")
        } else {
            println("Referido por: No especificado")
        }
    }
}


