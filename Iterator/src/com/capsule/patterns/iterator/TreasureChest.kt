package com.capsule.patterns.iterator

open class TreasureChest {

    private var items: MutableList<Item> = ArrayList()

    init {
        items.add(Item(ItemType.POTION, "Potion of courage"))
        items.add(Item(ItemType.RING, "Ring of shadows"))
        items.add(Item(ItemType.POTION, "Potion of wisdom"))
        items.add(Item(ItemType.POTION, "Potion of blood"))
        items.add(Item(ItemType.WEAPON, "Sword of silver +1"))
        items.add(Item(ItemType.POTION, "Potion of rust"))
        items.add(Item(ItemType.POTION, "Potion of healing"))
        items.add(Item(ItemType.RING, "Ring of armor"))
        items.add(Item(ItemType.WEAPON, "Steel halberd"))
        items.add(Item(ItemType.WEAPON, "Dagger of poison"))
    }

    fun iterator(itemType: ItemType): ItemIterator = TreasureChestItemIterator(this, itemType)

    fun getItems(): MutableList<Item> {
        val list: MutableList<Item> = ArrayList()
        list.addAll(items)
        return list
    }
}
