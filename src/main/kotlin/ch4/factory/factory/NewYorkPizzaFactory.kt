package ch4.factory.factory

import ch4.factory.pizza.NewYorkStyleCheesePizza
import ch4.factory.pizza.NewYorkStyleGreekPizza
import ch4.factory.pizza.NewYorkStylePepperoniPizza
import ch4.factory.pizza.Pizza
import ch4.factory.pizza.PizzaMenu

class NewYorkPizzaFactory : PizzaFactory {
    override fun createPizza(menu: PizzaMenu): Pizza {
        println("create... new york style pizza")
        return when (menu) {
            PizzaMenu.CHEESE -> NewYorkStyleCheesePizza()
            PizzaMenu.GREEK -> NewYorkStyleGreekPizza()
            PizzaMenu.PEPPERONI -> NewYorkStylePepperoniPizza()
        }
    }
}
