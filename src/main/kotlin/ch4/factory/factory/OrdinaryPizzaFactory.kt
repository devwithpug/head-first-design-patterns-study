package ch4.factory.factory

import ch4.factory.pizza.OrdinaryCheesePizza
import ch4.factory.pizza.OrdinaryGreekPizza
import ch4.factory.pizza.OrdinaryPepperoniPizza
import ch4.factory.pizza.Pizza
import ch4.factory.pizza.PizzaMenu

class OrdinaryPizzaFactory : PizzaFactory {
    override fun createPizza(menu: PizzaMenu): Pizza {
        println("create... ordinary pizza")
        return when (menu) {
            PizzaMenu.CHEESE -> OrdinaryCheesePizza()
            PizzaMenu.GREEK -> OrdinaryGreekPizza()
            PizzaMenu.PEPPERONI -> OrdinaryPepperoniPizza()
        }
    }
}
