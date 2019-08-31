package lesson22

fun main() {
    /**
     * Use explicit getter and setter functions
     */

    val cat1 = Cat("Tom", 12, "black")
    // You will notice that this has a null value for the property of size since it
    // uses the primary constructor.
    println(cat1)
    println(cat1.name)
    println(cat1.size)

    val cat2 = Cat("Jerry", "Large")
    println(cat2)
    println(cat2.size)
    cat2.size = "Small"
    println(cat2.size)

}