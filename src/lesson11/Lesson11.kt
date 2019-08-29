package lesson11

fun main() {
    /**
     * Evaluate multiple condition with when
     */

    print("Enter a state abbreviation: ")
    val input: String? = readLine()

    // the 'when' keyword acts like a the 'switch' keyword in Java.

    val capital: String

    //when statements could be used to execute specific lines of code
    when (input) {
        // instead of colons, you use lambda expressions
        "CA" -> println("Sacramento")
        "NY" -> println("Albany")
        // else is always required
        else -> println("Unkwown")
    }


    // when statements can evaluate to a value and can be assigned
    capital = when (input) {
        "CA" -> "Sacramento"
        "NY" -> "Albany"
        else -> "Unkwown"
    }

    println("This state's capital is : $capital")


    //when statements can evaluate multiple cases
    when (input) {
        // instead of colons, you use lambda expressions
        "CA", "OR", "WA" -> println("west coast")
        "NY", "RI", "MA" -> println("east coast")
        // else is always required
        else -> println("Unkwown")
    }

    //when statements can evaluate math expressions using ranges or exact numerical values

    val ofAge = 18

    when (ofAge) {
        in 1..5 -> println("Your a baby")
        in 6..13 -> println("You can ride a bike")
        in 14..17 -> println("Almost there")
        in 18..100 -> println("Your a good")
        // you can add curly braces for more line statements
        else -> {
            println("your an alien")
            println("or unborn")
        }
    }

}