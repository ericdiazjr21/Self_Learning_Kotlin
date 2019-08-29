package Lesson12

fun main() {
    /**
     * Manage null values
     */

    // Kotlin variable by default are non-null variables which means the
    // compiler will scream at you if the value of a variable is null

    //    val nullString :String = null -> this line has an error

    // in order to handle null values in Kotlin, you must use the question
    // mark operator '?' after the type declaration. This means that the
    // value of that type could possibly be null.
    val nullString: String? = null

    println(nullString)

    // lets trying getting the length of the nullString
    //    val nullStringLength : Int = nullString.length -> this line throws an error

    // to make this work, we must add safe operators to the variable data type and before
    // the call to .length. This tell the compiler that nullString may be null and if so,
    // return a null value

    val nullStringLength: Int? = nullString?.length

    println(nullStringLength)

    // You can also evaluate the null values through conditional statements

    val anotherNullString: String? = if (nullString == null) null else nullString

    println(anotherNullString)

    // you can rewrite this line using the elvis operator '?:'

    val elvisNullString: String? = nullString ?: "well then have this"

    println(elvisNullString)

    // you can explicitly allow the use of a null value by using the '!!' operator

    val bangBangOperatorString: String = nullString!!

    println("This will throw an exception -> $bangBangOperatorString")

}