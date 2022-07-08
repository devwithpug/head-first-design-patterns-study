package ch4.factory

abstract class OrderService {

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
