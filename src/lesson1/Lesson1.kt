package lesson1

fun main(){
    println("Hello Kotlin")

    //You can concatenate like in Java
    println("Print this" + " how we do in java")

    //In Kotlin you can do the same with String Templates
    println("This is an example of a ${"String Template"}")

    //String templates can also take thing evaluate to a String
    val name = "Eric Diaz"

    println("My name is ${name}")
}