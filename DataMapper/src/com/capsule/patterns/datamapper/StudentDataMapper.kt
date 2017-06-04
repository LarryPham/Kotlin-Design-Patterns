package com.capsule.patterns.datamapper

import java.util.*

/**
 * The Interface lists out the possible behaviours for all possible student mappers.
 */
interface StudentDataMapper {

    fun find(studentId: Int): Optional<Student>

    @Throws(DataMapperException::class)
    fun insert(student: Student)

    @Throws(DataMapperException::class)
    fun update(student: Student)

    @Throws(DataMapperException::class)
    fun delete(student: Student)
}
