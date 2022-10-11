package ch8.templatemethod

import kotlin.random.Random

class Coffee : CaffeineBeverage() {

    override fun brew() {
        println("brewing coffee with a filter...")
    }

    override fun addCondiments() {
        println("brewing coffee with a filter...")
    }

    override fun customerWantsCondiments(): Boolean {
        return Random.nextBoolean()
    }
}
