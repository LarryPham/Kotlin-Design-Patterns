package com.capsule.patterns.iterator

interface ItemIterator {
    fun hasNext(): Boolean
    fun next(): Item?
}
