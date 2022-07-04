package ch3.decorator

class Decaf : Beverage {

    private val cost: Double = 5.0
    private val description: String = "decaf"

    override fun description(): String {
        return description
    }

    override fun cost(): Double {
        return cost
    }
}
