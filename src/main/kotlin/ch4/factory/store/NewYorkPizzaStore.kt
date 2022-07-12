package ch4.factory.store

import ch4.factory.pizza.Pizza
import ch4.factory.pizza.factory.NewYorkPizzaFactory

class NewYorkPizzaStore : PizzaStore() {

    private val newYorkPizzaFactory = NewYorkPizzaFactory()

    override fun createPizza(menu: String): Pizza {
        return newYorkPizzaFactory.createPizza(menu)
    }
}
