package poo

import kotlin.math.PI
import kotlin.math.sqrt

abstract class Formes(val nom:String) {
    abstract fun surface(): Double
    abstract fun peremitre(): Double
}

class carre(val cote:Double):Formes("carre") {

    override fun surface(): Double {
        return cote * cote
    }

    override fun peremitre(): Double {
        return 4 * cote
    }
}
    class rectangle(val longeur:Double,val largeur:Double)
        :Formes("rectangle"){
        override fun surface(): Double {
           return longeur*largeur
        }

        override fun peremitre(): Double {
           return 2*(largeur+longeur)
        }

    }
    class cercle(val rayon:Double):Formes("cercle")
    {
        override fun surface(): Double {
           return rayon*rayon* PI
        }

        override fun peremitre(): Double {
           return 2*PI*rayon
        }

    }
    class Triangle(val a:Double,val b:Double,val c:Double):Formes("triangle")
    {
        override fun surface(): Double {
            val s=(a+b+c)/2
            return sqrt(s*(s-a)*(s-b)*(s-c))
        }

        override fun peremitre(): Double {
           return a+b+c
        }


    }

fun main() {
    val listeFormes:List<Formes> = listOf(
        carre(1.0), cercle(4.0), rectangle(2.0,3.0),
        Triangle(2.0,3.0,5.0), rectangle(4.0,3.0),
    )

    for (forme in listeFormes) {
        println("la surface de ${forme.nom} est ${forme.surface()}")
        println("le perimetre de ${forme.nom} est ${forme.peremitre()}")
    }

}