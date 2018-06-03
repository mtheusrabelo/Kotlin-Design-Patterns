package src.Bridge

class Worker(val creature: ICreature) {
    fun getAvaiableHours(): String {
        return "I'm available for ${this.creature.availableHours} hours a day"
    }
}
