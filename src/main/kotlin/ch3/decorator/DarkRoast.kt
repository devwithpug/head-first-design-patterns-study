package ch3.decorator

class DarkRoast : Beverage() {

    private val cost: Double = 4.5
    override val description: String = "dark roast"

    override fun cost(): Double {
        return super.cost() + cost
    }
}
