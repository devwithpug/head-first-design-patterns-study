package ch3.decorator

class Espresso : Beverage() {

    override val description: String = "espresso"

    override fun cost(): Double {
        return 3.5
    }
}
