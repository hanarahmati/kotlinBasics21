fun main(){
    val numbersList = listOf(1, 2, 3, -20, 5, 20)
    val numbersListFiltered = numbersList
        .filter {n -> n > 0}

    val numbersListFiltered2 = numbersList
        .filter {it in 3..20}
    println(numbersListFiltered2)
    println(numbersListFiltered)

    val bookList = listOf("nature", "biology", "birds", "geography")
    println(bookList.filter{ it[0] == 'b' || it[2] == 't' })
    for (number in numbersListFiltered)
        println(number)

    val mySquaredNums = numbersList.map { it * it }

    println(mySquaredNums)

    val myPositiveSquaredNums = numbersList
        .filter { it > 0 }
        .map { it * it }
    println(myPositiveSquaredNums)

    val human = Human(22, "John")
    val human2 = Human(27, "Marry")
    val human3 = Human(30, "Hana")
    val humanList = listOf<Human>(human2, human, human3)

    val humanListAge25 = humanList.filter { it.age < 25  }
    println(humanListAge25)
    for (it in humanListAge25)
        println(it.name)

    val humanListWithJ = humanList.
    filter { it.name.startsWith('J') }

    for (it in humanListWithJ){
        println("${it.name} ${it.age}")
    }

    val check: Boolean = numbersList.all { it > 0 }// Are all numbers greater than 0
    println(check)

    val check2 = numbersList.any { it < 0 }//Is there any item in list which is less than 0
    println(check2)

    val totalCount = numbersList.count { it > 0 }
    println(totalCount)

    val num: Int? = numbersList.find { it > 50 }
    println(num)

    val myPredicate = {num: Int -> num in 1..10}
    val num1: Int? = numbersList.find(myPredicate)
    val numList = numbersList.filter(myPredicate)
    println(num1)
    println(numList)

    val instrument = listOf("violin", "guitar", "piano")
    val eager = instrument.filter { it.length == 5 }
    println(eager)
    val filtered = instrument.asSequence().filter {
        it.endsWith('n')
    }
    println("filtered list: $filtered")
    val newList = filtered.toList()
    println(newList)

    val numbersSet = listOf(numbersList, setOf(6, 10, 40), setOf(55, 17, 19))
    println(numbersSet)

    println(numbersSet.flatten())


}

class Human(var age: Int, var name: String){

}
