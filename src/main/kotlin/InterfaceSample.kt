fun main() {

}

interface Shape {
    fun computeArea(): Double
}

class Circles(val radius: Double): Shape{
    /*override fun computeArea(): Double {
        return Math.PI * radius * radius
    }*/
    override fun computeArea() = Math.PI * radius * radius

}
interface MyFirstInterface{
    //val name: String = ""
    abstract var name: String
    abstract fun onTouch()
    open fun onClick(x: Int){
        println("onClick in interface 1")
    }
}

interface MySecondInterface{
    //val name: String = ""
    fun onTouch(){
        println("my second interface on touch")
    }
    fun onClick(x: Int){
        println("onClick in interface 2")
    }
}

class MyButton: MyFirstInterface, MySecondInterface{
    override var name: String
        get() = "test"
        set(value) {}

    override fun onTouch() {
        super.onTouch()
    }

    override fun onClick(x: Int) {
        super<MyFirstInterface>.onClick(x)
        println("test")
    }



}