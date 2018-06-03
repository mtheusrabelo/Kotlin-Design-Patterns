package src.Builder

fun main(args: Array<String>) {
    val houseBuilder = HouseBuilder()
    houseBuilder.addWindow()
    houseBuilder.addWall()
    val house = houseBuilder.build()

    println(house.hasWindow)
    println(house.hasDoor)
    println(house.hasWall)
}
