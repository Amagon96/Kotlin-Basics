package com.example.school

class Principal() {
    private var studentsName = mutableListOf<String>()

    fun getStudentsName(): List<String> {
        return studentsName
    }

    // Method Overload:
    // both methods can be named similarly but the method that gets called
    // is dependent on what you passed in as a parameter
    fun admitApplicant(applicant: String){
    }

    fun admitApplicant(applicants: List<String>){
    }
}