package ch4.factory.pizza.factory

import ch4.factory.pizza.OrdinaryCheesePizza
import ch4.factory.pizza.OrdinaryClamPizza
import ch4.factory.pizza.OrdinaryGreekPizza
import ch4.factory.pizza.OrdinaryPepperoniPizza
import ch4.factory.pizza.Pizza

class OrdinaryPizzaFactory : PizzaFactory {
    override fun createPizza(menu: String): Pizza {
        println("create... ordinary pizza")
        return when (menu) {
            "cheese" -> OrdinaryCheesePizza()
            "greek" -> OrdinaryGreekPizza()
            "pepperoni" -> OrdinaryPepperoniPizza()
            "clam" -> OrdinaryClamPizza()
            else -> throw IllegalArgumentException()
        }
    }
}
