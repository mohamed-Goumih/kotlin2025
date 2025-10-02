fun main() {
    val table=arrayOf(10,20,30,40)
    val newTable=table.plus(50)
    table.plus(60)
    println(newTable.joinToString(","))
    println(table.joinToString(","))

    for (i in table.indices){
        table[i]=table[i]+50
    }
    println(table.joinToString(","))
}