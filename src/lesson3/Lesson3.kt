package lesson3

import java.lang.StringBuilder

fun main() {

    /**
     * Primitive Conversion
     */

    // Kotlin is statically typed language which means that once a Type is assigned,
    // it cannot be changed
    val myInt = 10
    //    val myLong : Long = myInt -> this line has an error because myInt in an Integer
    // but myLong is of a Long type. this is different from Java, where it would automatically
    // convert the int to a long because a long has the capacity to fit an int. To make this
    // work, you have to explicitly convert it into a long by using the class function of the
    // Integer Type.
    val myLongConverted: Long = myInt.toLong()
    // you can verify the type by printing the the class simple name. Also note that to get
    // the class of variable you need to use the 2 colon '::' after the variable name and select
    // the '.java' to access the class fields and methods through reflection.
    println("This is now a Long type ${myLongConverted::class.java.simpleName}")
    println("This is now a Long type ${myLongConverted::class.java.packageName}")

    /**
     * Kotlin and null values
     */

    // Kotlin types by default can never be null. For a variable to be null in Kotlin,
    // you must use the safe/nullable operator '?' as part of the type declaration.
    //    val myString : String = null -> this line has an error because no type can be null
    // without explicitly stating that it is going to be null with the safe operator.
    val myString: String? = null
    println("This is a null String: ${myString}")

    // When you assign a variable to null without explicitly declaring a type, it is automatically
    // assigned a type Nothing and will require the bang bang operator '!!' to explicitly state to
    // the compiler that you want this Nothing type variable to be null
    val myInferredNullAny = null
    println(myInferredNullAny)

    /**
     * Instantiating Objects
     */

    // To instantiate an object, start a variable key word, then the variable name followed by
    // the type, then the equals sign and then the constructor along with any parameter you want
    // to pass. Not the type is grey-out because it unnecessary since kotlin can infer it from the
    // expression after the equal sign

    val myStringBuilder: StringBuilder = StringBuilder("This is my parameter String")
    val myInferredStringBuilder = StringBuilder("This my inferred String type ")

    println(myStringBuilder)
    println(myInferredStringBuilder)


}