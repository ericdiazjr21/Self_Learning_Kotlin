package lesson30

fun main() {
    /**
     * Define and implement an interface
     */

    val dogRetriever: Dog = Retriever()
    val dogJackRussel: Dog = JackRussel()

    fun makeItTalk(dog: Dog) {
        dog.bark()
    }

    fun makeItWalk(dog: Dog) {
        dog.walk()
    }

    fun whatDogType(dog: Dog) {
        println(dog::class.simpleName)
    }

    // Notice that when call bark, we get the retriever bark, when we call bark, we
    // get the interface declaration response for the call, and when we call what dog
    // type, we get the subclass as the name.
    makeItTalk(dogRetriever)
    makeItWalk(dogRetriever)
    whatDogType(dogRetriever)


    // Here we have overridden the walk method to say something different from the interface
    // implementation of the function, also that we have its own bark function being called
    // with its particular functionality.
    makeItTalk(dogJackRussel)
    makeItWalk(dogJackRussel)
    whatDogType(dogJackRussel)


}

// To create an interface, the file declaration interface must be used.
// All interfaces can have abstract functions and non-abstract functions

interface Dog {
    // This is an abstract method. No body. This method must be overridden by any subclass.
    fun bark()

    // This is normal function with a body. Does not need to be overridden by subclass, can
    // be optionally.
    fun walk() {
        println("walking - Superclass")
    }
}

// The way to implement an interface is the same as extending a class, except
// no constructor because interfaces can be instantiated.
class Retriever : Dog {
    //overridden by rule
    override fun bark() {
        // abstract implementation for this particular subclass of Dog
        println("ruff, ruff")
    }

    // optionally overridden. Can add whatever functionality you want. Notice that the
    // override and fun declarations are grey because we haven't change the super class
    // implementation.
    override fun walk() {
        super.walk() // -> this will call the super class method walk
    }
}

class JackRussel : Dog {
    // abstract implementation for this particular subclass of Dog
    override fun bark() {
        println("Woof, Woof")
    }

    override fun walk() {
        // We have overridden the method and replace the super class call with a custom expression
        println("I don't walk a lot but okay")
    }
}

