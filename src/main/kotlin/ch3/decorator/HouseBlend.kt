package ch3.decorator

class HouseBlend : Beverage() {

    private val cost: Double = 4.8
    override val description: String = "house blend"

    override fun cost(): Double {
        return super.cost() + cost
    }
}
