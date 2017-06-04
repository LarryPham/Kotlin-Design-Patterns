package com.capsule.patterns.state

import org.slf4j.LoggerFactory

open class AngryState(val mammoth: Mammoth) : State {

    override fun onEnterState() = LOGGER.info("{} is furious!", mammoth)

    override fun observe() = LOGGER.info("{} gets angry", mammoth)

    companion object {
        private val LOGGER = LoggerFactory.getLogger(AngryState::class.java)
    }
}