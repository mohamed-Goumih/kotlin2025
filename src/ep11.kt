fun main() {

    val tabNombres=arrayOf(1,4,3,4,8,6,7,3,9,10)
///111
    println("111 :la somme des elements de tab est : ${sommeTab(tabNombres)} ")

    println("112 :l'inverse de ${inverseTab(tabNombres)}")
    println("113 :${dpg(tabNombres)}")
}
//111
fun sommeTab(tab: Array<Int>):Int{
    return tab.sum()
}
//112
fun inverseTab(tab: Array<Int>): String {
    var value = 0
    for (i in 0 until tab.size/2){
        value =  tab[i]
        tab[i] = tab[tab.size-i-1]
        tab[tab.size-i-1]=value
    }
    return tab.joinToString("-")
}
//113
fun dpg(t: Array<Int>):Int?{
    val  unique = t.distinct().sortedDescending()
    return if(unique.size < 2) null else unique[1]
}

