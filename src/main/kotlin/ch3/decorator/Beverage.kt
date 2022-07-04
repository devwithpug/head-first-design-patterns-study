package ch3.decorator

abstract class Beverage {

    abstract val description: String
    var milk: Boolean = false
    var soy: Boolean = false
    var mocha: Boolean = false
    var whip: Boolean = false

    open fun cost(): Double {
        var totalCost = 0.0
        if (milk) {
            totalCost += 0.3
        }
        if (soy) {
            totalCost += 0.4
        }
        if (mocha) {
            totalCost += 0.5
        }
        if (whip) {
            totalCost += 0.6
        }
        return totalCost
    }
}
