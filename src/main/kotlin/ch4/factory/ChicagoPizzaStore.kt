package ch4.factory

class ChicagoPizzaStore : OrderService() {

    private val chicagoPizzaFactory = ChicagoPizzaFactory()

    override fun createPizza(menu: PizzaMenu): Pizza {
        return chicagoPizzaFactory.createPizza(menu)
    }
}
