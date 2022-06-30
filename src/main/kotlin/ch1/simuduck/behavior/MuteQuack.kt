package ch1.simuduck.behavior

class MuteQuack : QuackBehavior {
    override fun quack() = throw UnsupportedOperationException()
}
