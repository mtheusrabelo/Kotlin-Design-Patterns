package src.SimpleFactory

object PremiumFactory {
    fun makePremium(user: User) {
        user.isPremium = true
    }
}