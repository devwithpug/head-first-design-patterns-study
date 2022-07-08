package ch4.factory.factory

import ch4.factory.pizza.ChicagoStyleCheesePizza
import ch4.factory.pizza.ChicagoStyleGreekPizza
import ch4.factory.pizza.ChicagoStylePepperoniPizza
import ch4.factory.pizza.Pizza
import ch4.factory.pizza.PizzaMenu

class ChicagoPizzaFactory : PizzaFactory {
    override fun createPizza(menu: PizzaMenu): Pizza {
        println("create... chicago style pizza")
        return when (menu) {
            PizzaMenu.CHEESE -> ChicagoStyleCheesePizza()
            PizzaMenu.GREEK -> ChicagoStyleGreekPizza()
            PizzaMenu.PEPPERONI -> ChicagoStylePepperoniPizza()
        }
    }
}
