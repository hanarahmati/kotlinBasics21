fun main(){
    val dirtyLevel: Int = 20
    val waterFilter =
        {level: Int -> level / 2}
    val waterFilter2: (Int) -> Int =
        {level: Int -> level / 2}
    println(waterFilter(16))

    val program = Program()
    program.addTwoNumbers(4, 6)
    program.addTwoNumbers(4, 6,
        object : MyInterface{
            override fun execute(sum: Int) {
                println(sum)
            }
        })
    program.addTwoNumbers(4, 6,
        {sum: Int -> println(sum) })
    program.addTwoNumbers(4, 6)
    { sum: Int -> println(sum) }
    program.addTwoNumbers(4, 6)
    { sum -> println(sum) }
    program.addTwoNumbers(4, 8)
    { println(it) }

    program.reverseAndDisplay("Kotlin",
        {s -> s.reversed() })
    program.reverseAndDisplay("Kotlin")
    { s -> s.reversed() }

    program.reverseAndDisplay("Kotlin")
    { it.reversed() }

    fun enc(input: String): String = input.reversed()

    println( encodeMsg("Hello", ::enc ))

    program.addTwoNumbers(4, 7,{
        println(it)
    },{it.reversed()})

    val customer = Customer()

    customer.name = "John"
    customer.family = "Dean"

    customer.startRun()

    with(customer){
        name = "Marry"
        family = "Maid"
    }

    customer.apply {
        name = "John"
        family = "So"
    }.startRun()


}

fun div(level: Int):Int {
    return level / 2
}

class Program{

    fun addTwoNumbers(a: Int, b: Int){
        val num = a + b
        println(num)
    }

    fun addTwoNumbers(a: Int, b: Int,
                      action: MyInterface){
        val sum = a + b
        action.execute(sum)
    }

    fun addTwoNumbers(a: Int, b: Int,
                      action: (Int) -> Unit
    ){
        val sum = a + b
        action(sum)
    }

    fun reverseAndDisplay(str: String,
                          myFunc:(String) -> String){
        val result = myFunc(str)
        println(result)
    }

    fun addTwoNumbers(a: Int, b: Int,
                      action: (Int) -> Unit,
                      lamdaF: (String) -> Unit
    ){
        val sum = a + b
        action(sum)
    }




}

fun encodeMsg(msg: String,
              encode: (String) -> String)
: String{
    return encode(msg)
}

interface MyInterface{
    fun execute(sum: Int)
}

class Customer{
    var name: String = ""
    var family: String = ""

    fun startRun(){
        println("$name $family")
    }
}