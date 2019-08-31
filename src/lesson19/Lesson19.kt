package lesson19

import lesson17.MathLib
import java.lang.Exception

fun main() {
    /**
     * Manage value lists with enums (based on code from lesson 17 - simple calculator)
     */

    try {

        val input1NumericalValue: Double = MathLib.getInput("Number 1: ")
        val input2NumericalValue: Double = MathLib.getInput("Number 2: ")

        println(MathLib.operationText)

        val operationInput: String? = readLine()

        val answerText = MathLib.answerText

        val answer: String = when (operationInput) {
            //Notice how we have to reference the operator property of each enum to get its String value
            Operations.ADD.operator -> (input1NumericalValue + input2NumericalValue).toString()
            Operations.SUBTRACT.operator -> (input1NumericalValue - input2NumericalValue).toString()
            Operations.MULTIPLY.operator -> (input1NumericalValue * input2NumericalValue).toString()
            Operations.DIVIDE.operator -> (input1NumericalValue / input2NumericalValue).toString()
            else -> "Error : Not an operation"
        }
        println(answerText + answer)

    } catch (n: NumberFormatException) {
        println(n.message + " is not a number")
    } catch (e: Exception) {
        println(e.message)
    }
}