package com.capsule.patterns.datamapper

import java.io.Serializable

class Student(var studentId: Int, var name: String,var grade: Char):  Serializable {

    override fun equals(other: Any?): Boolean {
        if (this === other)  return true
        else if (other!!.javaClass == javaClass) {
            val otherStudent = other as Student
            if (otherStudent.studentId == studentId) return true
        }
        return false
    }

    override fun hashCode(): Int = studentId

    override fun toString(): String = "Student[Id: %d, Name: %s, Grade: %s]".format(studentId, name, grade)
}