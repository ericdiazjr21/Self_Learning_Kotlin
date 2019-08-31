package lesson22

data class Cat(private val _name: String, val age: Int?, val color: String?) {

    // You can don't have access to the getter and setters of properties
    // that are passed in the primary constructor. To get access to this,
    // you must declare an explicit field that takes value from the constructor
    // and then override the getter and/or setter methods.

    val name = _name
        // You can override the get method to alter the data of the field backing this
        // property
        get() = field.toUpperCase()

    // This is the field declaration for the size param that is not apart the original
    // constructor. Since it is a var variable type, it will have a getter and setter
    // automatically.
    var size: String? = null ?: "Unknown"
        set(value) {
            field = value?.toLowerCase()
        }

    constructor(name: String, _size: String) : this(name, null, null) {
        size = _size
    }


}
