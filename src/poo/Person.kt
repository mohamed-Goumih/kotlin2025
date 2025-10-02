package poo

open class Person {
    //attribus
    var name:String?=null
    var age:Int?=null

    //constructeur
    constructor(name:String?, age:Int?){
        this.name=name
        this.age=age
    }
    //methodes
    open fun afficher(): Unit{
        println("les données de la personne sont :${this.name} et ${this.age}")
    }
    //getters
    fun getNom():String?{
        return name
    }
    fun getAnnee():Int?{
        return age?.times(2)
    }
    //setters
    fun setAnnee(age:Int?){
        this.age=age
    }
    fun setNom(name:String?){
        this.name=name
    }

}