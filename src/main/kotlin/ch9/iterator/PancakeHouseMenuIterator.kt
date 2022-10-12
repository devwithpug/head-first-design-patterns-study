package ch9.iterator

class PancakeHouseMenuIterator(
    private val menuItems: List<MenuItem>
) : Iterator<MenuItem> {

    var position = 0

    override fun hasNext() = position < menuItems.size
    override fun next() = menuItems[position++]
}
