package poo

class Stagiaire: Person {
    //attribus
    var Filiere:String?=null
    constructor(name:String,age:Int,Filiere:String):super(name,age)
    {
  this.Filiere=Filiere
    }
//methodes
override fun afficher():Unit{
    println("les données de stagiaire sont ${this.name} ,${this.age} " +
            "${this.Filiere}")
}
}