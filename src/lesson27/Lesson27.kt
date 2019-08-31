package lesson27

fun main() {
    /**
     * Manage key-value pairs with maps
     */

    // Create a immutable map by using the mapOf function
    val mapOfPeople: Map<String, Int> = mapOf(Pair("Eric", 27), Pair("Asiria", 25), Pair("Bob", 100))
    println(mapOfPeople)
    //you can convert an immutable map by using thr

    val mutableMapOfPeople = mapOfPeople.toMutableMap();

    //Add to the map
    mutableMapOfPeople["John"] = 85
    println(mutableMapOfPeople)

    //Remove from the map
    mutableMapOfPeople.remove("Bob")
    println(mutableMapOfPeople)

}