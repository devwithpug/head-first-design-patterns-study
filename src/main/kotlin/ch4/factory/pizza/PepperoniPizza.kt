package ch4.factory.pizza

class PepperoniPizza : Pizza {

    override fun prepare() {
        println("prepare... pepperoni pizza")
    }

    override fun bake() {
        println("bake... pepperoni pizza")
    }

    override fun cut() {
        println("cut... pepperoni pizza")
    }

    override fun box() {
        println("box... pepperoni pizza")
    }
}
