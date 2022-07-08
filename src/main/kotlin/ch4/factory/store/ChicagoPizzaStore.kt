package ch4.factory.store

import ch4.factory.factory.ChicagoPizzaFactory
import ch4.factory.pizza.Pizza
import ch4.factory.pizza.PizzaMenu

class ChicagoPizzaStore : PizzaStore() {

    private val chicagoPizzaFactory = ChicagoPizzaFactory()

    override fun createPizza(menu: PizzaMenu): Pizza {
        return chicagoPizzaFactory.createPizza(menu)
    }
}
