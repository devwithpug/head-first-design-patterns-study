package ch3.decorator

class HouseBlend : Beverage() {

    override val description: String = "house blend"

    override fun cost(): Double {
        return 4.8
    }
}
