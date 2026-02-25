

open class Cellphone(var isScreenLightOn: Boolean = false) {

    // Usamos open para permitir que las hijas cambien el comportamiento
    open fun switchEncendida() {
        isScreenLightOn = true
    }

    fun switchApagada() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val status = if (isScreenLightOn) "Encedida" else "Apagada"
        println("la luz de la pntalla esta $status.")
    }
}