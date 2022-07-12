package ch4.factory.pizza.factory

import ch4.factory.pizza.ChicagoStyleCheesePizza
import ch4.factory.pizza.ChicagoStyleClamPizza
import ch4.factory.pizza.ChicagoStyleGreekPizza
import ch4.factory.pizza.ChicagoStylePepperoniPizza
import ch4.factory.pizza.Pizza

class ChicagoPizzaFactory : PizzaFactory {
    override fun createPizza(menu: String): Pizza {
        println("create... chicago style pizza")
        return when (menu) {
            "cheese" -> ChicagoStyleCheesePizza()
            "greek" -> ChicagoStyleGreekPizza()
            "pepperoni" -> ChicagoStylePepperoniPizza()
            "clam" -> ChicagoStyleClamPizza()
            else -> throw IllegalArgumentException()
        }
    }
}
