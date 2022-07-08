package ch4.factory.store

import ch4.factory.pizza.Pizza

abstract class PizzaStore {

    fun orderPizza(menu: String): Pizza {
        val pizza = createPizza(menu)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }

    abstract fun createPizza(menu: String): Pizza
}
