package com.capsule.patterns.state

class Mammoth {

    private var state: State

    init {
        state = PeacefulState(this)
    }

    fun timePasses() {
        if (state.javaClass == PeacefulState::class.java) {
            changeStateTo(AngryState(this))
        } else {
            changeStateTo(PeacefulState(this))
        }
    }

    private fun changeStateTo(newState: State) {
        this.state = newState
        this.state.onEnterState()
    }

    override fun toString(): String = "The mammoth"

    fun observe() = this.state.observe()
}
