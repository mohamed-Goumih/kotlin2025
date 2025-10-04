import java.util.Date

//184
interface evalutations{
    fun ajouterNote(stagiaire:Stagiaire,module:Module,note:Note)
    fun calculerMoyenne(stagiaire: Stagiaire):Double

}

//181
abstract class Person(var nom:String,var prenom:String)
{
    override fun toString(): String {
        return "$nom $prenom"
    }
    //getters & setters
//    fun getNom():String=nom
//
//    fun getPrenom():String=prenom
//
//    fun setNom(nom:String){
//            this.nom=nom
//    }
//    fun setPrenom(prenom:String){
//        this.prenom=prenom
//    }


}
//182
class Stagiaire(nom:String,prenom:String,var numeroDeStagiaire:String)
    :Person(nom,prenom){
    val moduleInscrits=mutableListOf<Module>()

    val notes=mutableListOf<Note>()
    val evaluationsFormateurs=mutableMapOf<Formateur,Int>()
    //inscrire à un module
    fun sInscrireAModule(module: Module)
    {
        if (!moduleInscrits.contains(module))
            {
            moduleInscrits.add(module)
            }
        else{
            println("$module est deja existent")
        }

    }
  //calculer la moyenne
  fun calculerMoyenne():Double{
      return notes.map { it.valeur }.average()
  }
    //evaluations Formateurs
    fun getEvaluationsFormateurs(): Map<Formateur,Int>{
        return evaluationsFormateurs.toMap()
    }

    fun evaluationFormateur(formateur: Formateur){
        var mention=calculerMoyenne()
        if (mention>=18.0){
            evaluationsFormateurs[formateur]=5
        }
        else if (mention >=16 && mention<=18){
            evaluationsFormateurs[formateur]=4
        }
        else if (mention >=14 && mention<=16){
            evaluationsFormateurs[formateur]=3
        }
        else if (mention >=12 && mention<=14){
            evaluationsFormateurs[formateur]=2
        }
        else if (mention >=10 && mention<=12){
            evaluationsFormateurs[formateur]=1
        }
        else{
            evaluationsFormateurs[formateur]=0
        }

    }

    }
class Formateur (nom:String,prenom:String,var specialite:String)
    :Person(nom,prenom)
{
    val modulesEnseignets=mutableListOf<Module>()
    //getSpecialite
//    fun getSpecialite()=specialite
//    //setSpecialite
//    fun setSpecialite(specialite: String){
//            this.specialite=specialite
//    }
    //ajouter un module
    fun ajouterModule(module: Module){
       if (!modulesEnseignets.contains(module)){
           modulesEnseignets.add(module)
       }
        else{
            println("$module est deja existe")
       }
    }
}
class Note (var valeur:Double,var module:Module,var stagiaire: Stagiaire){

//    fun getValeur()=   valeur
//    fun getModule()=module
//    fun getStagiaire()=stagiaire
  //  if (note>=0.0   && note<=20.0)
    init {
        require(valeur in 0.0..20.0)
        {println("la note doit etre entre 0 et 20")}
    }

    override fun toString(): String {
        return "le stagiaire ${stagiaire.nom} ${stagiaire.prenom} " +
                "a obetenu $valeur/20" +
                " dans le module ${module.nom}"
    }
}
class Module(var nom:String){
    val stagiairesInscrits =mutableListOf<Stagiaire>()
    val formateur:Formateur?=null
    val notes=mutableListOf<Note>()

    //inscrire stagiaire
    fun inscrireStagiaire(stagiaire: Stagiaire){
    if (!stagiairesInscrits.contains(stagiaire)){
        stagiairesInscrits.add(stagiaire)
    }
        else{
            println("$stagiaire deja existe ")
    }
    }
    //ajouter Note Examen
    fun ajouterNoteExamen(stagiaire: Stagiaire,note: Note){
       if(stagiairesInscrits.contains(stagiaire)){

               notes.add(note)

       }
        else{
            println("stagiaire n'existe pas")
       }
    }
    //get notes stagiaires
    fun getNotesStagiaire(stagiaire: Stagiaire):List<Note>{

        if(stagiairesInscrits.contains(stagiaire)){
          return stagiaire.notes
        }
        else {
            return emptyList()
        }
    }



}

class EmploiDuTemps {
    var cours = mutableMapOf<Module,Pair<Date, Date>>()

    fun AjouterCours(module: Module,dateDebut:Date,DateFin: Date){
       if (cours.containsKey(module)){
           cours.put(module, Pair(dateDebut,DateFin))
       }
    }
    fun getCoursPourModule(module:Module):List<Pair<Date,Date>>{
        return cours.filter { it.key==module } as List<Pair<Date, Date>>
    }
    fun getCoursPourDate(date:Date):List<Pair<Module,Pair<Date,Date>>>
    {
return cours.filter{ it.value.second==date || it.value.first==date }
        as List<Pair<Module, Pair<Date, Date>>>
//        return cours.flatMap { (module,dates)->
//            dates.filter{it.first==date}
//                .map{ Triple(module,it.first,it.second)}
//
//        }

    }
}
class SystemeFormation:evalutations{
    private val stagiaires=mutableListOf<Stagiaire>()
    private val formateurs=mutableListOf<Formateur>()
    private val modules=mutableListOf<Module>()
    private val emploiDuTemps:EmploiDuTemps?=null

    fun ajouterStagiaire(stagiair:Stagiaire){
    stagiaires.add(stagiair)
    }
    fun ajouterFormateur(formateur: Formateur){
        formateurs.add(formateur)
    }

    fun ajouterModule(module: Module){
        modules.add(module)
    }

//    fun getStaiaires() =stagiaires
//    fun getFormateurs()=formateurs
//    fun getModules()=modules
    override fun ajouterNote(stagiaire: Stagiaire, module: Module, note: Note) {
        if (stagiaires.contains(stagiaire)){
            stagiaire.notes.add(note)
        }
    else{
        println("$stagiaire n'existe pas")
        }
    }

    override fun calculerMoyenne(stagiaire: Stagiaire): Double {
       return stagiaire.notes.map { it.valeur}.average() }

}

fun main() {
    //
    val stg1=Stagiaire("mohamed","mohamed","stg1")
    val stg2=Stagiaire("ali","ali","stg2")
    println(stg1)

    val formateur1=Formateur("Alami","Ahmed","Applications mobile")
    val formateur2=Formateur("tazi","Rachid","Full Stack")
        println(formateur2)
}