package lesson28

import lesson20.ClothingItem

fun main() {
    /**
     * Challenge : Sum up a collections
     */

    val mapOfShoppingCart = mutableMapOf<ClothingItem, Int>()
    mapOfShoppingCart[ClothingItem("Shirt", "L", 14.99)] = 3
    mapOfShoppingCart[ClothingItem("Pants", "28", 19.99)] = 5
    mapOfShoppingCart[ClothingItem("Hat", "7.5", 25.00)] = 1

    var total = 0.0

    for ((item, quantity) in mapOfShoppingCart) {
        val itemTotal = item.price * quantity
        total += itemTotal
        println("Item ${item.type} @ ${item.price} = $itemTotal")
    }

    println("_________________")
    println("Total is $total")
}