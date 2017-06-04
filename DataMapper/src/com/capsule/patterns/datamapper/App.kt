package com.capsule.patterns.datamapper

import org.apache.log4j.BasicConfigurator
import org.slf4j.LoggerFactory
import java.util.*

object App {

    private val log = LoggerFactory.getLogger(App::class.java)

    @JvmStatic fun main(args: Array<String>) {
        BasicConfigurator.configure()

        val mapper = StudentDataMapperExecutor()

        var student = Student(1, "Adam", 'A')
        mapper.insert(student)

        log.debug("App.main(), student: $student, is inserted")

        val studentToBeFound: Optional<Student> = mapper.find(student.studentId)
        log.debug("App.main(), student: $studentToBeFound, is searched")

        /* Update existing student object. */
        student = Student(student.studentId, "AdamUpdated", 'A')
        mapper.update(student)

        log.debug("App.main(), student: $student, is updated")
        log.debug("App.main(), student: $student, gonna to be deleted.")

        mapper.delete(student)
    }
}