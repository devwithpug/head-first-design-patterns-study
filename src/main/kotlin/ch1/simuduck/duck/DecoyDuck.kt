package ch1.simuduck.duck

import ch1.simuduck.behavior.FlyNoWay
import ch1.simuduck.behavior.MuteQuack

class DecoyDuck : Duck(
    flyBehavior = FlyNoWay(),
    quackBehavior = MuteQuack(),
) {
    override val name
        get() = "decoy duck"
}
