package ch4.factory.pizza.factory

import ch4.factory.pizza.NewYorkStyleCheesePizza
import ch4.factory.pizza.NewYorkStyleClamPizza
import ch4.factory.pizza.NewYorkStyleGreekPizza
import ch4.factory.pizza.NewYorkStylePepperoniPizza
import ch4.factory.pizza.Pizza

class NewYorkPizzaFactory : PizzaFactory {
    override fun createPizza(menu: String): Pizza {
        println("create... new york style pizza")
        return when (menu) {
            "cheese" -> NewYorkStyleCheesePizza()
            "greek" -> NewYorkStyleGreekPizza()
            "pepperoni" -> NewYorkStylePepperoniPizza()
            "clam" -> NewYorkStyleClamPizza()
            else -> throw IllegalArgumentException()
        }
    }
}
