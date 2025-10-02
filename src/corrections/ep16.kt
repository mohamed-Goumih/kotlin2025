fun main() {

    //161
    val capitals = mutableMapOf<String,String>(
        "maroc" to "rabat",
        "espagne" to "madrid",
        "france" to "paris",
        "USA" to "Washington",

    )
    println("$capitals")
    //162

    capitals["Egypt"]= "Caire"
    capitals["Italy"]= "Milan"
    capitals["Belgique"]= "Bruxelle"
    println("$capitals")

    //163

            if( "Suisse" in capitals.keys  )
            {
                capitals["Suisse"] = "Rome"
                println("L'element avec indice 5 à été mise a jour avec valeur 'Rome'")
                println(capitals)
            }
         else {
        capitals.put("Suisse","BERN")
        println("capitale de Italy a ete ajouté")
                println(capitals)
    }
    //164
    for((key,value) in capitals) {
        println("La capitale de $key est $value.")
    }

    //165
    val capitalsB = capitals.filterKeys{ it.startsWith("B") }
    println("Le map avec seulement les pays qui debut avec le lettre 'B' sont: $capitalsB")

    //166
    val capitalsVal = capitals.map{ it.value }
    println("Le map aprés transformer en liste de capitales seulement est: $capitalsVal")
    //167
    capitals.remove("Egypt")
    println("egypte a été supprimer : $capitals")
    //168
    val capitalMutible = capitals.toMap()
    //capitalMutible["Allemand"]= "berlin"
    //println("ajout allemen a la liste :$capitalMutible")
    //on peut pas modifier la liste
  //169
    val grandeVille=mutableMapOf<String,List<String>>()

    val villes=mutableMapOf(
        "Maroc" to listOf("Casablanca","Rabat","Agadir"),
        "USA" to listOf("New York","Las Vegas","Los Angeles"),
    )
    grandeVille.putAll(villes)
    //1610
    grandeVille["Korea"]= listOf("Busan","Seoul","Daegu")
    for((pays,ville)in grandeVille){
        println("les grandes ville de $pays sont:$ville")
    }
}