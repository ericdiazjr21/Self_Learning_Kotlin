package lesson18

import java.lang.Exception

fun main() {
    /**
     * Create a class with instance members (based on code from Lesson 17 - Create a library of functions
     */

    try {
        // This is how you instantiate a class using its constructor. An implied constructor exist
        // for all classes just like in Java when an explicit constructor is not provided. Notice
        // that the new keyword is not used in Kotlin and that the type is greyed-out because of
        // the type-inferring that Kotlin provides.
        val mathLib: MathLib = MathLib()

        while (true) {
            // This is the companion object method that the MathLib class contains
            val numberInput: Double = MathLib.getInput("Enter a number: ")
            //This is the instance method outside of the companion object
            mathLib.addToResult(numberInput)
            // This is the instance property that is outside of the companion object
            println(mathLib.result)
        }

    } catch (n: NumberFormatException) {
        println(n.message + " is not a number")
    } catch (e: Exception) {
        println(e.message)
    }
}