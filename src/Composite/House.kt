package src.Composite

class House {
    val animals: ArrayList<IAnimal> = arrayListOf<IAnimal>()

    fun addAnimal(animal: IAnimal) {
        this.animals.add(animal)
    }

    fun getAvgAge(): Int {
        val sum = this.animals.fold(0) { sum, animal -> sum + animal.age }
        return sum / this.animals.size
    }
}
