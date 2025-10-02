
// EP12 : Exercices sur les Paires en Kotlin

fun main() {
    val pairs = arrayOf(Pair(3, 2), Pair(1, 1), Pair(0, 0), Pair(4, 5), Pair(2, 8))

    println("121 -> " + pairesPremierSup(pairs).joinToString())
    println("122 -> " + nbPairesEgales(pairs))
    println("123 -> " + sommeDesPremiers(pairs))
    println("124 -> " + differences(pairs).joinToString())
    println("125 -> " + tousPositifs(pairs))
    println("126 -> " + pairesSecondPair(pairs).joinToString())
    println("127 -> " + paireSommeMax(pairs))
    println("128 -> " + inverserPaires(pairs).joinToString())
    println("129 -> " + sommesParPaire(pairs).joinToString())
    println("1210 -> " + egaliteParPaire(pairs).joinToString())
    println("1211 -> " + nbPairesSommeImpaire(pairs))
}

// 121
fun pairesPremierSup(p: Array<Pair<Int, Int>>): Array<Pair<Int, Int>> =
    p.filter { it.first > it.second }.toTypedArray()

// 122
fun nbPairesEgales(p: Array<Pair<Int, Int>>): Int =
    p.count { it.first == it.second }

// 123
fun sommeDesPremiers(p: Array<Pair<Int, Int>>): Int =
    p.map { it.first }.sum()

// 124
fun differences(p: Array<Pair<Int, Int>>): IntArray =
    p.map { it.first - it.second }.toIntArray()

// 125
fun tousPositifs(p: Array<Pair<Int, Int>>): Boolean =
    p.all { it.first > 0 && it.second > 0 }

// 126
fun pairesSecondPair(p: Array<Pair<Int, Int>>): Array<Pair<Int, Int>> =
    p.filter { it.second % 2 == 0 }.toTypedArray()

// 127
fun paireSommeMax(p: Array<Pair<Int, Int>>): Pair<Int, Int>? =
    p.maxByOrNull { it.first + it.second }

// 128
fun inverserPaires(p: Array<Pair<Int, Int>>): Array<Pair<Int, Int>> =
    p.map { Pair(it.second, it.first) }.toTypedArray()

// 129
fun sommesParPaire(p: Array<Pair<Int, Int>>): IntArray =
    p.map { it.first + it.second }.toIntArray()

// 1210
fun egaliteParPaire(p: Array<Pair<Int, Int>>): BooleanArray =
    p.map { it.first == it.second }.toBooleanArray()

// 1211
fun nbPairesSommeImpaire(p: Array<Pair<Int, Int>>): Int =
    p.count { (it.first + it.second) % 2 != 0 }
