package ch1.simuduck

class RubberDuck : Duck() {

    override fun display() {
        println("rubber duck")
    }

    override fun quack() {
        println("beep")
    }

    override fun fly() {
        // DO NOTHING
    }
}
