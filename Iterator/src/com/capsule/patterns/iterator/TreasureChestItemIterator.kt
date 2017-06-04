package com.capsule.patterns.iterator

class TreasureChestItemIterator(val chest: TreasureChest, val itemType: ItemType) : ItemIterator {

    private var idx: Int

    init {
        idx = -1
    }

    override fun hasNext(): Boolean = findNextIdx() != -1

    override fun next(): Item? {
        idx = findNextIdx()
        if (idx != -1) {
            return chest.getItems().get(idx)
        }
        return null
    }

    private fun findNextIdx(): Int {
        val items: MutableList<Item> = chest.getItems()
        val found: Boolean = false
        var tempIdx = idx
        while (!found) {
            tempIdx++
            if (tempIdx >= items.size) {
                tempIdx = -1
                break
            }

            if (itemType == ItemType.ANY || items.get(tempIdx).type == itemType) {
                break
            }
        }
        return tempIdx
    }
}
