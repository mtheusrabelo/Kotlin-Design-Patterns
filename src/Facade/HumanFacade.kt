package src.Facade

class HumanFacade(val human: Human) {
    fun getDay() {
        this.human.wakeUp()
        this.human.walk()
        this.human.eat()
        this.human.walk()
        this.human.sleep()
    }
}