package ch4.factory.pizza

abstract class OrdinaryPizza(private val name: String) : Pizza {

    override fun prepare() {
        println("prepare... $name")
    }

    override fun bake() {
        println("bake... $name")
    }

    override fun cut() {
        println("cut... $name")
    }

    override fun box() {
        println("box... $name")
    }
}
