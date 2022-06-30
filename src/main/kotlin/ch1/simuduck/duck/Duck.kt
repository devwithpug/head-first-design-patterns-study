package ch1.simuduck.duck

import ch1.simuduck.behavior.FlyBehavior
import ch1.simuduck.behavior.QuackBehavior

abstract class Duck(
    private val flyBehavior: FlyBehavior,
    private val quackBehavior: QuackBehavior
) {
    open val name
        get() = "duck"

    fun fly() = flyBehavior.fly()

    fun quack() = quackBehavior.quack()
}
