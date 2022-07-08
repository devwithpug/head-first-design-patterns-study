package ch4.factory

class NewYorkPizzaFactory : PizzaFactory {
    override fun createPizza(menu: PizzaMenu): Pizza {
        println("create... new york style pizza")
        return when (menu) {
            PizzaMenu.CHEESE -> CheesePizza()
            PizzaMenu.GREEK -> GreekPizza()
            PizzaMenu.PEPPERONI -> PepperoniPizza()
        }
    }
}
