package com.example.school
//Inherit allows classes to inherit from other classes
class Student(name: String, ssn: Number): Person(name, ssn) {

    // Method Override:
    // The Student class takes the method `dance` from the Person class
    // but changing its functionality to return another message
    override fun dance() {
        println("${getPersonName()} doesn't now how to dance")
    }
}

fun main(){
    val student1 = Student("Ian", 123)
    student1.sayHello()
    student1.dance()
    student1.getPersonSSN()
    val student2 = Student("Jacob", 456)
    student2.sayHello()
    student2.dance()

    //println(student1.personSSN)
    //student1.personSSN = 123456
}