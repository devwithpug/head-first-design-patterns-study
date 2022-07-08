package ch4.factory

class ItalyPizzaStore : OrderService() {

    private val italyPizzaFactory = ItalyPizzaFactory()

    override fun createPizza(menu: PizzaMenu): Pizza {
        return italyPizzaFactory.createPizza(menu)
    }
}
