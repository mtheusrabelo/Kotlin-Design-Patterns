package src.Proxy

fun main(args: Array<String>) {
    val user = User("matheusrabelo")
    val premiumUser = Premium(user)
    val content = premiumUser.getExclusiveContent()
    println(content)
}
