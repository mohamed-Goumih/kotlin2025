
// EP11 : Exercices sur les Tableaux en Kotlin

fun main() {
    val tab = intArrayOf(1, 2, 3, 4, 2, 0, 5, 0, 3)

    println("111 -> " + sommeTab(tab))
    println("112 -> " + inverser(tab).joinToString())
    println("113 -> " + deuxiemePlusGrand(tab))
    println("114 -> " + estPalindrome(intArrayOf(1,2,3,2,1)))
    println("115 -> " + zerosFin(tab).joinToString())
    println("116 -> " + uniques(tab).joinToString())
    println("117 -> " + ajouter(tab, 9).joinToString())
    println("118 -> " + supprimer(tab, 2).joinToString())
    println("119 -> " + compter(tab, 2))
    println("1110 -> " + tousPairs(intArrayOf(2,4,6)))
    println("1111 -> " + trierDesc(tab).joinToString())
}

// 111
fun sommeTab(tab: IntArray): Int = tab.sum()

// 112
fun inverser(tab: IntArray): IntArray {
    val res = IntArray(tab.size)
    for (i in tab.indices) {
        res[i] = tab[tab.lastIndex - i]
    }
    return res
}

// 113
fun deuxiemePlusGrand(tab: IntArray): Int {
    var max1 = Int.MIN_VALUE
    var max2 = Int.MIN_VALUE
    for (x in tab) {
        if (x > max1) {
            max2 = max1
            max1 = x
        } else if (x > max2 && x != max1) {
            max2 = x
        }
    }
    return max2
}

// 114
fun estPalindrome(tab: IntArray): Boolean {
    var i = 0
    var j = tab.lastIndex
    while (i < j) {
        if (tab[i] != tab[j]) return false
        i++; j--
    }
    return true
}

// 115
fun zerosFin(tab: IntArray): IntArray {
    val res = mutableListOf<Int>()
    var zeros = 0
    for (x in tab) {
        if (x == 0) zeros++ else res.add(x)
    }
    repeat(zeros) { res.add(0) }
    return res.toIntArray()
}

// 116
fun uniques(tab: IntArray): IntArray = tab.toSet().toIntArray()

// 117
fun ajouter(tab: IntArray, elem: Int): IntArray = tab + elem

// 118
fun supprimer(tab: IntArray, elem: Int): IntArray =
    tab.filter { it != elem }.toIntArray()

// 119
fun compter(tab: IntArray, elem: Int): Int =
    tab.count { it == elem }

// 1110
fun tousPairs(tab: IntArray): Boolean = tab.all { it % 2 == 0 }

// 1111
fun trierDesc(tab: IntArray): IntArray = tab.sortedDescending().toIntArray()
