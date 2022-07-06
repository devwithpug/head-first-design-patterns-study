package ch4.factory

class OrderService {

    fun orderPizza(type: String): Pizza {
        val pizza = when (type) {
            "cheese" -> CheesePizza()
            "greek" -> GreekPizza()
            "pepperoni" -> PepperoniPizza()
            else -> throw IllegalArgumentException()
        }

        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }
}
