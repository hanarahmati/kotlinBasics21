fun main(){

}

abstract class Food{
    abstract val kcal: Int
    abstract val name: String
    val name1: String = ""

    final fun consume() = println("eat")
    abstract fun buy()
    open fun getType(){
      println("test")
    }
}

class Pizza() : Food(){
    override val kcal: Int
        get() = 2
    override val name: String
        get() = "test"

    override fun buy() {
        println("buy")
    }

    override fun getType() {
        super.getType()
        println("new type")
    }
    // final fun consume cannot override
}