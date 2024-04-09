fun main() {

//    val dog = Dog()
//    dog.breed = "German"
//    dog.color = "white"
//    dog.bark()
//    dog.eat()

    //val dog = Dog("white", "German")
    val cat = Cat("black", 2)

}

/*
open class Animals{
    var color: String = ""
    fun eat(){
        println("Eat")
    }
}
class Dog: Animals(){
    var breed: String = ""
    fun bark(){
        println("bark")
    }
}
class Cat: Animals(){
    var age: Int = -1
    fun meow(){
        println("meow")
    }
}*/

/*
open class Animals{
    open var color: String = ""
    open fun eat(){
        println("Eat")
    }
}

class Dog: Animals(){
    var breed: String = ""
    fun bark(){
        println("bark")
    }

    override var color: String
        get() = "black"
        set(value) {
//            color = value + "test"
        }

    override fun eat() {
        super.eat()
        println("dog is eating")
    }
}
*/
open class Animals(var color: String) {
    init {
        println("from animal constructor :$color")
    }

    open fun eat(): Int {
        println("Eat")
        return 5
    }
}

class Dog(color: String, var breed: String) : Animals(color) {
    init {
        println("from dog constructor: $color and $breed")
    }
    fun bark() {
        println("bark")
    }

    override fun eat(): Int {
        super.eat()
        println("dog is eating")
        return 2
    }
}

class Cat(color: String): Animals(color){
    constructor(color: String, age: Int):this(color){
        println("from cat constructor: $color and $age")
    }
    init {
        println("from cat constructor: $color")
    }
}
