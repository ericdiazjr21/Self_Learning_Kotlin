package lesson16

import java.lang.Exception

fun main() {
    /**
     * Creating a simple calculator
     */
    try {

        val number1Text = "Number 1: "
        println(number1Text)
        val input1NumericalValue = readLine()!!.toDouble()

        val number2Text = "Number 2: "
        println(number2Text)
        val input2NumericalValue: Double = readLine()!!.toDouble()

        println("Select a Operation (* / + -)")

        val operationInput: String? = readLine()
        val answerText = "Answer = "

        when (operationInput) {
            "+" -> print(answerText + "${input1NumericalValue + input2NumericalValue}")
            "-" -> print(answerText + "${input1NumericalValue - input2NumericalValue}")
            "/" -> print(answerText + "${input1NumericalValue / input2NumericalValue}")
            "*" -> print(answerText + "${input1NumericalValue * input2NumericalValue}")
            else -> print("Not an operation")
        }
    } catch (n: NumberFormatException) {
        println(n.message + " is not a number")
    } catch (e: Exception) {
        println(e.message)
    }
}