package ch9.iterator

class DinerMenuIterator(
    private val menuItems: Array<MenuItem>
) : Iterator<MenuItem> {

    var position = 0

    override fun hasNext() = position < menuItems.size
    override fun next() = menuItems[position++]
}
