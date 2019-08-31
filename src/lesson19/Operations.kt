package lesson19

// enums in Kotlin are created as objects/classes unlike in Java. This is why
// this you must use the class declaration along with the enum declaration when
// creating an enum class. Since enums are objects, they can have constructors and
// class member like in the example at the bottom. In this example, the operator param
// is a property of the Operations enum class. This mean that it can be accessed with
// any instance of this class.
enum class Operations(val operator: String) {
    // When creating enums in the class, you can use conventional Java style declaration.
    // When these instance are accessed, they will have access to there individual properties
    // that are passed in the constructor argument.
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("-")
}