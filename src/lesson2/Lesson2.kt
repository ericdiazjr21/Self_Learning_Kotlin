package lesson2

// You can create variables at the top of a Kotlin file.
// These are referred to as "Top Level Variables" and are accessible
// to all parts of the file.

val myTopLevelVariable = "This is accessible anywhere else in the file"

fun main() {

    // "val" is the keyword used for creating a reading-only variable.
    // This means once a value is assigned, it cannot be reassigned to
    // anything else. It could only be accessed and read.
    // Also notice that the type is not be explicitly stated. This is
    // because Kotlin is inferring the type of the value, in this case
    // its inferring that it a string.
    val name = "Eric Diaz"
    println("My name is ${name}")
    // name = "Not Changeable" -> this will cause a compile error if uncommented



    // "var" us the keyword used for creating read/write variables.
    // This means that the the value of this variable can change.
    var age = 26
    println("This is my current age: ${age}")
    age++
    println("This will be my age next year: ${age}")
    // Notice how age is incremented. Also notice how the type is being
    // inferred here as well, which is Int. To explicitly state the type
    // of a variable you must use a semi colon after the variable name, then
    // state the type of the variable
    val weight: Double = 180.5
    println("My current weight is : ${weight}")
    // You will notice the the type is greyed out because the compiler can
    // infer the type and doesn't need to told what it is explicitly.



    // Lets print out top level variable within the main function
    println(myTopLevelVariable)

}