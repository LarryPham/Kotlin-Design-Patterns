package com.capsule.patterns.iterator

import org.apache.log4j.BasicConfigurator
import org.slf4j.LoggerFactory

object App {

    private val LOGGER = LoggerFactory.getLogger(App::class.java)

    @JvmStatic fun main(args: Array<String>) {
        BasicConfigurator.configure()
        
        val chest = TreasureChest()

        val ringIterator = chest.iterator(ItemType.RING)
        while (ringIterator.hasNext()) {
            LOGGER.info(ringIterator.next().toString())
        }

        val potionIterator = chest.iterator(ItemType.POTION)
        while (potionIterator.hasNext()) {
            LOGGER.info(potionIterator.next().toString())
        }
    }
}