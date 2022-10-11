package ch8.templatemethod

abstract class CaffeineBeverage {

    abstract fun prepareRecipe()

    fun boilWater() {
        println("boiling water...")
    }

    fun pourInCup() {
        println("pouring in a cup...")
    }
}
