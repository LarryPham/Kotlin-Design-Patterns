package com.capsule.patterns.marker

import org.junit.Assert.*
import org.junit.Test

class ThiefTest {

    @Test
    fun testThief() {
        val thief = Thief();
        assertFalse(thief.javaClass == Permission::class.java)
    }
}