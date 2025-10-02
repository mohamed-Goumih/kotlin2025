// 173
class Livre(
    val title:String,
    val author:Author )
    : Imprimable,ItemDebibliotheque(2025,"Livre") {

    override fun imprim (){
        println("titre: $title, ID:$id,Author:$author")
    }

    //getters & setters par defaut existent
}

class Author(
    val id:Int,
    val name:String
    )
{
    private val livres = mutableListOf<Livre>()

    fun getLivres():List<Livre> = this.livres
    fun addLivre(livre:Livre){ if(livre !in this.livres) this.livres.add(livre) }
    fun remLivre(livre:Livre){ if(livre in this.livres) this.livres.remove(livre) }
}

// 174
interface Imprimable {
    fun imprim()
}
// 175
abstract class ItemDebibliotheque(anneAj: Int, type: String) {
    companion object { var nbrItem = 0 }
    val id = ++nbrItem
}

// 176
class Bibliotheque {
    private var lstAuthors = mutableListOf<Author>()

    constructor(lstA: MutableList<Author>) {
        this.lstAuthors = lstA
    }

    fun getAuthors() = this.lstAuthors

    fun affichAuthors() {
        println("La list des authors:")
        for(author in this.getAuthors()) {
            println("author: ${author.name}")
            println("lives: ${author.getLivres().map{ it.title }.joinToString(",")}")
        }
    }


    fun addLivre(livre: Livre) {
        if(livre.author in lstAuthors) {
            livre.author.addLivre(livre)
            println("Le livre ${livre.title} à été ajouter dans la bibliotheque")
        } else {
            println("Le livre ${livre.title} est déja dans la bibliotheque")
        }
    }

    fun remLivre(livre: Livre) {
        if(livre.author in lstAuthors) {
            livre.author.remLivre(livre)
            println("Le livre ${livre.title} à été supprimer de la bibliotheque")
        } else {
            println("Le livre ${livre.title} n'est pas dans la bibliotheque")
        }
    }

    fun MAJLivre(livre1: Livre ,livre2: Livre) {
        if(livre1.author in lstAuthors) {
            livre1.author.remLivre(livre1)
            livre2.author.addLivre(livre2)

            println("Le livre ${livre1.title} à été mise à jour avec ${livre2.title} dans la bibliotheque")
        } else {
            println("Le livre ${livre1.title} n'est pas dans la bibliotheque")
        }
    }

    fun findLivre(titre: String): Livre? {
        for(author in lstAuthors) {
            if(titre in author.getLivres().map{ it.title }) {
                return author.getLivres().find{ it.title == titre }!!
            }
        }
        println("Aucune livre trouver avec le titre $titre")
        return null
    }
}

// 177
fun main() {
    // initialiser les authors
    val author1 = Author(1,"Author1")
    val author2 = Author(2,"Author2")
    val author3 = Author(3,"Author3")
    val author4 = Author(4,"Author4")

    // initialiser les livres
    val livre1 = Livre("Titre1",author1)
    author1.addLivre(livre1)
    val livre2 = Livre("Titre2",author2)
    author2.addLivre(livre2)
    val livre3 = Livre("Titre3",author1)
    author1.addLivre(livre3)
    val livre4 = Livre("Titre4",author2)
    author2.addLivre(livre4)
    val livre5 = Livre("Titre5",author2)
    author2.addLivre(livre5)
    val livre6 = Livre("Titre6",author3)
    author3.addLivre(livre6)
    val livre7 = Livre("Titre7",author4)
    author4.addLivre(livre7)

    val biblio1 = Bibliotheque(mutableListOf(author1,author2,author3,author4))
    biblio1.affichAuthors()

    val livre8 = Livre("Titre8",author3)
    biblio1.addLivre(livre8)
    biblio1.affichAuthors()

    biblio1.remLivre(livre5)
    biblio1.affichAuthors()

    val livre9 = Livre("Titre9",author4)
    biblio1.MAJLivre(livre6,livre9)
    biblio1.affichAuthors()

    val livreFound = biblio1.findLivre("Titre4")
    println("Le livre trouver est ${livreFound?.title}")
}
