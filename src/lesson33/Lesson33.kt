package lesson33

import kotlin.math.min

fun main() {
    /**
     * use abstract and sealed classes
     */

    val newUser = NewUser(1234, "10-10-2000", "Eric", "gmail.com")
    val existingUser = ExistingUser(23, "Diaz", "Yahoo.com")

    println(newUser.toString())
    println(existingUser.toString())

    val olderUser = if (newUser.id < existingUser.id) newUser else existingUser

    val answer = when (olderUser) {
        is NewUser -> newUser.name
        is ExistingUser -> existingUser.name
    }

    println(answer)

}

// Sealed subclass rule - All subclasses must be declared in the same file as the super sealed class.
// can be nested classes or outside the class. Subclasses can be data classes
sealed class User(val _id: Long) {
    // These are abstract variables that all subclasses must override
    abstract val name: String
    abstract val email: String
}

// when you extend the super class you have to override any abstract members of the super class.
// you can do this in the constructor of you subclass.
data class NewUser(
    val id: Long,
    val dateCreated: String,
    override val name: String,
    override val email: String
) : User(id)

data class ExistingUser(
    val id: Long,
    override val name: String,
    override val email: String
) : User(id)