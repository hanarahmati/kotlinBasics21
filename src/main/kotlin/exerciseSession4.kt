import kotlin.random.Random

fun main() {
    // Generate a list of 10 random integers between 1 and 20
    val numbers = List(10) { Random.nextInt(1, 21) }

    // Use a lambda function to sort, filter, map, and reduce the list of integers
    val productOfSquares = manipulateList(numbers) { list ->
        list.sortedWith(compareBy { it })
            .filter { it % 2 == 0 }
            .map { it * it }
            .reduce { acc, i -> acc * i }
    }

    // Display the result to the user
    println("The product of the squares of even numbers is: $productOfSquares")
}

fun manipulateList(numbers: List<Int>,
                   operation: (List<Int>) -> Int): Int {
    return operation(numbers)
}

fun main1() {
    // Prompt the user to enter a list of integers
    print("Enter a list of integers separated by spaces: ")
    val input = readLine() ?: return

    // Parse the input string into a list of integers
    val numbers = input.split(" ").mapNotNull { it.toIntOrNull() }

    // Use higher-order functions to filter, map, and reduce the list of integers
    val sumOfSquares = numbers.filter { it % 2 == 0 } // filter out odd numbers
        .map { it * it } // square even numbers
        .reduce { acc, i -> acc + i } // reduce to sum of squares

    // Display the result to the user
    println("The sum of the squares of even numbers is: $sumOfSquares")


    val inputStringToListOfIntegers: (String) -> List<Int> = {
        it.split(" ").mapNotNull { it.toIntOrNull() }
    }

    val computeSumOfSquares: (List<Int>) -> Int = {
        it.filter { it % 2 == 0 } // filter out odd numbers
            .map { it * it } // square even numbers
            .reduce { acc, i -> acc + i } // reduce to sum of squares
    }

    fun test(str: String,
             inputStringToListOfIntegers:(String) -> List<Int>,
             computeSumOfSquares: (List<Int>) -> Int ): Int{
        val numbers1 = inputStringToListOfIntegers(str)
        val sumOfSquares1 = computeSumOfSquares(numbers1)
        println("The sum of the squares of even numbers in" +
                " '$str' is: $sumOfSquares1")
        return sumOfSquares1
    }

    test("12 323 2323 2321 555",
        inputStringToListOfIntegers, computeSumOfSquares)
}