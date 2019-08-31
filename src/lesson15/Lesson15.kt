package lesson15

fun main() {

    /**
     * Handle exceptions with try catch block
     */

    // You can use try blocks in kotlin the same way that they work in Java

    try {
        val value1: String = "Value 1 = "
        println(value1)
        val input1: String? = readLine()
        val number1 = input1!!.toInt()

        val value2: String = "Value 2 = "
        println(value2)
        val input2: String? = readLine()
        val number2 = input2!!.toInt()

        println(number1.plus(number2))
    } catch (k: KotlinNullPointerException) {
        println("A value is null")
    } catch (n: NumberFormatException) {
        println("Not a number")
    }
}
