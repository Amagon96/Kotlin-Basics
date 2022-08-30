package com.example.inheritance

class Student(name: String, ssn: Number): Person(name, ssn) {
    private val studentName = name
    override fun dance() {
        println("$studentName doesn't now how to dance")
    }
}

fun main(){
    val student1 = Student("Ian", 123)
    student1.sayHello()
    student1.dance()
    val student2 = Student("Jacob", 456)
    student2.sayHello()
    student2.dance()

    //println(student1.personSSN)
    //student1.personSSN = 123456
}