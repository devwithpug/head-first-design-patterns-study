package ch1.strategy.duck

import ch1.strategy.behavior.FlyNoWay
import ch1.strategy.behavior.MuteQuack

class DecoyDuck : Duck(
    flyBehavior = FlyNoWay(),
    quackBehavior = MuteQuack(),
) {
    override val name
        get() = "decoy duck"
}
