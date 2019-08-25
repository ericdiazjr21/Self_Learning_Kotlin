package lesson7

import java.lang.StringBuilder

fun main(){
    /**
     * Work with String values and String Builder
     */

    // A String in Kotlin a much like the a String in java. The only
    // difference is syntax.

    var myString = "This is my String.\n"
    println(myString)

    // You can create a string using the constructor from the String class

    val emptyString = String()
    println("'$emptyString'")

    // Like in java, Strings are Char sequences that can ba accessed

    val charArray = myString.toCharArray()
    println(charArray.toList()) // -> to be able to print it out, it can
    // be made into a list. Otherwise it will print the address in memory

    val byteCodeArray = myString.toByteArray()
    println(byteCodeArray.toList()) // -> prints the numerical value of each character

    // Kotlin String like java are immutable. So using string interpolation with
    // existing String objects does not alter a String, rather it creates a new one

    myString += " Now this is a new temp String object,\n"
    myString += " though it seems like its all the same String\n"
    println(myString)

    // You can get the length of a String by access the property length of a String

    val myStringLength = myString.length

    // You can get any character in a character sequence by first the index

    for(i in 0 until myStringLength){
        println(myString.get(i))
    }


    //To avoid creating extra objects where you interpolate, use a String Builder

    val stringBuilder = StringBuilder("This is a string builder. ")
        .append("That builds one long string")
    println(stringBuilder)
}