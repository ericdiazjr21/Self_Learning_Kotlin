package lesson32

import lesson30.Retriever

fun main() {
    /**
     * pass functions as lambda expressions
     */

    // Something to think about is that all functions are considered objects
    // because they have a return type, event if isn't used. For example,
    // notice how Function<Unit> is the return type of this function, and we know that
    // Unit is not a usable object, however it is still an object. Function is another
    // object that allows for a block of code to be treated as function

    val helloWorld: Function<Unit> = {
        println("Hello World")
    }

    // More complex Functions are possible
    val sayHelloDog: (spot: Retriever) -> Unit =
        { spot: Retriever -> println(spot.walk()) }
    sayHelloDog(Retriever())

    val states = arrayListOf("New York", "Texas", "Nebraska", "Boston", "California")
    // The sortBy method expects a function that will specify how to sort the list
    val sortedStatesWithFunction = states.sortBy<String, Int>(fun(state: String): Int {
        return state.length
    })

    // you can replace this with a lambda expression
    val sortedStates = states.sortBy { state -> state.length }
    
    // then you can shorten by referring to the single param of state as 'it'
    val sortedStatesEvenShorter = states.sortBy { it.length }

    for (state in states) {
        println(state)
    }
}