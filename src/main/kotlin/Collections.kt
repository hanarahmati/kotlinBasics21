fun main(){
    //index  0  1  2  3  4
    //element0  0  0  0  0

    val myArray = Array<Int>(5){0}//Mutable(values changeable, size fix
    val myArray1 = Array<Int>(5){26}

    val myArray3 = Array<Int>(5){26}

    myArray[2] = 32
    myArray[4] = 30
    myArray[1] = 95

    for (element in myArray)
        print("$element ")
    //myArray.joinToString()

    val size = myArray.size
    println(size)

    val school = arrayOf("high school",
        "elementary", "graduate School" )

    val mixArray = arrayOf("fish", 2)
    val numbers1 = intArrayOf(1, 2, 3)
    val numbers2 = intArrayOf(4, 5, 6)
    val numbers = numbers1 + numbers2

    val oceans = listOf("Atlantic", "Pacific")//immutable, fix size, readOnly
    val combined = listOf(numbers, oceans, "salmon")

    println(combined)

    val classList = listOf<String>("kotlin", "android", "java")

    val mutableListMix = mutableListOf("test", 1)
    val mutableListString = mutableListOf("test", "piano", "violin")

    println(mutableListMix)
    println(mutableListString)

    mutableListString.add("5")

    mutableListString.add(2,"3")
    println(mutableListString)
    mutableListString.add("24")
    println(mutableListString)
    mutableListString.remove("3")
    println(mutableListString)
    mutableListString.remove("25")
    mutableListString.removeAt(3)
    println(mutableListString)

    for (e in mutableListString)
        print("$e ")
    println()

    val myArrayListMutable = arrayListOf<String>()
    val myArrayListMutable1 = ArrayList<String>()
    val myArrayListMutable2 = mutableListOf<String>()


    println()
    val myMap = mapOf<Int, String>(2 to "collections", 3 to "functions",
        4 to "lambda-function")

    for (key in myMap.keys)
        print("${myMap[key]} ")

    println()

    val myMapMutable = HashMap<Int, Int>()// mutable, read and write , no fixed size
    val myMapMutable1 = mutableMapOf<String, String>()// mutable, read and write , no fixed size
    val myMapMutable2 = hashMapOf<Int, String>()// mutable, read and write , no fixed size


    println(myMap)

    myMapMutable[25] = 3
    myMapMutable.put(26, 2)
    println(myMapMutable)
    myMapMutable.replace(25, 4)
    println(myMapMutable)
    myMapMutable.remove(24)

    val mySet = setOf<Int>(2, 54, 3, 1, 0, 9, 9, 8)//immutable read only
    val mySet1 = mutableSetOf<Int>(2, 54, 3, 1, 0, 9, 8, 9)//mutable read write
    val mySet2 = hashSetOf<Int>(2, 54, 3, 1, 0, 9, 9, 8)//mutable read write

    println(mySet)
    println(mySet1)
    println(mySet2)

    mySet1.remove(54)
    mySet1.add(100)

    mySet2.add(25)

    for (e in mySet1)
        print("$e ")

    printHello()


}