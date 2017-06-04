package com.capsule.patterns.state

import org.slf4j.LoggerFactory

class PeacefulState(val mammoth: Mammoth) : State {

    override fun onEnterState() = LOGGER.info("{} is calm and peaceful.", mammoth)

    override fun observe() = LOGGER.info("{} calms down.", mammoth)

    companion object {
        private val LOGGER = LoggerFactory.getLogger(PeacefulState::class.java)
    }
}