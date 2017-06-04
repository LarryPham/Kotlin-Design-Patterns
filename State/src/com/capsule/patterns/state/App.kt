package com.capsule.patterns.state

/**
 * In the state pattern, the container object has an internal state object that defines the curretn behavior.
 * The state object can be changed to alter the behavior.
 *
 * <p>
 * This can be a cleaner way for an object to change its behavior at runtime without resorting to large monolithic
 * conditional statements and thus improves maintainability.
 * </p>
 * In this example the {@link Mammoth} changes it behavior as time passes by,
 */
object App {

    @JvmStatic fun main(args: Array<String>) {
        val mammoth = Mammoth()
        mammoth.observe()

        mammoth.timePasses()
        mammoth.observe()

        mammoth.timePasses()
        mammoth.observe()
    }
}