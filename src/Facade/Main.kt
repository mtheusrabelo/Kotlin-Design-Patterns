package src.Facade

fun main(args: Array<String>) {
    val human = Human()
    val humanFacade = HumanFacade(human)
    humanFacade.getDay()
}
