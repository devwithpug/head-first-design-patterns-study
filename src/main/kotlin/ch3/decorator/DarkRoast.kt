package ch3.decorator

class DarkRoast : Beverage {

    private val cost: Double = 4.5
    private val description: String = "dark roast"

    override fun description(): String {
        return description
    }

    override fun cost(): Double {
        return cost
    }
}
