package ch1.strategy.behavior

class FlyNoWay : FlyBehavior {
    override fun fly() = throw UnsupportedOperationException()
}
