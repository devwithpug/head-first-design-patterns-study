package ch3.decorator

class Espresso : Beverage() {

    private val cost: Double = 3.5
    override val description: String = "espresso"

    override fun cost(): Double {
        return super.cost() + cost
    }
}
