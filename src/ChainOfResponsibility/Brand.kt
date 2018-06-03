package src.ChainOfResponsibility

class Brand() {
    val bank: Bank

    init {
        this.bank = Bank()
    }

    fun pay(cardNumber: String, amount: Int) {
        return this.bank.pay(cardNumber, amount)
    }
}
