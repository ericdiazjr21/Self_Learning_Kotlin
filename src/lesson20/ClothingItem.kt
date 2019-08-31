package lesson20

// for Pojo's in Java, Kotlin has introduced the data keyword to represent the
// same sort of functionality. You must use the declaration keyword of 'data' before
// the class declaration. This will automatically generate setters and getters depending
// on the constructors variable types. All data classes will auto-generate the classes
// toString , equals, and hashcode functions without having to explicitly state them in
// the class.
data class ClothingItem(val type: String, val size: String, var price: Double)