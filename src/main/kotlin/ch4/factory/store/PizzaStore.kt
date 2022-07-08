package ch4.factory.store

import ch4.factory.pizza.Pizza
import ch4.factory.pizza.PizzaMenu

abstract class PizzaStore {

    fun orderPizza(menu: PizzaMenu): Pizza {
        val pizza = createPizza(menu)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }

    abstract fun createPizza(menu: PizzaMenu): Pizza
}
