package ch1.simuduck.duck

import ch1.simuduck.behavior.FlyBehavior
import ch1.simuduck.behavior.QuackBehavior

abstract class Duck(
    private var flyBehavior: FlyBehavior,
    private var quackBehavior: QuackBehavior
) {
    abstract val name: String

    fun performFly() = flyBehavior.fly()

    fun performQuack() = quackBehavior.quack()

    fun setFlyBehavior(fb: FlyBehavior) {
        flyBehavior = fb
    }

    fun setQuackBehavior(qb: QuackBehavior) {
        quackBehavior = qb
    }
}
