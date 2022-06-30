package ch1.simuduck.duck

import ch1.simuduck.behavior.FlyNoWay
import ch1.simuduck.behavior.MuteQuack

class DecoyDuck : Duck(
    flyBehavior = FlyNoWay(),
    quackBehavior = MuteQuack(),
) {
    override fun display() {
        println("decoy duck")
    }
}
