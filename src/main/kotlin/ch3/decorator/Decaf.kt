package ch3.decorator

class Decaf : Beverage() {

    override val description: String = "decaf"

    override fun cost(): Double {
        return 5.0
    }
}
