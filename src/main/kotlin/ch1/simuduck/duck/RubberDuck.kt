package ch1.simuduck.duck

import ch1.simuduck.behavior.FlyNoWay
import ch1.simuduck.behavior.Squeak

class RubberDuck : Duck(
    flyBehavior = FlyNoWay(),
    quackBehavior = Squeak(),
) {
    override val name
        get() = "rubber duck"
}
