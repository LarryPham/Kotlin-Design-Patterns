package com.capsule.patterns.marker

import org.slf4j.LoggerFactory

class Guard : Permission {

    public fun enter() = logger.info("You can enter")

    companion object {
        private val logger = LoggerFactory.getLogger(Guard::class.java)
    }
}