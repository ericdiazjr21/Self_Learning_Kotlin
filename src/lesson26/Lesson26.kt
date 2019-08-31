package lesson26

fun main() {
    /**
     * Manage unordered collections with Sets
     */

    // To get a set us the setOf function. Note that the
    // base set interface is immutable. Remember that order is not
    // guaranteed.
    val setOfColors: Set<String> = setOf("Red", "Blue", "Yellow")
    println(setOfColors)

    // for a mutable list you can convert the original list to a mutable one
    val mutableSetOfColors = setOfColors.toMutableSet()

    //Add to the set
    mutableSetOfColors.add("Gold")

    //Remove from the set
    mutableSetOfColors.remove("Blue")
    
}