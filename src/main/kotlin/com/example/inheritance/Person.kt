package com.example.inheritance

open class Person(name: String, ssn: Number) {

    private val personName = name
    var personSSN = ssn

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