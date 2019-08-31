package lesson17

class MathLib {

    // Kotlin has no concept of static methods or fields in classes. If you want
    // access to a function or property from a class you must use a companion object
    // to encapsulate whatever function or property you want to have access to.

    companion object {
        const val answerText = "Answer = "
        const val operationText = "Select a Operation (* / + -)"

        fun getInput(prompt: String): Double {
            println(prompt)
            return readLine()!!.toDouble()
        }
    }
}