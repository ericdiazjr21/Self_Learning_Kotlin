package lesson9

fun main() {

    /**
     * Define reusable code in functions
     */

    val num1 = 45.5
    val num2 = 30.5

// You can assign this method call to a variable and print the results

    val result = addValue(num1, num2)
    println("This is the result: $result")

// You can also call a method and use parameter names to pass in direct
// parameters in any order since you are specifically stating the param name

    val result2 = subtractValue(param2 = num2, param1 = num1)
    println("This is the second result: $result2")


// Notice that this method's signature contains 3 parameters but only needs
// 2 to compile. This is because the third parameter already has a default
// value.
    val result3 = multiplyValue(num1, num2)
    val result4 = multiplyValue(num1, num2, "-1")
    println("This is the third result: $result3")
    println("This is the fourth result, should return -1: $result4")

// Notice that i've passed a variable number of arguments at this point
    countValue(12, 23, 34, 45, 56, 76, 87, 88, 99, 11, 1, 1)
}

// Function are declared always starting with the 'fun' keyword. Followed by
// the the method name. After this comes from the parameter declaration.
// At the end, if the function needs to return something, then you need to
// state after a colon the type of object that will be returned by the function.

fun addValue(param1: Double, param2: Double): Double {
//    param1++ -> This line shows an error because parameters are always immutable.
    return param1.plus(param2)
}


fun subtractValue(param1: Double, param2: Double): Double {
    return param1.minus(param2)
}

// Functions can have parameter with default values. This means if there is a
// parameter that is not passed in at the method call, then by default, it's
// value will be equal to the predefined value. You can pass through a value
// into that parameter that will override the default value
fun multiplyValue(param1: Double, param2: Double, param3: String = "*"): Double {
    if (param3 == "*") {
        return param1.times(param2)
    } else {
        return -1.0
    }
}

// Functions can also take in a variable number of parameters given that they are
// all apart of the same type by using the 'vararg' keyword
fun countValue(vararg inputs: Int) {
    for (i in inputs) {
        println(i)
    }
}

