package src.Decorator

fun main(args: Array<String>) {
    val warrior = Warrior(5)
    val equippedWarrior = Equip(warrior.copy())
    warrior.attack()
    equippedWarrior.attack()
}
