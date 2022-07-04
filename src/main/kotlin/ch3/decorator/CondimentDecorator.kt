package ch3.decorator

sealed class CondimentDecorator : Beverage

class Milk(private val beverage: Beverage) : CondimentDecorator() {
    private val cost: Double = 0.11
    private val description = "milk"

    override fun description(): String {
        return "${beverage.description()}, $description"
    }

    override fun cost(): Double {
        return beverage.cost() + cost
    }
}
class Mocha(private val beverage: Beverage) : CondimentDecorator() {
    private val cost: Double = 0.12
    private val description = "mocha"

    override fun description(): String {
        return "${beverage.description()}, $description"
    }

    override fun cost(): Double {
        return beverage.cost() + cost
    }
}
class Soy(private val beverage: Beverage) : CondimentDecorator() {
    private val cost: Double = 0.13
    private val description = "soy"

    override fun description(): String {
        return "${beverage.description()}, $description"
    }

    override fun cost(): Double {
        return beverage.cost() + cost
    }
}
class Whip(private val beverage: Beverage) : CondimentDecorator() {
    private val cost: Double = 0.14
    private val description = "whip"

    override fun description(): String {
        return "${beverage.description()}, $description"
    }

    override fun cost(): Double {
        return beverage.cost() + cost
    }
}
