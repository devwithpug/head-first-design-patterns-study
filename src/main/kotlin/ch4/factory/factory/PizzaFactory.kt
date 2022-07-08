package ch4.factory.factory

import ch4.factory.pizza.Pizza

interface PizzaFactory {
    fun createPizza(menu: String): Pizza
}
