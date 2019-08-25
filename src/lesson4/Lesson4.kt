package lesson4

fun main() {
    /**
     * Comparing numerical values
     */

    // You can compare numerical values using the equality operator
    val num1 = 10
    val num2 = 15
    val match: Boolean = (num1 == num2)

    println("Do these numbers match: $match")

    // You can also compare numerical values by using the equals function.

    val num3 = 20
    val num4 = 20
    val match2 = num3.equals(num4)

    println("Do these numbers match: $match2")

    // You can also compare numerical values by using the compareTo function.
    //    /**
    //     * Compares this value with the specified value for order.
    //     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
    //     * or a positive number if it's greater than other.
    //     */ -> This is from class docs!

    val num5 = 25
    val num6 = 30
    val match3 = num5.compareTo(num6)

    println("Do these numbers match: $match3")
}