package ch4.factory.store

import ch4.factory.pizza.Pizza
import ch4.factory.pizza.factory.ItalyPizzaFactory

class ItalyPizzaStore : PizzaStore() {

    private val italyPizzaFactory = ItalyPizzaFactory()

    override fun createPizza(menu: String): Pizza {
        return italyPizzaFactory.createPizza(menu)
    }
}
