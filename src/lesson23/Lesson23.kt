package lesson23

import lesson20.ClothingItem
import java.text.NumberFormat
import java.util.*

fun main() {
    /**
     * mix and match Java classes
     */

    // There are instances where you want to use Java functionality in Kotlin
    // because Java has many ways of being able to do small things like for
    // this example, setting the local currency symbol to the price property.
    val item = ClothingItem(type = "shirt", price = 19.99, size = "Large")
    // In Kotlin, we would have to hard code this because it doesn't have this
    // sort of support
    println("$${item.price}")

    //But you can still use Java's Local Library
    val formatter = NumberFormat.getCurrencyInstance()
    // Notice that this prints the same thing!
    println(formatter.format(item.price))

    // You can even change it to a different local
    Locale.setDefault(Locale.FRANCE)
    val euroFormatter = NumberFormat.getCurrencyInstance()
    // Now it prints in euros
    println(euroFormatter.format(item.price))
}