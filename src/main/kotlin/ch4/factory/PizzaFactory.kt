package ch4.factory

interface PizzaFactory {
    fun createPizza(menu: PizzaMenu): Pizza
}
