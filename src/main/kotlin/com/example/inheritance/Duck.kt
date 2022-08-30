package com.example.inheritance

class Duck(name: String): Animal() {
    //If you want the constructor parameter to be accessible outside the class body
    // define it as a var or val in the parameter list
    // Otherwise the parameter will be only usable on property initializers and initializer blocks declared in the class body
    private val duckName = name // This is creating a new object in memory
    var sympathize = "Poor $name!" // <-- String templates are also initializer
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints $name")
    }
    override fun greeting() = "I'm $duckName the duck!"
}

fun main() {
    Duck("Kyle")
    val duck = Duck("Brian")

    // constructor parameters are not reachable outside constructor
    // unless you add var or val keyword to the constructor
    // duck.name = "Howard"
    // println(duck.name)

    println(duck.sympathize)

    //For this you need to add the var keyword to the constructor parameter
    // duck.name = "Ethan"

    //When name is defined as a var or val, it becomes a property and is accessible outside the
    // constructor
}