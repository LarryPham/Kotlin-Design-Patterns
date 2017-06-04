package com.capsule.patterns.state

open interface State {
    fun onEnterState()
    fun observe()
}