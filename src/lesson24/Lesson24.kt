package lesson24

fun main() {
    /**
     * Manage fixed-sized collections with arrays
     */

    // You create arrays using the base function provided by Kotlin
    val array1: Array<String> = arrayOf("Red", "Blue", "Green")
    for (color in array1) {
        println(color)
    }

    //You can make an Array of mixed objects
    val mixedArray: Array<Any> = arrayOf("A String", 12, false)
    for (any in mixedArray) {
        println(any)
    }

    // You can make a array that has initial elements that are all null
    val arrayOfNulls: Array<String?> = arrayOfNulls(3)

    // You can then set those values by referring to the index of the array
    // and assigning a value

    arrayOfNulls[0] = "Bob"
    arrayOfNulls[0] = "Sam"
    arrayOfNulls[0] = "John"

    for (names in arrayOfNulls) {
        println(names)
    }

    // you can also make arrays on primitive types by calling their specific
    // function. Each primitive has their own version of this function

    val intArray: IntArray = intArrayOf(100, 200, 300, 400)
    for (int in intArray) {
        println(int)
    }

    // Arrays have handy methods that help organize a array
    val descendingIntArray = intArray.sortedArrayDescending()
    for (int in descendingIntArray) {
        println(int)
    }


}