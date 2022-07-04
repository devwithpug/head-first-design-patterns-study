package ch1.strategy.duck

import ch1.strategy.behavior.FlyNoWay
import ch1.strategy.behavior.Squeak

class RubberDuck : Duck(
    flyBehavior = FlyNoWay(),
    quackBehavior = Squeak(),
) {
    override val name
        get() = "rubber duck"
}
