package com.example.school

open class Person(name: String, ssn: Number) {
    //Encapsulation is the art of hiding important information from other classes
    // and exposing them only through a select method
    private val personName = name
    private var personSSN = ssn

    open fun getPersonName(): String {
        return personName
    }

    open fun getPersonSSN(): Number {
        return personSSN
    }
    open fun dance(){
        println("$personName is dancing")
    }

    fun sayHello() {
        println("Hello $personName with SSN $personSSN!")
    }
}
fun main(){
    Person("Jacob", 123).sayHello()
}