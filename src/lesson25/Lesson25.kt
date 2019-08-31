package lesson25

fun main() {
    /**
     * Manage ordered collections with List
     */
    // You can create a List of objects using the listOf function. Note
    // that by default, the List provided by these methods are immutable
    val listOfColors: List<String> = listOf("Red", "Blue", "Green")
    for (color in listOfColors) {
        println(color)
    }

    // For a mutable list, use the mutableListOf function. Notice the type difference
    val mutableListOfColors: MutableList<String> = mutableListOf("Gold", "Black", "Grey")
    for (color in mutableListOfColors) {
        println(color)
    }

    // Remove a element
    mutableListOfColors.remove("Gold")
    // The List implementation has an overridden toString function
    println(mutableListOfColors)

    // Add a color
    mutableListOfColors.add("Brown")
    println(mutableListOfColors)
}