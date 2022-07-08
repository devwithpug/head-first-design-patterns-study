package ch4.factory

class NewYorkPizzaStore : OrderService() {

    private val newYorkPizzaFactory = NewYorkPizzaFactory()

    override fun createPizza(menu: PizzaMenu): Pizza {
        return newYorkPizzaFactory.createPizza(menu)
    }
}
