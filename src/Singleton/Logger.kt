package src.Singleton

object Logger {
    init {
        println("Initialing logger")
    }

    fun log(message: String) {
        println(message)
    }
}
