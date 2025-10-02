//171
open class Vehicle{
    open fun drive(){
        println("le vehicle est onDrive")
    }
    class Car: Vehicle(){
        override fun drive(){
            println("la voiture est onDrive")
        }
    }
}

data class Book(val title: String, val author: String)

fun main() {
    val book1 = Book("Kotlin", "Ryan")
    println(book1.toString())
    val book2 = Book("Kotlin", "Ryan")
    println(book2.toString())
    val book3 = Book("Java", "Ryan")
    println(book3.toString())

    println("book1 egal book3 ? ${book1==book3}")

    println(book1.hashCode())
    println(book2.hashCode())
    println(book3.hashCode())
    println(book1.hashCode())






}