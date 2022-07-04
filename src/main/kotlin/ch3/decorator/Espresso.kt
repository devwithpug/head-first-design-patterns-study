package ch3.decorator

class Espresso : Beverage {

    private val cost: Double = 3.5
    private val description: String = "espresso"

    override fun description(): String {
        return description
    }

    override fun cost(): Double {
        return cost
    }
}
