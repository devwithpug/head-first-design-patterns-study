package ch4.factory

interface PizzaFactory {
    fun createPizza(type: String): Pizza
}
