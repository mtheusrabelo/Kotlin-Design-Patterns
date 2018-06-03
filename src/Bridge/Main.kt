package src.Bridge

fun main(args: Array<String>) {
    val human = Human()
    val alien = Alien()
    val humanWorker = Worker(human)
    val alienWorker = Worker(alien)

    println(humanWorker.getAvaiableHours())
    println(alienWorker.getAvaiableHours())
}
