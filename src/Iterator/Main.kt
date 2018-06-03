package src.Iterator

fun main(args: Array<String>) {
    val blockChain = BlockChain()
    blockChain.add("a")
    blockChain.add("b")
    blockChain.add("c")
    blockChain.add("d")
    println(blockChain.current())
    blockChain.next()
    blockChain.next()
    println(blockChain.current())
}
