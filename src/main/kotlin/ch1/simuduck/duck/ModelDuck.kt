package ch1.simuduck.duck

import ch1.simuduck.behavior.FlyNoWay
import ch1.simuduck.behavior.Quack

class ModelDuck : Duck(
    flyBehavior = FlyNoWay(),
    quackBehavior = Quack(),
) {
    override val name
        get() = "model duck"
}
