fun main() {
    val greenNumbers=listOf(1,4,2,23)
    val redNumbers=listOf(17,2)
    val totalNumber=greenNumbers.size+redNumbers.size
    println("le nombre total est: ${totalNumber}")
//152
    val SEPORTTED=setOf("HTTP","HTTPS","FTP")
    val requested ="stmp"
    val isSupported =requested in SEPORTTED
    println("supported for $requested:$isSupported")

    //153
    val number2word =mapOf(1 to "one",2 to "two",3 to "three")
    val n =2
    println(number2word[n])
}