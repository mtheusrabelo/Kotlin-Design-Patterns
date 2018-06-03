package src.Decorator

interface IWarrior {
    var attack: Int

    fun attack() {
        println("Attack with level ${this.attack}")
    }
}
