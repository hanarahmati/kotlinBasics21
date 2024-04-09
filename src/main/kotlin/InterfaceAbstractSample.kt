fun main() {
    makeFish()
}
/*

abstract class AquariumFish{
    abstract val color: String
}
interface FishAction{
    fun eat()
}

class Shark: AquariumFish(), FishAction{
    override val color: String
        get() = "grey"

    override fun eat() {
        println("hunt and eat")
    }

}

class Pleco: AquariumFish(), FishAction{
    override val color: String = "gold"

    override fun eat() {
        println("eat algae")
    }

}*/
/*

abstract class AquariumFish{
    abstract val color: String
}
interface FishAction{
    fun eat()
}

class Shark: AquariumFish(), FishAction{
    override val color: String
        get() = "grey"

    override fun eat() {
        println("hunt and eat")
    }

}

class Pleco: AquariumFish(), FishAction{
    override val color: String = "gold"

    override fun eat() {
        println("eat algae")
    }

}*/
abstract class AquariumFish: FishAction{
    abstract val color: String
    override fun eat() {
        println("hunt and eat fish")
    }
}
interface FishAction{
    fun eat()
}

class Shark: AquariumFish(){
    override val color: String
        get() = "grey"

    override fun eat() {
        super.eat()
    }

}

class Pleco: AquariumFish(){
    override val color: String = "gold"

    override fun eat() {
        println("eat algae")
    }

}

fun makeFish(){
    val shark = Shark()
    val pleco = Pleco()
    println(shark.color)
    println(pleco.color)
}