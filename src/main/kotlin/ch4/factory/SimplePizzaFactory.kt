package ch4.factory

class SimplePizzaFactory : PizzaFactory {

    override fun createPizza(type: String) =
        when (type) {
            "cheese" -> CheesePizza()
            "greek" -> GreekPizza()
            "pepperoni" -> PepperoniPizza()
            else -> throw IllegalArgumentException()
        }
}
