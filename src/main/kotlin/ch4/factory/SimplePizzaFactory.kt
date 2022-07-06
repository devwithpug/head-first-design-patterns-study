package ch4.factory

class SimplePizzaFactory : PizzaFactory {

    override fun createPizza(menu: PizzaMenu) =
        when (menu) {
            PizzaMenu.CHEESE -> CheesePizza()
            PizzaMenu.GREEK -> GreekPizza()
            PizzaMenu.PEPPERONI -> PepperoniPizza()
        }
}
