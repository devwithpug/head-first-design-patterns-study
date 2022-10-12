package ch9.iterator

class PancakeHouseMenu {

    private val menuItems: MutableList<MenuItem> = mutableListOf()

    init {
        addItem(
            name = "pancake set",
            description = "pancake set",
            vegetarian = false,
            price = 2.99
        )
        addItem(
            name = "blueberry pancake",
            description = "blueberry pancake",
            vegetarian = true,
            price = 3.49
        )
    }

    fun addItem(
        name: String,
        description: String,
        vegetarian: Boolean,
        price: Double
    ) {
        menuItems.add(MenuItem(name, description, vegetarian, price))
    }

    fun getMenuItem() = menuItems
}
