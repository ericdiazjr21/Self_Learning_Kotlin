package lesson14

fun main() {
    /**
     * Iterate with conditional expressions
     */

    // You can also iterate through a collection using a 'while'
    // loop which is the same as you would use it in Java.

    val states: Array<String> = arrayOf("NY", "CA", "GA", "TX")

    var counter: Int = 0
    while (counter < states.size) {
        println(states[counter])
        counter++
    }

    // You can also use a 'do-while' loop the same way you would in Java

    counter = 0

    do {
        println(states[counter])
        counter++
    } while (counter < states.size)
}