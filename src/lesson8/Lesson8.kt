package lesson8

import lesson8.Constants.Companion.BLUE // -> Notice the import from the constants class of the public constant

// Constants should declared as a top level variable with the 'const' key word
// Note that top level constant variables are private by default. To make them
// public as they are in java as in 'public static final RED = "Red"', They need
// to be defined in a companion object.

const val RED = "Red" // -> This equates to a 'public static final' field inside this class

val GREEN = "Green" // -> Avoid creating non-const top level variables in files because it
// creates an unnecessary getter method to return the value. This is because it equates to
// a 'private static final' field inside this class.

fun main() {
    /**
     * Define Constants in a companion object
     */

    println("This color is $RED")
    println("This color is $BLUE")
    println("This color is $GREEN")


}

// This is an example of creating a Constants class and using a companion object
// to create a public constant.

class Constants{
    companion object{
        const val BLUE = "Blue" // -> this equates to a 'public static final' field in this Constants class
    }
}