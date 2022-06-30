package ch1.simuduck

class DecoyDuck : Duck() {

    override fun display() {
        println("decoy duck")
    }

    override fun quack() {
        // DO NOTHING
    }

    override fun fly() {
        // DO NOTHING
    }
}
