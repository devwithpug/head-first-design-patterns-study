package ch3.decorator

class HouseBlend : Beverage {

    private val cost: Double = 4.8
    private val description: String = "house blend"

    override fun description(): String {
        return description
    }

    override fun cost(): Double {
        return cost
    }
}
