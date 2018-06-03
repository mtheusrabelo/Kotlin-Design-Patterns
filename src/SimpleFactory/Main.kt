package src.SimpleFactory

fun main(args: Array<String>) {
    val user = User("matheusrabelo", "Matheus")
    PremiumFactory.makePremium(user)
    if (user.isPremium) {
        println("${user.firstName} is now premium")
    }
}
