package ch1.strategy.behavior

class MuteQuack : QuackBehavior {
    override fun quack() = throw UnsupportedOperationException()
}
