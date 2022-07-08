package ch4.factory.store

import ch4.factory.factory.ItalyPizzaFactory
import ch4.factory.pizza.Pizza
import ch4.factory.pizza.PizzaMenu

class ItalyPizzaStore : PizzaStore() {

    private val italyPizzaFactory = ItalyPizzaFactory()

    override fun createPizza(menu: PizzaMenu): Pizza {
        return italyPizzaFactory.createPizza(menu)
    }
}
