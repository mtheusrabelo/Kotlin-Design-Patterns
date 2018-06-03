package src.Composite

fun main(args: Array<String>) {
    val dog = Dog(7)
    val cat = Cat(4)
    val house = House()
    house.addAnimal(dog)
    house.addAnimal(cat)
    println(house.getAvgAge())
}
