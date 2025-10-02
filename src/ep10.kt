
import kotlin.system.measureTimeMillis
import kotlin.time.measureTime

fun main()
{
    //98
    val nombres = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val carrePair = nombres.filter { it % 2 == 0 }.map { it * it }
   // println(carrePair)

    //99
    val fruits = listOf("appel", "orange", "banana", "mangos")
    //fruits.forEach(::println)

    //910
    val mots = listOf("kotlin" , "java" , "py" , "js")
    val trouver = mots.find{it.length > 5} ?: "aucun resultat"
    //println(trouver)


//    println("101 :${fibonacci(6)}")
//    println("${fibrec(6)}")
//    //102
//    println("${somme(4)}")
//    println("${somme2 (4)}")

    val n=50


    val timeFibo1= measureTimeMillis { fibonacci(n) }
    val timeFibo2= measureTimeMillis { fibrec(n) }

    //println(" fibonacci normale :${timeFibo1}")
    //println(" fibonacci optimisé :${timeFibo2}")

}

//101
fun fibonacci(n: Int):Int{
    return if (n<=1) n else fibonacci(n-1) +fibonacci(n-2)
}
tailrec fun fibrec(n:Int ,a:Int=0 ,b:Int=1):Int{
    return if (n == 0) a else fibrec(n-1 ,b,a+b)
}
fun somme (n : Int): Int {
    if (n in 0..1) return n
    else return n + somme(n-1)

}
tailrec fun somme2 (n:Long , a:Long=0, ):Long{
    if (n == 0L) return  a else return somme2(n-1 ,a+n)
}

//104
