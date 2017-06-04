package com.capsule.patterns.iterator

enum class ItemType {
    ANY, WEAPON, RING, POTION
}

data class Item(val type: ItemType, val name: String) {
    override fun toString(): String = this.name
}