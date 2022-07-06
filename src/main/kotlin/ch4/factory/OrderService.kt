package ch4.factory

class OrderService(
    private val pizzaFactory: PizzaFactory
) {

    fun orderPizza(menu: PizzaMenu): Pizza {
        val pizza = pizzaFactory.createPizza(menu)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }
}
