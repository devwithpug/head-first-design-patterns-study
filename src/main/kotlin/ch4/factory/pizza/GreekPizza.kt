package ch4.factory.pizza

class GreekPizza : Pizza {

    override fun prepare() {
        println("prepare... greek pizza")
    }

    override fun bake() {
        println("bake... greek pizza")
    }

    override fun cut() {
        println("cut... greek pizza")
    }

    override fun box() {
        println("box... greek pizza")
    }
}
