package ch4.factory

class OrderService(
    private val pizzaFactory: PizzaFactory
) {

    fun orderPizza(type: String): Pizza {
        val pizza = pizzaFactory.createPizza(type)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }
}
