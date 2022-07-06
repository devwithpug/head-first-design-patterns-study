package ch4.factory

class CheesePizza : Pizza {

    override fun prepare() {
        println("prepare... cheese pizza")
    }

    override fun bake() {
        println("bake... cheese pizza")
    }

    override fun cut() {
        println("cut... cheese pizza")
    }

    override fun box() {
        println("box... cheese pizza")
    }
}
