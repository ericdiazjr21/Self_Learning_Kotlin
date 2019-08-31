package lesson21

// This constructor is referred to as the 'primary constructor'. A class can have as many
// many constructors as necessary like in Java, but they have different rules. In a primary
// constructor, there is not function body, meaning that they look abstract. If there is a
// code that wants to be executed, you can use the 'init' keyword and block to have code
// execute on instantiation of a class. Also, note the constructor keyword that is being used,
// however, it is not necessary to declare this keyword because the kotlin compiler can infer it

data class Dog constructor(var breed: String, val age: Int?, val color: String?) {

    // This code block is run after the primary constructor is called.
    init {
        // For this example, we'll simply change the String to an uppercase String
        breed = breed.toUpperCase()
    }

    // To create another constructor that is after the primary, then use the constructor
    // keyword and pass the needed params. Note that in secondary+ constructors,
    // the variable type declaration is not needed.
    //
    // The secondary needs to be constructed based on the primary constructors definitions.
    // That is why after the secondary constructor you must make a call to the primary and
    // pass in values to suffice the constructor definition.
    constructor(breed: String, hairType: String) : this(breed, null, null)


}
