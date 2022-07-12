package ch4.factory.pizza.factory

import ch4.factory.pizza.ItalyStyleCheesePizza
import ch4.factory.pizza.ItalyStyleClamPizza
import ch4.factory.pizza.ItalyStyleGreekPizza
import ch4.factory.pizza.ItalyStylePepperoniPizza
import ch4.factory.pizza.Pizza

class ItalyPizzaFactory : PizzaFactory {
    override fun createPizza(menu: String): Pizza {
        println("create... italy style pizza")
        return when (menu) {
            "cheese" -> ItalyStyleCheesePizza()
            "greek" -> ItalyStyleGreekPizza()
            "pepperoni" -> ItalyStylePepperoniPizza()
            "clam" -> ItalyStyleClamPizza()
            else -> throw IllegalArgumentException()
        }
    }
}
