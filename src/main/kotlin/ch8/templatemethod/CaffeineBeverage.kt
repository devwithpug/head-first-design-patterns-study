package ch8.templatemethod

abstract class CaffeineBeverage {

    fun prepareRecipe() {
        boilWater()
        brew()
        pourInCup()
        addCondiments()
    }

    abstract fun brew()

    abstract fun addCondiments()

    private fun boilWater() {
        println("boiling water...")
    }

    private fun pourInCup() {
        println("pouring in a cup...")
    }
}
