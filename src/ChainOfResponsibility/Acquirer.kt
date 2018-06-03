package src.ChainOfResponsibility

class Acquirer() {
    val brand: Brand

    init {
        this.brand = Brand()
    }

    fun pay(cardNumber: String, amount: Int) {
        return this.brand.pay(cardNumber, amount)
    }
}
