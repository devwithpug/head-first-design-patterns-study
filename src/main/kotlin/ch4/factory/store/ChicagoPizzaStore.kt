package ch4.factory.store

import ch4.factory.pizza.factory.ChicagoPizzaFactory
import ch4.factory.pizza.Pizza

class ChicagoPizzaStore : PizzaStore() {

    private val chicagoPizzaFactory = ChicagoPizzaFactory()

    override fun createPizza(menu: String): Pizza {
        return chicagoPizzaFactory.createPizza(menu)
    }
}
