package src.ChainOfResponsibility

fun main(args: Array<String>) {
    val acquirer = Acquirer()
    acquirer.pay("1234", 550)
}
