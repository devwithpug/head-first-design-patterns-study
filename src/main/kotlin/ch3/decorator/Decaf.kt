package ch3.decorator

class Decaf : Beverage() {

    private val cost: Double = 5.0
    override val description: String = "decaf"

    override fun cost(): Double {
        return super.cost() + cost
    }
}
