package ch4.factory.pizza

abstract class OrdinaryPizza(
    val name: String,
    private val dough: String,
    private val sauce: String,
    private val toppings: List<String>
) : Pizza {

    override fun prepare() {
        println("prepare... $name")
        println("stretch dough...")
        println("spread sauce...")
        println("toppings:")
        toppings.forEach { topping -> println("\t$topping") }
    }

    override fun bake() {
        println("bake... $name")
    }

    override fun cut() {
        println("cut... $name")
    }

    override fun box() {
        println("box... $name")
    }
}
