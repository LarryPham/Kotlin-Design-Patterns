package com.capsule.patterns.datamapper

import org.junit.Assert
import org.junit.Test

class DataMapperTest {

    @Test
    fun testFirstDataMapper() {
        val mapper = StudentDataMapperExecutor()

        var student = Student(1, "Adam", 'A')
        mapper.insert(student)

        /* Check if student is added in db. */
        Assert.assertEquals(student.studentId, mapper.find(student.studentId).get().studentId)

        /* Update existing student object */
        student = Student(student.studentId, "AdamUpdated", 'A')
        mapper.update(student)

        Assert.assertEquals(mapper.find(student.studentId).get().name, "AdamUpdated")

        /* Delete student in db */
        mapper.delete(student)
        Assert.assertEquals(false, mapper.find(student.studentId).isPresent)
    }
}
