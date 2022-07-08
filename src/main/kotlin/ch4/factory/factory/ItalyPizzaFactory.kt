package ch4.factory.factory

import ch4.factory.pizza.ItalyStyleCheesePizza
import ch4.factory.pizza.ItalyStyleGreekPizza
import ch4.factory.pizza.ItalyStylePepperoniPizza
import ch4.factory.pizza.Pizza
import ch4.factory.pizza.PizzaMenu

class ItalyPizzaFactory : PizzaFactory {
    override fun createPizza(menu: PizzaMenu): Pizza {
        println("create... italy style pizza")
        return when (menu) {
            PizzaMenu.CHEESE -> ItalyStyleCheesePizza()
            PizzaMenu.GREEK -> ItalyStyleGreekPizza()
            PizzaMenu.PEPPERONI -> ItalyStylePepperoniPizza()
        }
    }
}
