fun main() {
//    println("${sommeList(listOf(1,2,3,4,5))}")
//    println(inverseChaine("kotlin"))
//    println("105 :${pgcd1(54,24)}")
    println(pilandrome("radar"))
}
fun sommeList (n: List<Int>): Int {
    if (n.isEmpty()) return 0
    else if (n.size == 1) return n[0]
    else return n[n.size-1]+ sommeList(n.take(n.size-1))
}

//104
fun inverseChaine(s:String):String =
    if (s.isEmpty())"" else
        inverseChaine(s.substring(1)) + s[0]
                       // s.drop(1)+s.first()

//105 :PGCD
fun pgcd1 (a:Int ,b:Int):Int{
    return if (b==0) a else pgcd(b,a%b)

}
//107
tailrec fun pilandrome(a:String):Boolean{
    if(a.length<=1) return true
    if(a.first()!=a.last()) return false
    return pilandrome(a.substring(1,a.length-1))
}


