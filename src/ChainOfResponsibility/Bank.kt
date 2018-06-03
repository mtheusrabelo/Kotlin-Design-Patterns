package src.ChainOfResponsibility

class Bank() {
    fun pay(cardNumber: String, amount: Int) {
        println("Paid amount of ${amount} from ${cardNumber}")
    }
}
