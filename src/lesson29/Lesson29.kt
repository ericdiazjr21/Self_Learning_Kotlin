package lesson29

fun main() {
    /**
     * Inheritance and the Any Class
     */
    // This is the Java equivalent to object
    val anyClass: Any = Any()

    val nycBird = Bird("nycBird")
    nycBird.canFly = false
    // Notice that the Bird class only prints properties of its own class
    println(nycBird)
    // Though it does have property of Animal
    println(nycBird.coldBlooded)
    println(nycBird.hasLegs)

}

// To make a class extendable it must be declared open
open class Animal(val coldBlooded: Boolean) {
    // This property is not available to subclasses
    var canFly: Boolean? = null
    //this property IS available to all subclasses for overriding
    open var hasLegs: Boolean? = null
}

// to extend a class you must use a colon after the class name then
// make a call the super class constructor and suffice all requirements.
// data classes will cannot be extended
data class Bird(val name: String) : Animal(false) {
    //This is the overridden property that is open in the super class
    override var hasLegs: Boolean? = true
}