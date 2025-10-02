package poo

import jdk.internal.icu.lang.UCharacter.getAge

fun main() {
    var p= Person("Ahmed",30)
    println(p.name)
    println(p.age)
    p.afficher()
    p.age=20
    p.name="Ali"
    p.afficher()
    println(p.getAnnee())
    p.setNom("Mohamed")
    p.afficher()

    //Stagiaire
    var stg1= Stagiaire("Sara",30,"mobile")
    stg1.afficher()
}