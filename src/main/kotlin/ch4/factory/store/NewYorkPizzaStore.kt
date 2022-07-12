package ch4.factory.store

import ch4.factory.pizza.factory.NewYorkPizzaFactory
import ch4.factory.pizza.Pizza

class NewYorkPizzaStore : PizzaStore() {

    private val newYorkPizzaFactory = NewYorkPizzaFactory()

    override fun createPizza(menu: String): Pizza {
        return newYorkPizzaFactory.createPizza(menu)
    }
}
