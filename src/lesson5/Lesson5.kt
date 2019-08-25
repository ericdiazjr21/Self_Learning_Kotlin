package lesson5

fun main() {
    /**
     * Do math with operators and function
     */

    // You can do basic arithmetic with the standard java operators
    val num1 = 100
    val num2 = 200
    val sum = num1 + num2
    println("sum = $sum")


    // You can also you class functions to do the same thing
    val sum2 = num1.plus(num2)
    println("sum2 = $sum2")


    // The same works for all the basic math operators
    val diff = num2 - num1
    println("diff = $diff")

    val diff2 = num2.minus(num1)
    println("diff2 = $diff2")


    // You can increment and decrement like in standard java. Notice that the
    // variable declaration must be var so that it can be reassigned
    var num3 = 300
    num3++
    println("num2 = $num3")

    // You can also you the function '.inc()' to increment get back a incremented
    // value, however, the function does change the value of the original value
    // the same way the '++' operator does. It return a new variable

    val num4 = 400
    num4.inc() // -> Should be incrementing num4 by 1 right?
    println("num4 = $num4") // -> Notice that this prints the original value even
    // after calling '.inc()'. This is because its a new temp variable
    val incrementedNum4 = num4.inc();
    println("incrementedNum4 = $incrementedNum4")

}