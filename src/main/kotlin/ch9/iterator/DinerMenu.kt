package ch9.iterator

class DinerMenu {

    private val menuItems: Array<MenuItem> = Array(size = MAX_ITEMS) { EMPTY_MENU_ITEM }
    private var numberOfItems = 0

    init {
        addItem(
            name = "vegetarian blt",
            description = "vegetarian blt",
            vegetarian = true,
            price = 2.99
        )
        addItem(
            name = "blt",
            description = "blt",
            vegetarian = false,
            price = 2.99
        )
    }

    fun addItem(
        name: String,
        description: String,
        vegetarian: Boolean,
        price: Double
    ) {
        if (numberOfItems >= MAX_ITEMS) {
            throw IllegalStateException()
        }
        menuItems[numberOfItems++] = MenuItem(name, description, vegetarian, price)
    }

    fun iterator() = DinerMenuIterator(menuItems.copyOfRange(0, numberOfItems))

    companion object {
        private const val MAX_ITEMS = 6
        private val EMPTY_MENU_ITEM = MenuItem("", "", false, 0.0)
    }
}
