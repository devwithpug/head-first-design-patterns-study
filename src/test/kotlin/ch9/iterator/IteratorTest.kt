package ch9.iterator

import org.junit.jupiter.api.Test

internal class IteratorTest {

    @Test
    fun `test printMenu`() {
        // given
        val pancakeHouseMenu = PancakeHouseMenu()
        val dinerMenu = DinerMenu()

        val pancakeHouseMenuIterator = pancakeHouseMenu.iterator()
        val dinerMenuIterator = dinerMenu.iterator()

        // when & then
        printMenus(pancakeHouseMenuIterator, dinerMenuIterator)
    }

    private fun printMenus(vararg iterators: Iterator<MenuItem>) {
        iterators.forEach { iterator ->
            while (iterator.hasNext()) {
                printMenu(iterator.next())
            }
        }
    }

    private fun printMenu(menuItem: MenuItem) {
        println("${menuItem.name} ${menuItem.description} ${menuItem.price} ${menuItem.vegetarian}")
    }
}
