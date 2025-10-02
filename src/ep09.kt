//91
val c={a:Int,action:()->Unit->
    for (i in 1..a) action() }
//92
val prod: (Int,Int) -> Int = { a,b -> a*b}
//93
val nombre = listOf(2,11,5,8,7,9)
val filt = nombre.filter{ it % 2 != 0}

//94
 val chaines=listOf("kotlin","java","python","javaScript")
val newChaine= chaines.sortedBy { it.length }

//95

val addNumber :(Int)->(Int)->Int={x-> {y->x+y}}
val addFive =addNumber(5)

//96

//97

fun main() {
   //91
c(5,{println("bonjour")})
    //92
    println(prod(4,5))
    //93
    //println(filt)
    println(listOf(2,11,5,8,7,9).filter{it % 2 != 0})
    //94
    println("chaine :$newChaine")
    //95
    println("ajouter 5 a 10 :${addFive(10)}")

    //96

    println("La liste du cubes est: " +
            "${listOf(2,11,5,8,7,9).map{ it * it}
                .fold(0){ sum,nbr -> sum + nbr }}")

    println("La liste du cubes est: " +
            "${listOf(2,11,5,8,7,9).sumOf { it * it }}")

    //97
    println("La liste du prenoms triées est: ${listOf("Ahmed","Maryam","Khalid","Younes","Zakaria").sortedBy { it.length }}")
}