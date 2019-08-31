package lesson18

class MathLib {
    // This is an instance property that can be accessed through the instance of a this class.
    var result: Double = 0.0
    // This is an instance function that can ba accessed through the instance of this class.
    fun addToResult(value: Double) {
        result += value
    }

    companion object {

        const val answerText = "Answer = "
        const val operationText = "Select a Operation (* / + -)"

        fun getInput(prompt: String): Double {
            println(prompt)
            return readLine()!!.toDouble()
        }
    }
}