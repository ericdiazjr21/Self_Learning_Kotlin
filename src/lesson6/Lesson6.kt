package lesson6

import kotlin.math.abs // -> Notice the imports from the kotlin math package
import kotlin.math.round

fun main() {
    /**
     * Use function from kotlin.math
     */

    val num1 = 100
    val num2 = 200

    val sum = num1.plus(num2)
    println("sum = $sum")

    val diff = num1.minus(num2)
    println("diff = $diff")

    val quotient = num1.toDouble().div(num2)
    println("quotient = $quotient")

    val product = num1.times(num2)
    println("product = $product")

    // The Kotlin Math class inherits from the Java Math class and so you can
    // access all the same methods and more.

    val absoluteDiffValue = abs(diff)
    println("The absolute value of diff is : $absoluteDiffValue")

    val roundedQuotientValue = round(quotient.plus(1))
    println("The rounded value of quotient is : $roundedQuotientValue")

}