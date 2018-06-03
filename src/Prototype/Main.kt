package src.Prototype

fun main(args: Array<String>) {
    val student = Student("Matheus", 21, "Computer Science")
    val studentCopy = student.copy()
    studentCopy.age = 30
    println(student)
    println(studentCopy)
}
