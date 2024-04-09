fun main() {

    val stu = Student("Ali")

    stu.id

    val stu1 = Student("Sarah", 42)

    val a = A()

    val b = B(12)
    //println(b.x)
    val c = C(50)
    println(c.y)
    val box = Box(length = 25, width = 10)
    val box1 = Box(25, 10)
    val box2 = Box(width = 10)
    val box3 = Box(10, 20, 30)

    val s = Square(10)

    val c1 = Circle(2.0)
    val c2 = Circle(20)
    val c3 = Circle("circle with radius 1")

    val animal = Animal("dog")
    println(animal.name)
    animal.name = "cat"

    val car = Car("BMW", "2021")
    println("fullModel: ${car.fullModel}")

    car.fullModel = "BMW2020"
    println("new model: ${car.model} new year: ${car.year}")
}

class Student(name: String) {

    private var name: String = ""
    var id: Int = -1

    init {
        this.name = name
        println("Student has gotten a name as ${this.name} and id $id")
    }

    constructor(n: String, id: Int) : this(n) {
        this.id = id
        println("new id: $id")
    }
}

class A {

}

class B(x: Int) {
    //parameter x is available in constructor scope
}

class C(val y: Int) {
    //all objects of this class access to the variable y
}

class Box(
    val length: Int = 50, val width: Int,
    val height: Int = 40
) {

}
/*class Circle(i: Int){
    init {

    }
}*/
/*class Circle{
    constructor(i: Int){

    }
}*/

class Square(val side: Int) {
    init {
        println("Square: ${side * 2}")
    }
}

class Circle(val radius: Double) {
    init {
        println("Area: ${Math.PI * radius * radius}")
    }

    constructor(name: String) : this(1.0)
    constructor(diameter: Int) : this(diameter / 2.0) {
        println("in diameter constructor 2")
    }

}

class Animal(var name: String) {
    /*var name: String = ""
    init {
        this.name = name
    }*/
}

class Car(var model: String, var year: String) {
    //lateinit var fullModel: String
    var fullModel: String
        get() {
            return "$model $year"
        }
        set(value) {
            val component = value.split(" ")
            if (component.size > 1) {
                model = component[0]
                year = component[1]
            }else{
                println("full model is invalid")
            }
        }

}

