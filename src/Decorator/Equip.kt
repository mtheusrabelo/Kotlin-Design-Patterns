package src.Decorator

class Equip(val warrior: Warrior): IWarrior by warrior {
    init {
        this.attack = this.attack * 2
    }
}
