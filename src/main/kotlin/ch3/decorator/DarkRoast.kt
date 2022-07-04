package ch3.decorator

class DarkRoast : Beverage() {

    override val description: String = "dark roast"

    override fun cost(): Double {
        return 4.5
    }
}
