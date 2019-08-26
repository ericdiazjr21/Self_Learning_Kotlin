package lesson10

fun main() {
    /**
     * Evaluating Conditions with if else expressions
     */

    // Note that this is the equivalent of getting a scanner and
    // reading from the console
    val input = readLine()

    if (input == "NY") {
        println("New York")
    } else {
        println("Another State")
    }
    printMe(input)
}


fun printMe(input: String?) {
    // if statements also evaluate to a value that can be assigned
    val result: String = if (input == "CA") {
        "California"
    } else {
        "Some other state"
    }
    println(result)
}