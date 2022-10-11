package ch8.templatemethod

abstract class CaffeineBeverage {

    fun prepareRecipe() {
        boilWater()
        brew()
        pourInCup()
        if (customerWantsCondiments()) {
            addCondiments()
        }
    }

    abstract fun brew()

    abstract fun addCondiments()

    open fun customerWantsCondiments() = true

    private fun boilWater() {
        println("boiling water...")
    }

    private fun pourInCup() {
        println("pouring in a cup...")
    }
}
