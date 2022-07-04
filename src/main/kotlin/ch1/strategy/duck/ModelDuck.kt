package ch1.strategy.duck

import ch1.strategy.behavior.FlyNoWay
import ch1.strategy.behavior.Quack

class ModelDuck : Duck(
    flyBehavior = FlyNoWay(),
    quackBehavior = Quack(),
) {
    override val name
        get() = "model duck"
}
