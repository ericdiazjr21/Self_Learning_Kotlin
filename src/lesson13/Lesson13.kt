package lesson13

fun main() {
    /**
     * iterate through a collection of data
     */

    val arrayOfColor = arrayOf("RED", "BLUE", "GREEN")
    val arrayOfIntegers = arrayOf(1, 2, 3, 4, 5)

    // You can iterate through a collections with a for loop
    // You can use the 'in' keyword to refer to the singular object
    // in the collection
    for (color in arrayOfColor) {
        println(color)
    }

    for (ints in arrayOfIntegers) {
        println(ints)
    }

    // You can also set up a for loop with reference to a index in a collection
    // when you apply the '.indices' field to the collections. This by default
    // will increment i by 1.
    for (i in arrayOfColor.indices) {
        println(arrayOfColor[i])
    }
    for (i in arrayOfIntegers.indices) {
        println(arrayOfIntegers[i])
    }

    // to change the incrementation, you can use the step keyword.
    for (i in arrayOfColor.indices step 2) {
        println(arrayOfColor[i])
    }

    for (i in arrayOfIntegers.indices step 2) {
        println(arrayOfIntegers[i])
    }

    // you can also use the size of the collection or length of an array
    // as part of a range. Note how you have to do  - 1 to avoid
    // going out of bounce.
    for (i in 0..arrayOfColor.size - 1) {
        println(arrayOfColor[i])
    }

    for (i in 0..arrayOfIntegers.size - 1) {
        println(arrayOfIntegers[i])
    }

    // instead of subtracting 1 from the size, you can use the until keyword
    // which will iterate to the last element and no further.

    for (i in 0 until arrayOfColor.size) {
        println(arrayOfColor[i])
    }

    for (i in 0 until arrayOfIntegers.size) {
        println(arrayOfIntegers[i])
    }

}