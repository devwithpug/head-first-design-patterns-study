package ch4.factory.factory

import ch4.factory.pizza.Pizza
import ch4.factory.pizza.PizzaMenu

interface PizzaFactory {
    fun createPizza(menu: PizzaMenu): Pizza
}
