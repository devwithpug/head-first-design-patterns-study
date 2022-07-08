package ch4.factory.factory

import ch4.factory.pizza.CheesePizza
import ch4.factory.pizza.GreekPizza
import ch4.factory.pizza.PepperoniPizza
import ch4.factory.pizza.Pizza
import ch4.factory.pizza.PizzaMenu

class SimplePizzaFactory : PizzaFactory {
    override fun createPizza(menu: PizzaMenu): Pizza {
        println("create... simple pizza")
        return when (menu) {
            PizzaMenu.CHEESE -> CheesePizza()
            PizzaMenu.GREEK -> GreekPizza()
            PizzaMenu.PEPPERONI -> PepperoniPizza()
        }
    }
}
