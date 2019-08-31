package lesson20

fun main() {
    /**
     * Declare and use a data class
     */

    val item = ClothingItem("shirt", "S", 19.99)
    // Notice that I don't have to call to string because the compiler will use the
    // auto-generated one from the data class declaration
    println(item)
    // Notice how I can reassign the value of price since its variable declaration is a var.
    // The data declaration had generated a setter for us since it a mutable property
    item.price = 15.99
    println(item.price)

    // item.size = "L" -> This line will error because the constructor variable declaration for this
    // property is a val, which means that it is immutable

}