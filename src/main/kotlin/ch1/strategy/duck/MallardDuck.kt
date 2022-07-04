package ch1.strategy.duck

import ch1.strategy.behavior.FlyWithWings
import ch1.strategy.behavior.Quack

class MallardDuck : Duck(
    flyBehavior = FlyWithWings(),
    quackBehavior = Quack(),
) {
    override val name
        get() = "mallard duck"
}
