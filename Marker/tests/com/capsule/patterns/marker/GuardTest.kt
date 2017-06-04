package com.capsule.patterns.marker

import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test

class GuardTest {

    @Test
    fun testGuard() {
        val guard = Guard()
        Assert.assertTrue(guard is Permission)
    }
}