import kotlin.random.Random

fun main() {

    println("test")

    printHello()

    val temp = 40
    val isHot = if (temp > 24) true else false

    println(isHot)
    val student = Person()
    val teacher = Person()
    student.think()

    drive("90")
    drive()
    tempToday("Sunday", 27)

    reformat(2, true, 'c')
    reformat(str = 2, normaize = false, divideBy = true)

    var food = fishFood("Sat")
    println(fishFood("Sun"))

    val max = max2(70, 40)
    println(max)
    println(max3(90, 25))
}

fun printHello() {
    println("hello world")
}

class Person {
    fun think() {

    }
}

fun drive(speed: String = "60") {
    println("drive $speed")
}

fun tempToday(day: String, temp: Int) {
    println("Today is $day and temp is $temp degree")
}

fun reformat(
    str: Int, divideBy: Boolean,
    wordSeprator: Char = 'd', normaize: Boolean = true
) {
    println("$str $divideBy $wordSeprator $normaize")
}

/*
fun fishFood(day: String): String {
   */
/*var food = ""
    food = when(day){
        "Sat" -> "food1"
        "Sun" -> "food2"
        "Mon" -> "food3"
        "Fri" -> "food4"
        else -> "nothing"
    }
   return food*//*

    return when(day){
        "Sat" -> "food1"
        "Sun" -> "food2"
        "Mon" -> "food3"
        "Fri" -> "food4"
        else -> "nothing"
    }
}*/
fun fishFood(day: String): String =
    when (day) {
        "Sat" -> "food1"
        "Sun" -> "food2"
        "Mon" -> "food3"
        "Fri" -> "food4"
        else -> "nothing"
    }

fun randomDay(): String {
    val week = arrayOf("Sat", "Sun", "Mon", "Fri")
    /*val day = week[Random.nextInt(week.size)]
    return day*/
    return week[Random.nextInt(week.size)]
}

fun double(x: Int): Int {
    return x * x
}

fun double1(x: Int): Int = x * x

/*fun max(a: Int, b: Int): Int {
    return if (a > b)
        a
    else b
}*/
fun max(a: Int, b: Int): Int = if (a > b) a else b

fun max2(a: Int, b: Int): Int {
    return if (a > b) {
        println("$a is greater")
        a
    } else b
}

fun max3(a: Int, b: Int): Int =
    if (a > b) {
        println("$a is greater")
        a
        50
    } else {
        b
    }
