package com.capsule.patterns.marker

import org.slf4j.LoggerFactory

/**
 * Class defining thief.
 */
class Thief {

    fun steal() = logger.info("Steal valuable items")

    fun doNothing() = logger.info("Pretend nothing happened and just leave.")

    companion object {

        private val logger = LoggerFactory.getLogger(Thief::class.java)
    }
}