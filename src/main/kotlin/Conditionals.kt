fun main() {

    val price = 23000

    if (price > 0) {
        println("your price is $price")
        println("done")
    } else {
        println("your price is less than 0")
    }

    if (price != 0) println("your price is $price")
    else println("your price is less than 0")

    val guest = 30
    if(guest == 0){
        println("guest == 0")
    }else if(guest > 0){
        println("guest > 0")
    }else{
        println("guest < 0")
    }

    val r1 = 1..5 //1 2 3 4 5
    val r2 = 5 downTo 1 //5 4 3 2 1
    val r3 = 5 downTo 1 step 2 //5 3 1
    val r4 = 'b'..'s' // b c .. s
    val isPresent = 'c' in r4
    println(isPresent)

    val countDown = 10.downTo(1)
    val moveUp = 1.rangeTo(10)

    if (guest in 1..30){
        println(guest)
    }
    val myChar = 'a'
    when(myChar){
        'a' -> {
            println("your character is a")
        }
        in 'b'..'s' -> {
            println("you are not in right range.")
        }
        else -> println("non of them")
    }

    val pets = arrayOf("dog", "cat", "rabbit")

    println(pets[0])
    println(pets[1])
//    println(pets[3]) Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    println(pets[2])

    for (pet in pets)
    {
        println(pet)
        println("done")
    }
    for ((index, element) in pets.withIndex())
        println("item at $index is $element")

    for (i in 1..5){
        println(i)
    }

    for (i in 5 downTo 1){
        println(i)
    }

    for (i in 2..20 step 2) println(i)

    for (i in 'd'..'m') println('*')

    var num = 0
    while (num < 100){
        println(num)
        num ++
    }

    do {
        println(num)
        num ++
    }while (num < 100)

    repeat(5){
        println("hi")
        println(it)
    }

    for (i in 1..100){

        println("$i ")
        if (i == 5)
            break
    }

    for (i in 1..10){
        if (i % 2 == 0)
            continue
        print("$i ")
    }
    println()

    for (i in 1..10){
        for (j in 1..3){
            print("$i$j ")
        }
        println()
    }

    for (i in 1..5) {
        repeat(3) {
            print("$i$it")
        }
        println()
    }

    outerLoop@for (i in 1..10){
        for (j in 1..4){
            print("$i$j ")
            if (i == 2 || j == 2)
                break@outerLoop
        }
        println()
    }

    outerLoop@for (i in 1..10){
        for (j in 1..4){
            print("$i$j ")
            if (i == 2 || j == 2)
                continue@outerLoop
        }
        println()
    }

}