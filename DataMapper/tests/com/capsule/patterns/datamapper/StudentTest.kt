package com.capsule.patterns.datamapper

import org.junit.Assert.*
import org.junit.Test

class StudentTest {

    @Test
    @Throws(Exception::class)
    fun testEquality() {
        val firstStudent = Student(1, "Adam", 'A')
        val secondStudent = Student(2, "Donald", 'B')
        val secondSameStudent = Student(2, "Donald", 'B')

        val firstSameStudent = firstStudent
        assertTrue(firstStudent == firstSameStudent)

        assertFalse(firstStudent == secondStudent)
        assertTrue(secondStudent == secondSameStudent)
    }
}