internal open class Animal {
    open class Animal //constructeur
        (//getters & setters
        //Attribus
        var name: String?, var age: Int, var color: String?
    ) {
        override fun toString(): String {
            return "Animal{" + "name=" + name + ", age=" + age + ", color=" + color + '}'
        }
    }

    internal inner class Chat(name: String?, age: Int, color: String?, protected var type: String?) :
        Animal(name, age, color) {
        override fun toString(): String {
            return ("Chat{" + "name=" + name + ", age=" + age
                    + ", color=" + color + '}' +
                    "type:" + this.type)
        }
    }

    companion object {
        fun main() {
            val animal = Animal("Dog", 11, "red")
            println(animal)
        }
    }
}