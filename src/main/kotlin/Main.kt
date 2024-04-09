import java.lang.Integer.sum

fun main(args: Array<String>){
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("program args:")
    println("Program arguments: ${args.joinToString()}")

    val password = 2

    println("My password is $password")

    //password = 23

    var number = 5
    number = 25

    val number2 = 2 + ((4 / 5) % 3)
    println(number2)

    println(1.05/2)
    println(7/2)

    println(2.times(3))
    println(2 * 3)
    println(2.plus(3))
    println(2.div(5))

    val l: Long = 5555555555555555555L
    val i: Int = 355555555
    val shortExample: Short = 4555
    val byteExample: Byte = 127

    val f: Float = 2.1111112F
    val d: Double = 24252525222222.11

    val bool: Boolean = true
    val bool1 = false

    val ch: Char = '@'

    val name: String = "our kotlin class"

    val oneMillion = 1_000_000
    val idNumber = 999_99_9999L
    val hexByte = 0xFF_EC_DE_5E
    val bytes = 0b11001100_01000011

    println("example this is" + "password" + {password + number})
    println("this is password $password")

    val summurize = number2 + password

    println("sum number2 and password " +
            "is ${password + number2}")
println("sum number2 and password " +
            "is ${sum(number2, password)}}")


}