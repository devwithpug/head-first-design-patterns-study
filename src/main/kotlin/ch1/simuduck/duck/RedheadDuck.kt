package ch1.simuduck.duck

import ch1.simuduck.behavior.FlyWithWings
import ch1.simuduck.behavior.Quack

class RedheadDuck : Duck(
    flyBehavior = FlyWithWings(),
    quackBehavior = Quack(),
) {
    override val name
        get() = "redhead duck"
}
