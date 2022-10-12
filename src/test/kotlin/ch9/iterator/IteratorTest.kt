package ch9.iterator

import org.junit.jupiter.api.Test

internal class IteratorTest {

    @Test
    fun `test printMenu`() {
        // given
        val pancakeHouseMenu = PancakeHouseMenu()
        val dinerMenu = DinerMenu()

        val pancakeHouseMenuItems = pancakeHouseMenu.getMenuItem()
        val dinerMenuItems = dinerMenu.getMenuItems()

        // when & then
        printMenu(pancakeHouseMenuItems, dinerMenuItems)
    }

    private fun printMenu(pancakeHouseMenu: MutableList<MenuItem>, dinerMenu: Array<MenuItem>) {
        pancakeHouseMenu.forEach { println("${it.name} ${it.description} ${it.price} ${it.vegetarian}") }
        dinerMenu.forEach { println("${it.name} ${it.description} ${it.price} ${it.vegetarian}") }
    }
}
