package lesson17

import java.lang.Exception

fun main() {
    /**
     * Create a library of functions (based on code from Lesson 16 - simple calculator
     */

    /**
     * Creating a simple calculator
     */
    try {
        // Notice how we have refactored the code now so that it is more reusable
        // and notice that getInputs is a static function call from the MathLib class
        val input1NumericalValue: Double = MathLib.getInput("Number 1: ")
        val input2NumericalValue: Double = MathLib.getInput("Number 2: ")

        // This is a static property from the MathLib class's companion object
        println(MathLib.operationText)

        val operationInput: String? = readLine()
        
        // This is a static property from the MathLib class's companion object
        val answerText = MathLib.answerText

        val answer: String = when (operationInput) {
            "+" -> (input1NumericalValue + input2NumericalValue).toString()
            "-" -> (input1NumericalValue - input2NumericalValue).toString()
            "/" -> (input1NumericalValue / input2NumericalValue).toString()
            "*" -> (input1NumericalValue * input2NumericalValue).toString()
            else -> "Error : Not an operation"
        }
        println(answerText + answer)

    } catch (n: NumberFormatException) {
        println(n.message + " is not a number")
    } catch (e: Exception) {
        println(e.message)
    }
}

