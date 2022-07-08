package ch4.factory.store

import ch4.factory.factory.NewYorkPizzaFactory
import ch4.factory.pizza.Pizza
import ch4.factory.pizza.PizzaMenu

class NewYorkPizzaStore : PizzaStore() {

    private val newYorkPizzaFactory = NewYorkPizzaFactory()

    override fun createPizza(menu: PizzaMenu): Pizza {
        return newYorkPizzaFactory.createPizza(menu)
    }
}
