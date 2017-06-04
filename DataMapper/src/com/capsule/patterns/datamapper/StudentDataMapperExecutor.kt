package com.capsule.patterns.datamapper

import java.util.*

/**
 * The implementations of Actions on Students Data.
 */
class StudentDataMapperExecutor : StudentDataMapper {

    private var students = mutableListOf<Student>()

    override fun find(studentId: Int): Optional<Student> {
        return getStudents().firstOrNull { it.studentId == studentId }?.let { Optional.of(it) } ?: Optional.empty()
    }

    override fun insert(student: Student) {
        if (!getStudents().contains(student)) {
            getStudents().add(student)
        } else {
            throw DataMapperException("Student already [" + student.name + "] exists")
        }
    }

    override fun update(student: Student) {
        if (getStudents().contains(student)) {
            val index = getStudents().indexOf(student)

            getStudents().set(index, student)
        } else {
            throw DataMapperException("Student["+ student.name +"] is not found.")
        }
    }

    override fun delete(student: Student) {
        if (getStudents().contains(student)) {
            getStudents().remove(student)
        } else {
            throw DataMapperException("Student[" + student.name + "] is not found.")
        }
    }

    fun getStudents(): MutableList<Student> = students
}