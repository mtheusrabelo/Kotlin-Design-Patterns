package src.Iterator

class BlockChain(val chain: MutableList<String> = mutableListOf<String>()) {
    var index = 0

    fun isValid(block: String): Boolean {
        return true
    }

    fun add(block: String) {
        if (this.isValid(block)) {
            this.chain.add(block)
        }
    }

    fun current(): String {
        return this.chain[index]
    }

    fun remove() {
        this.chain.removeAt(index)
    }

    fun previous() {
        if (this.index > 0) {
            this.index--
        }
    }

    fun next() {
        if (this.index < this.chain.size - 1) {
            this.index++
        }
    }
}
