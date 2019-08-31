package lesson21

fun main() {
    /**
     * use primary and secondary constructors
     */

    //This is using the primary constructor of the class
    val dog1 = Dog("terrir", 17, "black")
    println(dog1)

    // This is using the secondary constructor. Notice that the
    // print of dog2 does not include a field for hairType. This is
    // because you must there is no variable declaration type in the
    // second constructor so it cannot be inferred what mutability the
    // property should have. This will get explained in the next lesson
    val dog2 = Dog("jack-russel", "gold")
    println(dog2)

}