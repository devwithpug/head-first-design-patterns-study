package ch4.factory

class ItalyPizzaFactory : PizzaFactory {
    override fun createPizza(menu: PizzaMenu): Pizza {
        println("create... italy style pizza")
        return when (menu) {
            PizzaMenu.CHEESE -> CheesePizza()
            PizzaMenu.GREEK -> GreekPizza()
            PizzaMenu.PEPPERONI -> PepperoniPizza()
        }
    }
}
