
//91
fun repeatAction(n: Int, action: () -> Unit) {
    repeat(n) { action() }








}
//92
val produit: (Int, Int) -> Int = { a, b -> a * b }
//93
val nombres = listOf(1, 2, 3, 4, 5, 6, 7)
val impairs = nombres.filter { it % 2 != 0 }

//94
val mots = listOf("Kotlin", "Go", "Python", "JavaScript")
val tries = mots.sortedBy { it.length }

//95
fun ajouter(n: Int): (Int) -> Int = { x -> x + n }
val plusCinq = ajouter(5)

//96
val nums = listOf(1, 2, 3, 4)
val sommeCarres = nums.map { it * it }.sum()

//97
val prenoms = listOf("Ali", "Mohamed", "Sami", "Zineb")
val tries2 = prenoms.sortedBy { it.length }

//98
val list = listOf(1, 2, 3, 4, 5, 6)
val carresPairs = list.filter { it % 2 == 0 }.map { it * it }

//99
val fruits = listOf("Pomme", "Banane", "Orange")

//910
val mots2 = listOf("chat", "chien", "éléphant", "lion")
val resultat = mots2.find { it.length > 5 } ?: "Aucun mot trouvé"

//101
fun fib(n: Int): Long = when (n) {
    0 -> 0
    1 -> 1
    else -> fib(n - 1) + fib(n - 2)
}

tailrec fun fibTR(n: Int, a: Long = 0, b: Long = 1): Long =
    if (n == 0) a else fibTR(n - 1, b, a + b)

//102
fun sommeN(n: Long): Long = if (n <= 1) n else n + sommeN(n - 1)

tailrec fun sommeNTR(n: Long, acc: Long = 0): Long =
    if (n == 0L) acc else sommeNTR(n - 1, acc + n)

// println(sommeN(10))   // 55
// println(sommeNTR(1_000_000)) // OK grâce à tailrec

//103
fun sommeListe(xs: List<Int>): Int =
    if (xs.isEmpty()) 0 else xs.first() + sommeListe(xs.drop(1))

tailrec fun sommeListeTR(xs: List<Int>, acc: Int = 0, i: Int = 0): Int =
    if (i == xs.size) acc else sommeListeTR(xs, acc + xs[i], i + 1)

// println(sommeListe(listOf(1,2,3,4)))   // 10

//104
fun reverseRec(s: String): String =
    if (s.isEmpty()) "" else reverseRec(s.drop(1)) + s.first()

tailrec fun reverseTR(s: String, acc: String = ""): String =
    if (s.isEmpty()) acc else reverseTR(s.drop(1), s.first() + acc)

// println(reverseRec("kotlin")) // niltok

//105
fun pgcd(a: Int, b: Int): Int = if (b == 0) kotlin.math.abs(a) else pgcd(b, a % b)

tailrec fun pgcdTR(a: Int, b: Int): Int =
    if (b == 0) kotlin.math.abs(a) else pgcdTR(b, a % b)

// println(pgcd(54, 24)) // 6

//106
fun estPalindrome(s: String): Boolean {
    fun rec(l: Int, r: Int): Boolean =
        if (l >= r) true
        else if (s[l] != s[r]) false
        else rec(l + 1, r - 1)

    return rec(0, s.lastIndex)
}

// println(estPalindrome("radar")) // true
// println(estPalindrome("kotlin")) // false











fun main() {
    repeatAction(5) { println("Bonjour") }

}
