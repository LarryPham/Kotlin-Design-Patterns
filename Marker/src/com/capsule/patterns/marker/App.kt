package com.capsule.patterns.marker

import org.apache.log4j.BasicConfigurator
import org.slf4j.LoggerFactory

object App {

    private val logger = LoggerFactory.getLogger(App::class.java)

    @JvmStatic fun main(args: Array<String>) {
        BasicConfigurator.configure()

        val guard = Guard()
        val thief = Thief()

        if (guard is Permission) guard.enter()
        else logger.info("You have no permission to enter, please leave this area.")

        if (thief.javaClass != Permission::class.java) thief.steal()
        else thief.doNothing()
    }
}
